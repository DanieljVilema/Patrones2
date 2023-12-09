/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

import java.util.List;

/**
 *
 * @author richardo
 */
public class StoreInventory implements Inventory{
    
    private List<Product> products;

    public StoreInventory(List<Product> products) {
        this.products = products;
    }

    @Override
    public ProductIterator createIterator(ProductType type) {
        return new StoreProductIterator(type);
    }
    
    private class StoreProductIterator implements ProductIterator {
        
        private int currentIndex = 0;
        private ProductType type;

        public StoreProductIterator(ProductType type) {
            this.type = type;
        }

        public boolean hasNext() {
            while (currentIndex < products.size()) {
                Product product = products.get(currentIndex);
                if (product.getType().getTypeName().equals(type.getTypeName()) || type == null) {
                    return true;
                } else {
                    currentIndex++;
                }
            }
            return false;
        }

        public Product next() {
            return hasNext() ? products.get(currentIndex++) : null;
        }
    }

    
}
