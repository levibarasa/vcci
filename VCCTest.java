/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vcctest;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
/**
 *
 * @author levi
 */
public class VCCTest {
   /**
     * @param args the command line arguments
     */
    static String csvFile = "/Users/levi/NetBeansProjects/VCCTest/src/vcctest/customer.csv";
    static String cvsSplitBy = ",";
    public static void main(String[] args) {
        getAllCustomers(); 
    }
    public static List getNameAndAgeOver18(){
    List name_age = new ArrayList<>(); 
        BufferedReader br = null;
         String line = "";
         int age = 0;
          try {
         br = new BufferedReader(new FileReader(csvFile));
          while ((line = br.readLine()) != null) {
            // use comma as separator
                String[] country = line.split(cvsSplitBy);
               age = Integer.parseInt(country[2].substring(0, 4));
               if(age > 18){
                    System.out.print(country[0]+","+country[2]);
              name_age.add(Arrays.asList(country[0]+","+country[2]));
               }
                }
              } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    return name_age;
     }
    
    
    public static List getAllCustomers(){
    List customers = new ArrayList<>();
        BufferedReader br = null;
         String line = "";
          try {
         br = new BufferedReader(new FileReader(csvFile));
          while ((line = br.readLine()) != null) {
            // use comma as separator
                String[] country = line.split(cvsSplitBy);
              System.out.println(country[0] + " " + country[1]+ " " + country[2]+ " " + country[3]+ " " + country[4]);
              customers.add(Arrays.asList(country));
                }
              } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return customers;
    }
    public static String getEmailAddresses(){
        String emails ="";
        BufferedReader br = null;
         String line = "";
          try {
         br = new BufferedReader(new FileReader(csvFile));
          while ((line = br.readLine()) != null) {
            // use comma as separator
                String[] country = line.split(cvsSplitBy);
              System.out.print(country[3]+",");
              emails = country[3]+",";
                }
              } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    return emails;
     }
//    public static String sendAgetoUnder18(){
//        String success ="";   
//        String host = "smtp.gmail.com";
//        String port = "587";
//        String mailFrom = "lvbarasa@gmail.com";
//        String password = "pass"; 
//         String subject = "Test";
//      Properties properties = new Properties();
//        properties.put("mail.smtp.host", host);
//        properties.put("mail.smtp.port", port);
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable", "true");
//        Authenticator auth = new Authenticator() {
//            public PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("Levi", "pass");
//            }
//        };
//       String msg = "<i>Hi friend! Keep safe during COVID-19</i><br>";
//        msg += "<b>Wish you a nice day!</b><br>";
//        msg += "<font color=red>Levi</font>"; 
//    BufferedReader br = null;
//         String line = ""; 
//         int age = 0;
//          try {
//         br = new BufferedReader(new FileReader(csvFile));
//          while ((line = br.readLine()) != null) {
//            // use comma as separator 
//                String[] country = line.split(cvsSplitBy);
//               age = Integer.parseInt(country[2].substring(0, 4));
//               
//               if(age < 18){
//                   String email = country[3];
//                    System.out.print("Email "+country[3]); 
//                    
//                    String mailTo = country[3];
//                    MimeMessage message = new MimeMessage(session); 
//                    msg.setFrom(new InternetAddress(userName));
//                    InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
//                    msg.setRecipients(Message.RecipientType.TO, toAddresses);
//                    msg.setSubject(subject);
//                    msg.setSentDate(new Date());
//                    // set plain text message
//                    msg.setContent(message, "text/html");
// 
//        // sends the e-mail
//        Transport.send(msg);
//                   
//                    Transport.send(message);
//               }
//                }
//              } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//          return success;
//    }
    //time in secs
//    public static float  getTimeToSendMail(){
//        String success ="";  
//      String host = "localhost";
//      Properties properties = System.getProperties(); 
//      properties.setProperty("mail.smtp.host", host);
//       String msg = "<i>Hi friend! Keep safe during COVID-19</i><br>";
//        msg += "<b>Wish you a nice day!</b><br>";
//        msg += "<font color=red>Levi</font>";
//        
//        BufferedReader br = null;
//         String line = "";
//         int age = 0;
//         float timeTake = 0;
//         long stop = 0;
//          try {
//              long start = System.currentTimeMillis();
//         br = new BufferedReader(new FileReader(csvFile));
//          while ((line = br.readLine()) != null) {
//            // use comma as separator 
//                String[] country = line.split(cvsSplitBy);
//               age = Integer.parseInt(country[2].substring(0, 4));
//               
//               if(age < 18){
//                   String email = country[3];
//                    System.out.print("Email "+country[3]); 
//                    MimeMessage message = new MimeMessage(session); 
//                    message.setContent(message, "text/html");
//                    message.setFrom("lvbarasa@gmail.com"); 
//                    message.addRecipient(Message.RecipientType.TO, email); 
//                    message.setSubject("Regards"); 
//                    message.setText(msg); 
//                   
//                    Transport.send(message); 
//               }
//               if(line == null){
//                stop = System.currentTimeMillis();
//               }
//                }
//           timeTake = (stop - start) / 1000F;  
//                
//              } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//          return timeTake;
//    }
    
}
