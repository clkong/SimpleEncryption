/*
 *Sean Luo 02/10/2018
 *SimpleEncryption.java
 *This is progrem calculates the SimpleEncryption.
 */

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clkon
 */
public class SimpleEncryption {
     public static void main(String[] args) {
        String sentence,newsentence,number,direction;
        int number1,unicode,unicode1;     
        //sentence represent the phrase people enter
        //newsentence represent the phrase have changed
        //number represent the rotation amount
        //direction represent how to change the sentence
        //number1 represent how many numbers the unicode change
        //unicode represent the sentence is changed to unicode
        //unicode1 represent the unicode1 has changed
        sentence = JOptionPane.showInputDialog("This program will encrypt or decrypt a phrase using the\n"
                + "simple encryption method of rotating the letters.\n\n"
                + "Please enter a phrase");
        number = JOptionPane.showInputDialog("Enter the rotation amount (1 - 25)");
        number1 = Integer.parseInt(number);
        direction = JOptionPane.showInputDialog("1 - Encryption\n2 - Decryption");
        sentence = sentence.toUpperCase();
        if (direction.equals("1")) {
            if (number1 >= 1 && number1 <= 25) {
                newsentence = "";
                for (unicode = 0; unicode < sentence.length(); unicode++) {
                    unicode1 = (int) sentence.charAt(unicode);
                    if (unicode1 >= 65 && unicode1 <= 90) {
                        unicode1 += number1;
                        if (unicode1 > 90) {
                            unicode1 -= 26;
                        }
                    }
                    newsentence += (char) unicode1;
                }
                System.out.println("The original phrase is: " + sentence);
                System.out.println("The encrypted phrase is: " + newsentence);
            } else {
                System.out.println("Invalid rotation amount");
            }
        } else if (direction.equals("2")) {
            if (number1 >= 1 && number1 <= 25) {
                newsentence = "";
                for (unicode = 0; unicode < sentence.length(); unicode++) {
                    unicode1 = (int) sentence.charAt(unicode);
                    if (unicode1 >= 65 && unicode1 <= 90) {
                        unicode1 -= number1;
                        if (unicode1 < 65) {
                            unicode1 += 26;
                        }
                    }
                    newsentence += (char) unicode1;
                }
                System.out.println("The original phrase is: " + sentence);
                System.out.println("The decrypted phrase is: " + newsentence);
            } else {
                System.out.println("Invalid rotation amount");
            }
        } else {
            System.out.println("Invalid selection");
    }
    
}
}


