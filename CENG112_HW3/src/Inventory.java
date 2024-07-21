public class Inventory {
    private Tree<Product> bst;

    public Inventory() {
        this.bst = new Tree<>();
    }

    public void addProduct(Product product) {
        //Product product = new Product(name, category, price);
    	
        bst.insert(product);
        
    }

    /*public void removeProduct(String name, String category, int price) {
        Product product = new Product(name, category, price);
        bst.delete(product);
    }*/

    /*public BinaryNode<T> hasProduct(String name, String category, int price) {
        Product product = new Product(name, category, price);
        return bst.getEntry(product);
    }*/
   
    public Product search(String entryName) {
    	//System.out.println(bst.getEntry(product));
    	return bst.findByName(entryName);
    }

    public void listProductsInOrder() {
        System.out.println("Products in order:");
        bst.inorder();
        System.out.println();
    }

}