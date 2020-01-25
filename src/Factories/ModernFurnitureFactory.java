/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Furniture.Chair;
import Furniture.Furniture;
import Furniture.ModernChair;
import Furniture.ModernSofa;
import Furniture.ModernTable;
import Furniture.Sofa;
import Furniture.Table;

/**
 *
 * @author Fettoukh Amine
 */
public class ModernFurnitureFactory extends AbstractFactory {

    //Methode 1 
    @Override
    public Furniture getFurniture(String FurnitureType) {
        if(FurnitureType.equalsIgnoreCase("CHAIR"))
        {
            return new ModernChair();
        }else if(FurnitureType.equalsIgnoreCase("SOFA"))
        {
            return new ModernSofa();
        }
        return null ;
        
    }

    
    //Methode 2
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();    
    }

    @Override
    public Table getTable() {
        return new ModernTable(); 
   }
    
    
}
