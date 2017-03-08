
package finaaaaaaaaaal;

import java.util.Scanner;


public class SSystem {
    
    //String UserName;
    //String password;
    public String studentAttendance;
     

   
    //String Q1,Q2,Q3,Q4,Q5;
    
    

    void Run(Coordinator coord) {
        
        System.out.println("User Name and Password Must be your Phone Numper");
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String Password = input2.next();
        String myName=coord.getUserName();
        String myPassword=coord.getPassword();
        if ((username.equals(myName)) && (Password.equals(myPassword))) {

            System.out.println("Access Granted! Welcome!");
        } 
        else /*if (!(Password.equals(myPassword))&& !(username.equals(myName)))*/ {
            System.out.println("Invalid Username & Password!");
            
        } 

    }
    

    public void evaluation(String[] Qs ) {
        
        
        Qs[0]= "Question one:ما رأيك فى مواعيد الكورس ؟";
        Qs[1]= "Question two:مدى تطابق المحتوى المعلن للمحتوى المشروح ؟";
        Qs[2]= "Question three:مدى كفائة المحاضر ؟";
        Qs[3]= "Question four:مدى كفائة الاجهزة فى المعمل ؟";
        Qs[4]= "Question five:تعامل الموظفين فى المركز مع الطلاب ؟";
        
         

    
}
    

//public void setStudentAttendance(String stdAttendance){
    //this.studentAttendance=stdAttendance;
   //}

//public String getStudentAttendance(){
    //return studentAttendance;
}



   
//    public void studentAttendance ()
//    {
//       
//    
//        String stdAttendance;
//        System.out.println("Student Attendance For The Course");
//        Scanner scan=new Scanner(System.in);
//        int size1=coordinator.getMaxNumberOfStudent();
//        int size2=course.NofSessions();
//        String [][]studentAttendanceArray=new String[size1][size2];
//        System.out.println("Please Enter The Student ID And The number of session");
//        int currentStudentId=scan.nextInt();
//        int currentNumberOfSessionId=scan.nextInt();
//        System.out.println("STUDENT ATTENDANCE");
//        System.out.println("*****************************");
//        System.out.println("********************************");
//        System.out.println("Please Enter *Came* When The Student Took The Session And *Didn'tCome* When The Student Didn't Come And Leave It Empty If The Session Not Come" );
//        System.out.println("********************************");
//        
//        for(int i=0;i<size1;i++){
//            for(int j=0;j<size2;j++){
//                if(currentStudentId==i && currentNumberOfSessionId==j){
//                Scanner scan1=new Scanner(System.in);
//                String studentAttend=scan.next();
//        
//        switch(studentAttend){
//            
//            case "Came":
//                studentAttendance=studentAttend;
//                break;
//                
//            case "NotCame":
//                studentAttendance=studentAttend;
//                break;
//        
//            default:
//                
//            Exception e=new Exception("Not Formated Please Enter Came or NotCame only");
//            throw e;
//        }
//        
//          
//                }
//                
//            }
//        }
//        
//    }
        
        
    
    

