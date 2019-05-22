/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Ark Patel
 */
package studentinfo;
import java.util.Scanner;
/**
 *
 * @author ARK PATEL
 */
public class StudentInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        studentTester s1= new studentTester();
        studentTester s2= new studentTester();
        Scanner input=new Scanner(System.in);
        studentTester[] list=new studentTester[2];
        
        System.out.print("Enter first student name:");
        s1.setName(input.nextLine());
        System.out.println("Fisrt student is "+s1.getName());
        
        s2.setName("kalp");
        System.out.println("Second student is "+s2.getName());
        
        list[0]=s1;
        list[1]=s2;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName());
        }
    }
    
}
