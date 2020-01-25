/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Furniture.Chair;
import Furniture.Furniture;
import Furniture.Sofa;
import Furniture.Table;

/**
 *
 * @author Fettoukh Amine
 */
public abstract class AbstractFactory {
    // Methode 1
    abstract public Furniture getFurniture(String FurnitureType) ;
    
    // Methode 2
    abstract public Chair getChair() ;
    abstract public Sofa getSofa() ;
    abstract public Table getTable() ;
    
}
