
package finaaaaaaaaaal;

import java.util.Scanner;


public class Instructor extends Employee {
    
  private int id;
  private double numberOfHours;
  private double ratePerHour;
  public String studentAttedance;
  public String instructorAttendance;
  public String courseName;
  Coordinator coordinator1=new Coordinator();
  Course course1 = new Course();

  public void setId(int id){
      
  
      this.id=id;
      
  }
  public int getId()
  {
      return id;
  }

  @Override
  public double salary(){  
      salary=((coordinator1.getInstructorNumberOfHours())*(coordinator1.getInstructorRatePerHour())); 
      return salary; 
      
  }
  
      
    public void setInstructorAttendance() throws Exception{
        
        System.out.println("THE INSTRUCTOR ATTENDANC");
        System.out.println("*****************************");
        System.out.println("************************");
        System.out.println("To Get The Attendance: Enter *start* At The Begining Of The Session \n *end* At The End Of The Session");
        System.out.println("*************************");
       Scanner scan=new Scanner(System.in);
       String attendance=scan.next();
        
        switch(attendance){
            
            case"start":
                instructorAttendance=attendance;
                break;
                
            case "end":
                instructorAttendance=attendance;
                break;
                
            default:
                Exception e=new Exception ("Not Available Please Enter Start Or End only");
                throw e;
                
        }
    }
    
   

    public String getInstructorAttendance() {
        return instructorAttendance;
    }
    
    public void setCourseInstructorTeach(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Course That You Teach:");
        this.courseName=scan.next();
        
    }
    
    public String getCourseInstructorTeach(){
        return courseName;
    }
   public void studentAttendance () throws Exception{

        String stdAttendance;
        System.out.println("Student Attendance For The Course");
        Scanner scan=new Scanner(System.in);
        int size1=12;
        String namee=course1.SetName();
        int size2=coordinator1.NofSessions(namee);
        String [][]studentAttendanceArray=new String[size1][size2];
        System.out.println("Please Enter The Student ID And The number of session");
        int currentStudentId=scan.nextInt();
        int currentNumberOfSessionId=scan.nextInt();
        System.out.println("STUDENT ATTENDANCE");
        System.out.println("*****************************");
        System.out.println("********************************");
        System.out.println("Please Enter *Came* When The Student Took The Session And *Didn'tCome* When The Student Didn't Come And Leave It Empty If The Session Not Come" );
        System.out.println("********************************");
        
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(currentStudentId==i && currentNumberOfSessionId==j){
                Scanner scan1=new Scanner(System.in);
                String studentAttend=scan.next();
        
        switch(studentAttend){
            
            case "came":
                stdAttendance=studentAttend;
                break;
                
            case "notcame":
                stdAttendance=studentAttend;
                break;
        
            default:
                
            Exception e=new Exception("Not Formated Please Enter Came or NotCame only");
            throw e;
        }
        
          
                }
                
            
    
}
        }
   }
}

    

    

