import java.io.IOException;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {
		 Inventory inventory = new Inventory();
		 List<String> commands = FileIO.takeCommand("src/hw3_example_inputs.csv");
		 
		 	for(String command : commands) {
		 		String[] commandArray = command.split(",");
		 		if(commandArray[0].equals("add"))
		 			addProductToInventory(inventory,new Product(commandArray[2],commandArray[1],Integer.parseInt(commandArray[3])));
		 		else if(commandArray[0].equals("list"))
		 			inventory.listProductsInOrder();
		 		else
		 			searchEntry(inventory,commandArray[1]);
		 			
		 	}
	    }
		public static void addProductToInventory(Inventory inventory ,Product product) {
			inventory.addProduct(product);
			System.out.println(product.name+" added.");
			
		}
		public static void searchEntry(Inventory inventory,String entryName) {
			Product product = inventory.search(entryName);
			if(product != null) {
				System.out.println(entryName+ " is found in the tree.");
				System.out.println(product.toString());
			}
			else
				System.out.println(entryName+" could not found in the tree");
		}
	
		

	}


