
package finaaaaaaaaaal;

import java.util.Scanner;


public class Coordinator extends Employee {
    
    public String password;
    public String userName;
    private double numberOfHours;
    public double ratePerHour;
    
    Course course=new Course ();
    
    @Override
    
    public double salary(){ 
    return super.salary;
    }
    
    public void  setInstructorNumberOfHours(){
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter Instructor NumberOfHours:");
        numberOfHours=scan.nextInt();
    }
    
    public double getInstructorNumberOfHours(){
        return numberOfHours;
    }
    
    public void setInstructorRatePerHour(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Instructor RatePerHour:");
        ratePerHour=scan.nextDouble();
    }
    public double getInstructorRatePerHour(){
        return ratePerHour;
    }
    
    public void setPassword(){
        System.out.println("The Student PhoneNumber :");
       Scanner scan=new Scanner(System.in);
        this.password=scan.next();
          
    }
    public String getPassword()
    {
        return  password;
    }
    
    public void setUserName(){
        
        System.out.println("The Student Name:");
        Scanner scan=new Scanner(System.in);
        this.userName=scan.next();
    }
    
    public String getUserName(){
        return userName;
    }
    
    public int getRoom(String name){
       course.name=name;
        int roomN=0;
    switch (course.name){
        case "java":
         roomN=330; 
        case "android":
         roomN=331; 
        case "c++":
         roomN=332; 
        case "c#":
         roomN=333; 
    }
    return roomN;
    }
    
      public  void available() throws Exception{
      
      String java=new String();
      String android=new String();
      String cplus=new String();
      String cHash=new String();
      java="Sunday From :1-4 & Tuesday From :4-7 & Thursay From :7-10";
      android ="Saturday From :9-12 & Monday From :12-3 & Wednesday From :3-6" ;
      cplus ="Sunday From :9-12 & Tuesday From :12-3 & Thursay From :3-6" ;
      cHash= "Saturday From :1-4 & Monday From :4-7 & Wednesday From :7-10" ;
          System.out.println("Courses Available :");
          System.out.println("JAVA:"+java);
          System.out.println("ANDROID:"+android);
          System.out.println("C++:"+cplus);
          System.out.println("C#:"+cHash);
 
    }
    public int NofSessions(String name){
    int NofSessions=0;
    switch(name)
        {
        case"java":
          NofSessions=81/3;
        case "android":
            NofSessions=90/3;
        case "c++":
            NofSessions=60/3;
        case "c#":
            NofSessions=78/3;
        }
      return NofSessions;
    }
      
      public static int CoursePeriod (String name){
    
        int CoursePeriod=0;
    switch (name){
        case "java":
            CoursePeriod=81;
            break;
        case "android":
            CoursePeriod=90;
            break;
        case "c++":
            CoursePeriod=60;
            break;
        case "c#":
            CoursePeriod=78;
            break;
        default :
            System.out.println("course is not valid");
    
    }
      return CoursePeriod;  
    }
      
      public int setMaxNumberOfStudent(){
          int maxNumberOfStudent=12;
          return maxNumberOfStudent;
          
      }
    
}
    

    


    

    

