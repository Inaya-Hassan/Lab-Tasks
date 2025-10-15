enum PlotType {
	RES_5_MARLA, RES_10_MARLA, RES_1_KANAL, COMM_SHOP, COMM_OFFICE, PARKING ;
}

public class Plot {

	private PlotType plotType;
	private double price;
	private boolean isAvailable;
	private double area;

	public Plot(PlotType plotType, double price, boolean isAvailable, double area) {

		this.plotType = plotType;
		this.price = price;
		this.isAvailable = true;
		this.area = area;
	}

	public void setPlotType(PlotType plotType){
		this.plotType = plotType;
	}
		
	public PlotType getPlotType() {
		return plotType;
	}

	public void setPrice (double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	

	public void setArea (double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}


	public boolean bookPlot() {
		if(isAvailable) {
			isAvailable = false;
			return true;
		}
	return false;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public boolean cancelBooking() {
		if(!isAvailable) {
			isAvailable = true;
			return true;
	}
	return false;
	}
	
	@Override 
	public String toString () {
		String status;
		if(isAvailable) {
			status = "Available";
		} else {
			status = "Booked";
		}

	return String.format ("Plot %s %.2f %s %.2f", plotType, price, status, area);

	}











}