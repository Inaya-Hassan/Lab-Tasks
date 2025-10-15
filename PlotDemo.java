public class PlotDemo {
	public static void main (String args[] ) {

		Plot p = new Plot (PlotType.RES_5_MARLA, 1000000.0, false, 0.0);
		Plot p1 = new Plot (PlotType.RES_10_MARLA, 3000000.0, false, 0.0);
	
		System.out.println(p);
		

		System.out.println("Seat is Available? " + p.bookPlot());
        	System.out.println(p);
		System.out.println("Seat is Available? " + p.isAvailable()); 
        	System.out.println(p);
       		System.out.println("Seat is Available? " + p1.cancelBooking()); 
       		System.out.println(p1);



	}



}