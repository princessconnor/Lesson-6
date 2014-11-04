/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Connor
 */
//make the book object
public class book 
{
    private String Name, author;
    public book(String a,String b)
    {
        Name = a;
        author = b;
    }
    //return the title of the book
    public String getTitle()
    {
        return Name;
    }
}
