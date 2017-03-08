/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaaaaaaaaaal;

import java.util.Scanner;

/**
 *
 * @author elamir
 */
public class Student {
    
    private String name;
    private int i =0;
     private int id;
    private String phoneNumber;
    protected Student registeredStudents[]=new Student [12];
    public void  setId(int id){ 
        this.id= id;
        
    }
//    public void maxOfStudents(Student[]max)
//    {
//       
//        max[i]=this;
//        i++ ;
//    }
    public int getId()
    {
        return id;
    }
 
   public void setName(String name)
   {
       this.name = name;
   }
  
   public void set_phoneNumber(String num)
   {
       phoneNumber = num;   
   }
   public String getName()
   {
       return name;
   }
 
   public String get_phoneNumber()
   {
       return phoneNumber;
   }
    public void login()
   {
      String userName,password;
 
       Scanner input = new Scanner(System.in);
      System.out.println("Log in:");
      System.out.println("Enter UserName: ");
      userName = input.nextLine();
      System.out.println("Enter password: ");
      password = input.nextLine();
     
   }
   public void completeEvaluation()
   {         
      
        SSystem sys=new SSystem();
       String question[]= new String[5];
       sys.evaluation(question);
       Scanner s = new Scanner(System.in);
       String answer[] = new String[5];
        System.out.println("Complete the Evaluation");

        for (int i = 0; i < 5;i++)
        {    
            System.out.println(question[i]);
            answer[i] = s.nextLine();
        }
   }
    
  
   
}

    

    

