package task;

public class Stock {

	public String symbol;
	public String name;
	public double prePrice;
	public double curPrice;
	
	public Stock( String symbol,String name) {
		this.symbol= symbol;
		this.name = name;
	}
	
	public double percentage() {
		double rslt = (curPrice - prePrice) / 100;
		return rslt;
	}
}
