/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Furniture.Chair;
import Furniture.Furniture;
import Furniture.OldFashionedChair;
import Furniture.OldFashionedSofa;
import Furniture.OldFashionedTable;
import Furniture.Sofa;
import Furniture.Table;

/**
 *
 * @author Fettoukh Amine
 */
public class OldFashionedFurnitureFactory extends AbstractFactory {

    //Methode 1
    @Override
    public Furniture getFurniture(String FurnitureType) 
    {
        if(FurnitureType.equalsIgnoreCase("CHAIR"))
        {
            return new OldFashionedChair();
        }
        else if(FurnitureType.equalsIgnoreCase("SOFA"))
        {
            return new OldFashionedSofa();
        }
        return null ;    
    }

    
    //Methode 2
    @Override
    public Chair getChair() {
        return new OldFashionedChair();   
    }

    @Override
    public Sofa getSofa() {
        return new OldFashionedSofa();   
    }

    @Override
    public Table getTable() {
        return new OldFashionedTable();  
    }
    
}
