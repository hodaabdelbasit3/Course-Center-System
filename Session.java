/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaaaaaaaaaal;

/**
 *
 * @author elamir
 */
public class Session {
    
    String its_Own_Course;
    protected String start_Time;
    protected String end_Time;
    protected String session_Status;
    
    public void getStatusOfSession()
    {
        System.out.println("Status of the session "+session_Status);
        
    }
    public void setStatusOfSession(String status)
    {
       session_Status=status;
        
    }
     public void setStartTimeOfSession(String time)
    {
       start_Time=time;
        
    }
     
    public void getStartTimeOfSession()
    {
        System.out.println("Start time of the session "+start_Time);
        
    }
     
      void getEndTimeOfSession()
    {
        System.out.println("End time of the session "+end_Time);
        
    }
      
      void setEndTimeOfSession(String time)
    {
       end_Time=time;
        
    }
      
      
      void getNameOfItsCourse()
      {
          System.out.println("Course of the session "+its_Own_Course);
      }
      
      
      void setNameOfItsCourse(String courseName)
      {
          its_Own_Course=courseName;
      }
    
    
    


}

    

    

