/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetaskone_;

/**
 *
 * @author lab_services_student
 */
public class IceTaskOne_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Main class
        // Instantiate two objects
    Bird brd = new Bird(); // bird object
    Reptile rept = new Reptile(); // reptile object

        // Input values for the objects
            System.out.println("Input data for bird:");
                brd.input();
            System.out.println("Input data for reptile:");
                rept.input();

        // Output values for the objects
            System.out.println("\nOutput data for bird:");
                brd.output();
            System.out.println("\nOutput data for reptile:");
                rept.output();
  }
}
    
    

