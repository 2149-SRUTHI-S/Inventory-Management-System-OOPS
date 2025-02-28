package myInventory;
import java.util.*;
import java.io.*;

public class InventoryMain {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		System.out.println("Welcome to SS Inventory Management System");
		System.out.println("1: Add Supplier");
		System.out.println("2: Get Product Details");
		System.out.println("3: Recipe Management");
		System.out.println("4: Exit");
		while(choice != 4)
		{
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			if(choice == 1)
			{
				System.out.println("Enter Supplier name: ");
				String supplier_name = sc.next();
				System.out.println("Enter product name: ");
				String product_name = sc.next();
				System.out.println("Enter product quantity: ");
				int product_qty = sc.nextInt();
				System.out.println("Enter product pricing: ");
				int product_pricing = sc.nextInt();
				String date = "18-08-2003";
				Supplier supplier = new Supplier(supplier_name,product_name,product_qty,product_pricing, date,0);
				supplier.addSupplier();
			}
			else if(choice == 2)
			{
				ArrayList<String> p = new ArrayList<>();
				p.add("Bun");
				p.add("Patty");
				p.add("Lettuce");
				p.add("Sauce");
				Products product = new Products(p);
				String pro = "Sauce";
				Quantity q = new Quantity();
				int quan = q.getQuantity(pro);
				Flavour f = new Flavour();
				ArrayList<String> flav = f.getFlavours(pro);
			}
			else if(choice == 3)
			{
				System.out.println("Enter Recipe Name: ");
				String recipe_name = "Burger";
				ArrayList<String> ing = new ArrayList<>();
				ing.add("Bun");
				ing.add("Patty");
				ing.add("Lettuce");
				ing.add("Sauce");
				
				RecipeMgmt rm = new RecipeMgmt(recipe_name, ing);
				
				
			}
		}
	}
}
