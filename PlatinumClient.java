public class PlatinumClient extends Client {

	private int numberOfTrips;
	private double travelOffersRate;

	public PlatinumClient(int id, String firstName, String lastName, double amount, int numberOfTrips) {
		super(id, firstName, lastName, amount);
		setNumberOfTrips(numberOfTrips);
	}

	public int getNumberOfTrips() {
		return numberOfTrips;
	}

	public void setNumberOfTrips(int numberOfTrips) {
		this.numberOfTrips = numberOfTrips;
		setTravelOffersRate();
	}

	public double getTravelOffersRate() {
		return travelOffersRate;
	}
 
	// Think about the appropiate access modifier
	private void setTravelOffersRate() {
		travelOffersRate = numberOfTrips * 0.01;
	}

	public void addTrips(int n) {
		numberOfTrips += n;
		setTravelOffersRate();
	}

	public String toString() {
		return super.toString() + "Number of Trips: " + numberOfTrips + "\nTravel Offers Rate: " + travelOffersRate
				+ "\n";
	}
}