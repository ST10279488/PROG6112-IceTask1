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

    // Derived class Reptile from Animal
class Reptile extends Animal {
    public double bloodTemp; // field for the blood temperature
    // input method to read data from user
    public void input() {
        super.input(); // call the base class input method
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter bloodTemp: ");
            bloodTemp = sc.nextDouble();
  }
  // output method to display data to user
  public void output() {
    super.output(); // call the base class output method
    System.out.println("BloodTemp: " + bloodTemp);
  }
}
    

