package abstract_classes.cities;

public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}
	double at = 2*growthRate;
	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return population*growthRate*at;
	}

}
