
package finaaaaaaaaaal;

import java.util.Scanner;


public abstract class Employee {
    
    public String name;
    protected double salary;
    private String address;
    private int age;
   
    
    public void setName()throws Exception{
        
//        String pattern="[A-Z]([a-z ]+)";
//        if(employeeName.matches(pattern)){
//            name=employeeName;
//        }
//        else{
//            Exception e=new Exception("Name Is Not Formated");
//            throw e;
//        }
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter Your Name:");
          this.name=scan.next();
        
    }
    
    public String getName(){ 
        return name;
    }
   
    
    
    
    abstract public double salary();
    
    public void setAddress(){ 
        
        System.out.println("Enter Your Address:");
        Scanner scan=new Scanner(System.in);
        this.address=scan.next();
        
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAge(){
    Scanner scan=new Scanner (System.in);
        System.out.println("Enter your Age:");
    this.age=scan.nextInt();
        
    }
    
    public int getAge(){
        return age;
    }
    

    
}

