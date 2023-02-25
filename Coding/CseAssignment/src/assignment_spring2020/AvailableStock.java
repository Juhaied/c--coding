package assignment_spring2020;
import java.util.Comparator;
public class AvailableStock implements Comparator< StockableProduct>{
	@Override
	public int compare( StockableProduct o1, StockableProduct o2) {
		if(o1.getNumberOfStockItem()<o2.getNumberOfStockItem()) {
			return -1;
		}
		if(o1.getNumberOfStockItem()>o2.getNumberOfStockItem()) {
			return 1;
		}
		return 0;
		
	}
}
