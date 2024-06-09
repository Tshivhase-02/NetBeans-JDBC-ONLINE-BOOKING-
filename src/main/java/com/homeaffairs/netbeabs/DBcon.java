
package com.homeaffairs.netbeabs;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBcon {

    static final String url = "jdbc:mysql://localhost:3306/javaprojects";
    static final String user = "root";
    static final String password = "";
   
  public static void main(){
        //

         
      Connection con = null;
    
         try {
               
             con = DriverManager.getConnection(url, user, password);
             
             
             if(con != null){
             
               System.out.println("QUERY IS EXECUTED \n");
             
             }else{
         
            System.out.println(" not found!!!! \n");
         
         }
            /* PreparedStatement stm = con.prepareStatement("");
                  //stm.setString(1, Fname);
                  //stm.setString(2, Lname);
                  //stm.setInt(3, identity);
              stm.execute();
*/
 
            
              System.out.println("QUERY IS EXECUTED \n");
             con.close();

    
         } catch (Exception e) {
            
           e.printStackTrace();
         
 }


    }

}