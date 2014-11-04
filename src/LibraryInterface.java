/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author conn6070
 */
public class LibraryInterface 
{
    public static void main (String[] args)
    {
        book b1, b2, b3, b4, b5;
        b1 = new book("From Russia With Love", "Greg Hines");
        b2 = new book("Living Smart", "Rita Langill");
        b3 = new book("Singing in the Rain", "Harry Connor");
        b4 = new book("Good Housekeeping", "Pat Burns");
        b5 = new book("To Be a Model", "Lisa Lahey");
        System.out.println("Here are the books available-> ");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        patron p = new patron ("Miles Davis");
         
        System.out.println("Lending 4 books to " + p.BookName());
        if(p.lend(b1)) System.out.println (b1.getTitle()+ " successfully borrowed.");
        else            
        {
            System.out.println (b1.getTitle()+ " could not be borrowed.");
        }
        
        if(p.lend(b2)) System.out.println (b2.getTitle() + " successfully borrowed.");
        else   
        {
            System.out.println (b2.getTitle() + " could not be borrowed.");
        }
        
        if(p.lend(b3)) System.out.println (b3.getTitle() + " successfully borrowed.");
        else
        {
            System.out.println (b3.getTitle() + " could not be borrowed.");
        }
        
        
        if(p.lend(b4)) System.out.println (b4.getTitle() + " successfully borrowed.");
        else             System.out.println (b4.getTitle() + " could not be borrowed.");
        
        System.out.println("------\nAttempting to return the first book:\n---------");
        if(p.Return(b1)) System.out.println(b1.getTitle() + " successfully returned.");
        else      
        {
            System.out.println(b1.getTitle() + " was not borrowed out.");
        }
            System.out.println("------\nHere is a list of books currently lent to " + p.BookName());
        if (p.inStock(b1)) System.out.println(b1);
        if (p.inStock(b2)) System.out.println(b2);
        if (p.inStock(b3)) System.out.println(b3);
        if (p.inStock(b4)) System.out.println(b4);
        if (p.inStock(b5)) System.out.println(b5);
}
}
