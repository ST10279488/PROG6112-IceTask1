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
class Animal {
    
    // Base class Animal
    public int IDtag; 
    public String species; // field for the animal species
        // input method to read the data from the user
        public void input() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter IDtag: ");
                IDtag = sc.nextInt();
            System.out.print("Enter species: ");
                species = sc.next();
  }
  // output method to display the data to the user
  public void output() {
    System.out.println("IDtag: " + IDtag);
    System.out.println("Species: " + species);
  }

    
    }


    

