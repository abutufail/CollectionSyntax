package collectionSyntax.abu;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Collection;
import java.util.List;

public class collection {

	public static void main(String[] args) {
		
	        Product door = new Product("Wooden Door", 35);
	        Product floorPanel = new Product("Floor Panel", 25);
	        Product window = new Product("Glass Window", 10);
	        
	        List<Product> products= new ArrayList<>();   // here we can use Collection instead of List, it will store in Product
	        products.add(door);
	        products.add(floorPanel);
	        products.add(window);
	        
	        
	       // System.out.println(products); it will print all three product in same line
	        
	        // *for printing product in seprate line
	        Iterator<Product> ProductIterator=products.iterator();   //create iterator of product
	        while(ProductIterator.hasNext()) {         				//hasNext will return false at the end of the list 
	        	Product product=ProductIterator.next();				// thus the product will print in seperate line
	        	System.out.println(product);
	        }
	        
	        System.out.println("\n");
	        
	     // *for printing product in seprate line easy method by for loop as we know the for loop print in seperate line
	        for (Product product : products)
	        {
	            System.out.println(product);
	        }
	        
	     System.out.println("\n");
	        
	        // * using iterator we will only print the weight above 20
	        Iterator<Product> ProductIterator1=products.iterator();   //create iterator of product
	        while(ProductIterator1.hasNext()) {         				//hasNext will return false at the end of the list 
	        	Product product=ProductIterator1.next();				// thus the product will print in seperate line
	        	if(product.getWeight()>20) {						// only shows the product whose weight is greater than 20
	        		System.out.println(product);
	        	}
	        	else {
	        		ProductIterator1.remove();      				// all the product less whose weight is less than 20 will get removed from products
	        	}
	        }
	        System.out.println("\n");
	        //* to see whether it is removed or not
	        System.out.println(products);
	        
	        
	}

}
