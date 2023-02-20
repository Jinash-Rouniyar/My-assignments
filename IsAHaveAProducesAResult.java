package first_project;

public class IsAHaveAProducesAResult {

	public static void main(String[] args) {
		Options options = new Options(210,0.9f,"26-02-2023","Call Options");
		StockTicker ticker = new StockTicker("TSLA",200);
		Platform platform = new Platform("Robinhood",2626);
		Buyer buyer = new Buyer();
		Contract contract = buyer.buy(ticker, options, platform);
		System.out.println("Final Result:" + contract.Details);

	}

}
class Contract{
	String type = "Options Contract";
	public String Details;
	
	public String getType() {
		return type;
	}
	
}
class Options{
	int strikeprice;
	String expiryDate;
	String type;
	float purchaseprice;
	Options(int strikeprice, float purchaseprice, String expiryDate, String type){
		this.strikeprice = strikeprice;
		this.expiryDate = expiryDate;
		this.type = type;
		this.purchaseprice = purchaseprice;
	}

	@Override
	public String toString() {
		return type + " at strike price $" + strikeprice + " is purchased for price $" + purchaseprice*100+" with expiry date " + expiryDate;
		//return "Options [strikeprice=" + strikeprice + ", expiryDate=" + expiryDate + ", type=" + type + "]";
	}
	public int getStrikePrice() {
		return strikeprice;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public String getType() {
		return type;
	}
	public float getPurchasePrice() {
		return purchaseprice;
	}
}
class StockTicker{
	String name;
	int price;
	StockTicker(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "StockTicker [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
class Buyer{
	Contract buy(StockTicker ticker, Options options, Platform platform) {
		Contract contract = new Contract();
		System.out.println("Derivative to be puchased is: "+ contract.getType());
		System.out.println("Platform selected for this purchase is "+ platform.getName());
		System.out.println("Stock ticker selected is "+ ticker.getName() + " at price $" + ticker.getPrice());
		System.out.println(contract.getType() + " selected is: " + options.toString());
		System.out.println("Remaining buying power is "+ (1000-(options.getPurchasePrice() *100)));//1000 is initial buying power
		contract.Details = " Purchase is succesfull";
		return contract;
		
	}
}
class Platform{
	String Name;
	int password;
	Platform(String Name, int password){
		this.Name = Name;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Platform [Name=" + Name + ", password=" + password + "]";
	}

	public String getName() {
        return Name;
    }
	public int getPassword() {
		return password;
	}
}
