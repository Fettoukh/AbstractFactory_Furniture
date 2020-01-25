/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory_Chair_Sofa;

import Factories.AbstractFactory;
import Factories.FactoryProducer;
import Furniture.Chair;
import Furniture.Furniture;
import Furniture.Sofa;
import Furniture.Table;

/**
 *
 * @author Fettoukh Amine
 */
public class AbstractFactoryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //Methode 1
        System.out.println("Methode 1 \n");
      //get Old Fashioned Furniture factory
      AbstractFactory FurnitureFactory1 = FactoryProducer.getFactory(false);
      //get an object of Old Fashioned Chair
      Furniture furniture1 = FurnitureFactory1.getFurniture("Chair");
      //call sitOn method of Old Fashioned Chair
      furniture1.sitOn();
      //get an object of Old Fashioned Sofa
      Furniture furniture2 = FurnitureFactory1.getFurniture("Sofa");
      //call sitOn method of Old Fashioned Chair
      furniture2.sitOn();
      
      
      //get Modern Furniture factory
      AbstractFactory FurnitureFactory2 = FactoryProducer.getFactory(true);
      //get an object of Modern Chair
      Furniture furniture3 = FurnitureFactory2.getFurniture("Chair");
      //call sitOn method of Modern Chair
      furniture3.sitOn();
      //get an object of Modern Sofa
      Furniture furniture4 = FurnitureFactory2.getFurniture("Sofa");
      //call sitOn method of Modern Sofa
      furniture4.sitOn();
      
      
      
      
      //Methode 2
      System.out.println("\nMethode 1 \n");
      AbstractFactory FurnitureFactory3 = FactoryProducer.getFactory(false);
      //get an object of Old Fashioned Chair
      Chair chair1 = FurnitureFactory3.getChair();
      //call sitOn method of Old Fashioned Chair
      chair1.sitOn();
      //get an object of Old Fashioned Sofa
      Sofa sofa1 = FurnitureFactory3.getSofa();
      //call sitOn method of Old Fashioned Chair
      sofa1.sitOn();
      //get an object of Old Fashioned Table
      Table table1 = FurnitureFactory3.getTable();
      //call sitAround method of Old Fashioned Table
      table1.Sitaround();
      
      
      
      
      AbstractFactory FurnitureFactory4 = FactoryProducer.getFactory(true);
      //get an object of Old Fashioned Chair
      Chair chair2 = FurnitureFactory4.getChair();
      //call sitOn method of Old Fashioned Chair
      chair2.sitOn();
      //get an object of Old Fashioned Sofa
      Sofa sofa2 = FurnitureFactory4.getSofa();
      //call sitOn method of Old Fashioned Chair
      sofa2.sitOn();
      //get an object of Old Fashioned Table
      Table table2 = FurnitureFactory4.getTable();
      //call sitAround method of Old Fashioned Table
      table2.Sitaround();
    }
}
    
