/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Connor
 */
public class patron 
{
    String Name;
    book b1, b2, b3;
        public patron(String N)
        {
        Name = N;
        b1=null;
        b2=null;
        b3=null;
            
        }
        public boolean inStock (book b)
        {
            if (b1 == b)
            {
                return true;
            }
            else if (b2 ==b)
            {
                return true;
            }
            else if (b3 == b)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
            public boolean lend (book b)
            {
                boolean canborrow = (b1 == null || b2 == null ||b3 ==null);
                if (canborrow)
                {
                    if (b1==null)
                    {
                        b1=b;
                    }
                    else if (b2 == null )
                    {
                        b2 = b;
                    }
                    else 
                    {
                        b3 = b;
                    }
                    return true;
                    
                }
                else 
                {
                    return false;
                }
            }
           
                
            public String BookName()
            {
                return Name;
            }
            public boolean Return (book b)
            {
                if (inStock(b)) 
                {
                    if (b1 == b)
                    {
                        b1 =null;
                    }
                    else if (b2 == b)
                    {
                        b2 = null;
                    }
                    else 
                    {
                        b3 = null;
                        
                    }
                    return true;
                }
            return false;
            }
        }

