
package Output;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import javax.swing.JOptionPane;
public class Output {

   
    public static void main(String[] args) throws Exception {
        
        Coordinator coordinator=new Coordinator();
        Instructor instructor=new Instructor();
        Course course=new Course();
        Session session=new Session();
        Student student=new Student();
        SSystem sssystem=new SSystem();
//        Student max [] = new Student[12];
        

       
        
         



//v5.maxOfStudents(max);


//        student.set_firstName("Aml ahmed");
//        String name=student.get_firstName();
//        student.set_phoneNumber("0109876875");
//        String phone=student.get_phoneNumber();
//        student.setId(10);
//        int id =student.getId();
//        sssystem.setStudentAttendance("came");
//        String stdAttendance=sssystem.getStudentAttendance();
             
//         try{
//         String host ="jdbc:derby://localhost:1527/sstudent";
//         String uName="user1";
//         String uPass="111";
//        
//       
//       Connection con = DriverManager.getConnection(host,uName,uPass );
//       
//       Statement stmt = con.createStatement( );
//       String SQL1 = "insert into eroll (id,name,phonenumber)values(?,?,?)";
//       //String SQL1="SELECT*FROM eroll";
//       String SQL2 = "insert into instructorInformation (id,name,course_Name)values(?,?,?)";
//       String SQL3 = "insert into instructorAttendance (id,name,courseName,state)values(?,?,?,?)";
//       String SQL4 = "insert into studentAttendance (id,state)values(?,?)";
//       PreparedStatement ps1=con.prepareStatement(SQL1);
//       PreparedStatement ps2=con.prepareStatement(SQL2);
//       PreparedStatement ps3=con.prepareStatement(SQL3);
//       PreparedStatement ps4=con.prepareStatement(SQL4);
//       ps1.setInt(1, id);
//       ps1.setString(2, name);
//       ps1.setString(3, phone);
//       
//       ps2.setInt(1,instructorId);
//       ps2.setString(2, instructorName);
//       ps2.setString(3, intsructorCourseName);
//     
//       
//       ps3.setInt(1,instructorId);
//       ps3.setString(2, instructorName);
//       ps3.setString(3, intsructorCourseName);
//       ps3.setString(4, instructorAttendance);
//       
//       ps4.setInt(1, id);
//       ps4.setString(2,stdAttendance);
//       
//       //ResultSet rs = stmt.executeQuery( SQL );
//       ps1.executeUpdate();
//       ps2.executeUpdate();
//       ps3.executeUpdate();
//       ps4.executeUpdate();
//       System.out.println("Success");
//         }
//         catch ( SQLException err ) {
//        System.out.println( err.getMessage( ) );
//    }
        coordinator.setUserName(); 
        String useer=coordinator.getUserName(); 
        System.out.println("UserName of The Student: "+useer);
        coordinator.setPassword(); 
        String password=coordinator.getPassword(); 
        System.out.println("PassWord of The Student:"+password);
        String courseName= course.SetName();
        coordinator.available();
        int room=coordinator.getRoom("java");   
        System.out.println("Room Number OF The Course Sessions :"+room);
        int period= coordinator.CoursePeriod("java"); 
        System.out.println("Course Period:"+period);
        int noOfSession=coordinator.NofSessions("java");
        System.out.println("No Of Sessions ="+noOfSession);
        System.out.println("********************************************");
        System.out.println("Instructor Information");
        instructor.setName();
        String instructorName=instructor.getName();
        System.out.println("The Instructor Name :"+instructorName);
        instructor.setAddress();
        String address=instructor.getAddress();
        System.out.println("The Instructor Address:"+address);
        instructor.setId(7); //ok
        int instructorId=instructor.getId();
        instructor.setAge();
        int age=instructor.getAge();
        System.out.println("The Instructor Age :"+age);
        instructor.setCourseInstructorTeach(); 
        String intsructorCourseName=instructor.getCourseInstructorTeach(); 
        System.out.println("The instructor teaches:"+intsructorCourseName);
        coordinator.setInstructorNumberOfHours();  
        double noOfHours=coordinator.getInstructorNumberOfHours(); 
        System.out.println("Instructor Number Of Hour:"+noOfHours);
        coordinator.setInstructorRatePerHour(); 
        double rateHour=coordinator.getInstructorRatePerHour(); 
        System.out.println("Instructor Rate Per Hour "+ rateHour);
        System.out.println("********************************************");
        student.login();
        student.completeEvaluation();
       instructor.setInstructorAttendance(); 
       String instructorAttendance=instructor.getInstructorAttendance(); 
       System.out.println("The instructor attendance is:"+instructorAttendance);
       instructor.studentAttendance();

        
        
    }
    
}
