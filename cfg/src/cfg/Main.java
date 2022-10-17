/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       System.out.println("Control Flow Graph\n\n");
       System.out.println("Enter the directory of a C source code file\n");
       String fileName;                         // F:\\Downloads\\CFG-master\\test.txt
       Scanner input = new Scanner(System.in);
       fileName = input.next();
       SourceCodeReader Sc;                
       Sc = new SourceCodeReader(fileName);
       System.out.println("Enter your choice\n");
        System.out.println("1.Statement Coverage\n2.Branch Coverage\n3.Decision Coverage\n");
       
       
       int in=input.nextInt();
       if(in==1)
       {
           System.out.println("Statement coverage choose");
       }
        if(in==2)
       {
           System.out.println("Branch coverage choose");
       }
         if(in==3)
       {
           System.out.println("Decision coverage choose");
       }
    }  
}
