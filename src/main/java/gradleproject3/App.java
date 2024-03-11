/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleproject3;
 import javax.swing.*;
public class App {
     
    

    public static void main(String[] args) {
        
    
        SwingUtilities.invokeLater(() -> {
            
                String studentNumber = JOptionPane.showInputDialog("Enter Student Number");
                String name = JOptionPane.showInputDialog("Enter Name");
                String surname = JOptionPane.showInputDialog("Enter Surname");
                String email = JOptionPane.showInputDialog("Enter Email");
                String phoneNumber = JOptionPane.showInputDialog("Enter Phone Number");
                int mark1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark 1"));
                int mark2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark 2"));
                int assignmentMark = Integer.parseInt(JOptionPane.showInputDialog("Enter Assignment Mark"));
                int examMark = Integer.parseInt(JOptionPane.showInputDialog("Enter Exam Mark"));
                
                boolean dpStatus = ((mark1 + mark2 + assignmentMark) / 3) >= 40;
                
                double courseworkAverage = (mark1 +mark2 + assignmentMark) / 3;
                double finalMark = (courseworkAverage * 0.4) + (examMark * 0.6);
                
                if(finalMark >= 0 && finalMark <= 46){
                    System.out.println("Fail");
                }
                else if(finalMark>= 47 && finalMark <= 49){
                    System.out.println("Sup");
                }else if(finalMark >= 50 && finalMark <= 74) {
                    System.out.println("Pass");
                }else if(finalMark >= 75 && finalMark <= 100){
                    System.out.println("Distinction");
                }
                
                
               
                String message = "Student Number: " + studentNumber +"\n"
                        + "Name: " + name + "\n"
                        + "Email: " + email + "\n"
                        + "Phone Number: " + phoneNumber + "\n"
                        + "Mark one: " + mark1 + "\n"
                        + "Mark two: " +mark2 + "\n"
                        + "Assignment mark: " + assignmentMark +"\n"
                        + "DP Status: " + dpStatus + "\n"
                        + "Final Mark: " + finalMark + "\n";
                JOptionPane.showMessageDialog(null, message);
            
        });
    }
}

