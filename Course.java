
package finaaaaaaaaaal;

import java.util.Scanner;


public class Course {
    
    String name;
    int room;
    public String SetName()throws Exception{
        String Names[]={"java","android","c++","c#"};
        System.out.println("The courses valid for the center are:JAVA , ANDROID , C++ , C#");
        System.out.println("The course you wanted:");
        Scanner scan=new Scanner(System.in);
        name=scan.next();
       
        
        switch (name){
            case "java":
                name="java";
                break;
            case "android":
                name="android";
                break;
            case"c++":
                name="c++";
                break;
            case"c#":
                name="c#";
                break;
            default:
         Exception e=new Exception("The entered is not valid");
            
            throw e;
        
        }
     return name;
    }
  
      }
   
    


