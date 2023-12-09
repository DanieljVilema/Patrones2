/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

/**
 *
 * @author richardo
 */
abstract class ProductType {
    abstract String getTypeName();
}

class ComputingProduct extends ProductType {
    
    @Override
    String getTypeName() {
        return "Computing";
    }
}

class PrintingProduct extends ProductType {
    
    @Override
    String getTypeName() {
        return "Printing";
    }
}