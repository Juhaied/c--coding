package assignment_spring2020;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;

public class Inventory implements Iterable<StockableProduct>{
    private ArrayList<StockableProduct> item;
	
	public Inventory() {
		item=new ArrayList<>();
	}
	public void addItem(StockableProduct product) {
		item.add(product);
	}
	public void removeProductItem(int productId) {
		item.remove(productId);
	}
	public Product getItem(int productId) {
		return item.get(productId);
	}
	@Override
	public Iterator<StockableProduct> iterator(){
		return item.iterator();
	}
	public void sortByPrice() {
		Collections.sort(item,new PriceComparator());
	}
	public void sortByAvailableStoct() {
		Collections.sort(item,new AvailableStock());
	}
}
