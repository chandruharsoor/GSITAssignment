package oopsConcepts;

class products{
	
	int productId;
    String productname;
    double price;
    
    public products() {
    	System.out.println("Prodcuts created");
    }
    
    public products(int productId , String productname , double price) {
    	this.productId = productId;
        this.productname = productname;
        this.price = price;
    }
    
    public void displayProduct() {
    	
        System.out.println("Product ID  : " + productId);
        System.out.println("Product Name: " + productname);
        System.out.println("Price       : " + price);
      
    }
}

public class Constructors {

	public static void main(String[] args) {
		
		products prd = new products();
		prd.displayProduct();
		
		products prd1 = new products(231,"Paneer",85);
		prd1.displayProduct();

	}

}
