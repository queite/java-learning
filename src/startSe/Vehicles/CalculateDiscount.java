package startSe.Vehicles;

public class CalculateDiscount {

	public static float main(Vehicle vehicle) {
		if (vehicle.getYear() <= 2000) {
			return (float) (vehicle.getPrice() * 0.12);
		} else {
			return (float) (vehicle.getPrice() * 0.07);
		}
	}

}
