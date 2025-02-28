package myInventory;
import java.util.*;

public class Products {
	public static String product_name;
	public static ArrayList<String> p;
	
	public Products(ArrayList<String> p)
	{
		this.p = p;
		this.product_name = product_name;
		
//		p = new ArrayList<>();
//		p.add("Bun");
//		p.add("Patty");
//		p.add("Lettuce");
//		p.add("Sauce");
		
	}
	
	public String getProductName()
	{
		return product_name;
	}
	
}

class Quantity extends Products
{
	ArrayList<Integer> qty;
	Quantity()
	{
		super(p);
		
		qty = new ArrayList<>();
		
		qty.add(3);
		qty.add(10);
		qty.add(95);
		qty.add(56);
	}
	
	public int getQuantity(String product_name)
	{
		int index = p.indexOf(product_name);
		return qty.get(index);
	}
	
}

class Flavour extends Products
{
	ArrayList<String> flavours;
	Flavour()
	{
		super(p);
		
		flavours = new ArrayList<>();
		
		flavours.add("Tomato Sauce");
		flavours.add("Chilli Sauce");3
		
	}
	
	public ArrayList<String> getFlavours(String product_name)
	{
		for(int i=0;i<4;i++)
		{
			if((p.get(i)).equals(product_name))
			{
				return flavours;
			}
		}
	}
	
}
