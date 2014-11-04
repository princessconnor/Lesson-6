/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Connor
 */
//this is the class for the person borrowing books(patron)
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
        //see if book is in stock
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
        //borow book    
        public boolean lend (book b)
            {
                //make sure that the book can be borrowed 
                boolean canbeborrowed = (b1 == null || b2 == null ||b3 ==null);
                if (canbeborrowed)
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
           
                //retur the book name method 
            public String BookName()
            {
                return Name;
            }
           //this method returns the book
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

