
class ElectricityBill {
	private String  customerName;
	private double  unitsConsumed;
	private double pricePerUnit;
	
	public void setCustomerName(String customerName ) {
		this.customerName = customerName;
	}
	public void setunitsConsumed(double unitsConsumed ) {
		this.unitsConsumed = unitsConsumed;
	}
	public void setpricePerUnit(double pricePerUnit ) {
		this.pricePerUnit = pricePerUnit;
	}
	
	public String getcustomerName() {
		return customerName;
	}
	public double getunitsConsumed() {
		return unitsConsumed;
	}
	public double getpricePerUnit() {
		return pricePerUnit;
	}
}
	
	public class Main {
		public static void main(String []lalla) {
		
			ElectricityBill eb = new ElectricityBill ();
			eb.setCustomerName("Aniket Pandeey");
			eb.setpricePerUnit(14.99);
			eb.setunitsConsumed(114.89);
			double totalBill = eb.getunitsConsumed() * eb.getpricePerUnit();
			System.out.println(totalBill);
			
		}
	}
	

