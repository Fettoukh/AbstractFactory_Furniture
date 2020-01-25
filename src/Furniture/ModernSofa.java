/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Furniture;

/**
 *
 * @author Fettoukh Amine
 */
public class ModernSofa implements Sofa, Furniture  {

    @Override
    public void sitOn() {
        System.out.println("You're Sitting on a Modern Sofa.");    
    }
    
}
