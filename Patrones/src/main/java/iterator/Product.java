/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

/**
 *
 * @author richardo
 */
public class Product {
    
    private String name;
    private ProductType type;

    public Product(String name, ProductType type) {
        this.name = name;
        this.type = type;
    }
    
    public ProductType getType() {
        return type;
    }
}
