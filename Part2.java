/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part2;
import java.util.Scanner; 
import javax.swing.JOptionPane;

public class Part2 {

    public static String username,passWord,Firstname,Lastname;

public static boolean Checkusername(String username)
{
    return(username.contains("_") && username.length()<=5);
}
    public static void main(String[] args)
    {
        Scanner scan= new Scanner (System.in);
    
         boolean y= false;
         boolean z=false;
         
         while (y==false || z==false)
         {
         System.out.println("Enter username:");
         username=scan.nextLine();
         y= Checkusername(username);
         if(y==true)
         {
             System.out.println("Successfully Captured:");
         }
         else
         {
             System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore an is no more than 5 characters in length.");
         }
         
         System.out.println("Enter Password:");
         passWord=scan.nextLine();
         z=Checkpassword(passWord);
         if(z==true)
         {
             System.out.println("Successfully Captured:");
         }
        else
         {
             System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
         }
         }
         
         Scanner firstname= new Scanner (System.in);
         System.out.println("Enter First Name");
         Firstname = firstname.nextLine();
         
         
         Scanner lastname= new Scanner (System.in);
         System.out.println("Enter Last Name");
         Lastname = lastname.nextLine(); 

         boolean results= loginuser();
    }
     public  static boolean Passpassword(String password)
     {
      if(password.length()>7)
      {
       if(Checkpassword(password))
       {
           return true;
       }
       else
       {
           return false;
       }
      }
      else
      {
          return false;
      }
         
       
     }
     
     public static boolean Checkpassword(String password)
     {
         boolean hasNum=false; boolean hasCap=false; boolean hasLow=false; char x;
         for (int i=0; i<password.length(); i++)
         {
             x=password.charAt(i);
             if(Character.isDigit(x))
             {
              hasNum=true;
             }
             else if(Character.isUpperCase(x))
             {
                 hasCap=true;
             }
             else if(Character.isLowerCase(x))
             {
             hasLow=true;
             }
             if(hasNum && hasCap &&  hasLow)
             {
             return true;
         }
     }
     return false;
        
    } 
     public static boolean loginuser()
     {
         String userName = " ", password = " ";
         boolean result = false;
         while(!(username.equals(userName)&& passWord.equals(password)))
         {
         
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter username you used to register.");
       userName=scan.nextLine();
       scan=new Scanner(System.in);
       System.out.println("Enter the password you used to register.");
       password=scan.nextLine();
       if(username.equals(userName)&& passWord.equals(password))
           
       {
           
           System.out.println("Welcome "+ Firstname + Lastname +" it is great to see you again. ");
           System.out.println("Password "+passWord+" is correct.");
           result = true;
           if (result=true){
               int opt;
               int TaskNumber= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter The Number of Task You Want to Enter.")); 
               String Zero;
               String First;
               String Second;
               String Third;
               String Fourth;
               String Fifth;
               String Sixth; 
              
     
   

               
           for (int i=0; i<TaskNumber; i++){
               String [] Tasks= new String[TaskNumber];
               JOptionPane.showMessageDialog(null,"Enter task " + (i + 1) + ": ");
              
   
   
    
  
              
  
        do {
            JOptionPane.showMessageDialog(null,"Welcome to EasyKaban:");
            JOptionPane.showMessageDialog(null,"Option 1) Add Tasks");
            JOptionPane.showMessageDialog(null,"Option 2) Coming Soon");
            JOptionPane.showMessageDialog(null,"Option 3) Quit");
          
            
            // Read user input
            opt = Integer.parseInt(JOptionPane.showInputDialog(null)); 

            // Process user choice
            switch (opt) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Option 1) Add Tasks");
                    JOptionPane.showMessageDialog(null,"The TaskNumber is "+TaskNumber);
                    First=JOptionPane.showInputDialog(null,"Task name: The name of the task to be performed: Add Login Feature.");
                    Second=JOptionPane.showInputDialog(null,"Task description: Provide a description within fifty characters of length.");
                    Third=JOptionPane.showInputDialog(null,"Developer Details: Input First and Last Names");
                    Fourth=JOptionPane.showInputDialog(null,"Task Duration:");
                    Fifth=JOptionPane.showInputDialog(null,"Task ID.");
                    Sixth=JOptionPane.showInputDialog(null,"Task Status.");
                    JOptionPane.showMessageDialog(null,"Task Status is: "+ Sixth); 
                    JOptionPane.showMessageDialog(null,"Developer Details are: "+ Third);
                    JOptionPane.showMessageDialog(null,"Task number is " + First);
                    JOptionPane.showMessageDialog(null,"Task Description is "+Second);
                    JOptionPane.showMessageDialog(null,"Task ID is "+Fifth);
                    JOptionPane.showMessageDialog(null,"Task Duration is "+Fourth);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null,"Option 2) Coming Soon");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Option 3) Quit");
                    break;
                default:
            }
        } while (opt != 3);
           }
           }
                   
                  
           
       }
       else {
           System.out.println("Username or Password incorrect, please try again.");
           result = false;
       
       }
        

       
               
       
        
    }

         
        return result;
       
     } 
     

}
     
 


   
   
     



            
    
