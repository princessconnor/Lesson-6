
import TerminalIO.KeyboardReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class MakeEmployees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  KeyboardReader kr = new KeyboardReader();
  String name = kr.readLine("Enter Name-> ");
        System.out.println("the name is: " + name);
    }
    
}
