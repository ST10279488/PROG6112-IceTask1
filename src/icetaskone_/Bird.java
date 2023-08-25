/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetaskone_;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */

    // Derived class Bird from Animal
class Bird extends Animal {
    
    public int colour; // field for the feather colour
        // input method to read data from user
    public void input() {
        super.input(); // call the base class input method
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter colour (1=grey, 2=white, 3=black): ");
            colour = sc.nextInt();
  }
  // output method to display data to user
  public void output() {
    super.output(); // call the base class output method
    System.out.print("Colour: ");
    switch (colour) {
      case 1:
        System.out.println("grey");
        break;
      case 2:
        System.out.println("white");
        break;
      case 3:
        System.out.println("black");
        break;
      default:
        System.out.println("invalid");
    }
  }
}
    

