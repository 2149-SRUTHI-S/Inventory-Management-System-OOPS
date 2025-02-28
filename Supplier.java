package myInventory;
import java.util.*;

public class Supplier {
	private String supplier_name;
	private String product_name;
	private int product_qty;
	private int product_pricing;
	private String date;
	private int cnt;
	
	ArrayList<Supplier> sup = new ArrayList<>();
	
	public Supplier(String supplier_name, String product_name, int product_qty, int product_pricing, String date, int cnt)
	{
		this.supplier_name = supplier_name;
		this.product_name = product_name;
		this.product_qty = product_qty;
		this.product_pricing = product_pricing;
		this.date = date;
		this.cnt = cnt;
	}
	
	public void addSupplier()
	{
		sup.add(new Supplier(supplier_name, product_name, product_qty, product_pricing, date, 0));
		System.out.println("Supplier added Successfully");
	}
	 
	public int getSuppCnt(String supplier_name)
	{
		return cnt;
	}
	
}
