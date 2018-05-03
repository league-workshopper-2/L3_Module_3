package abstract_classes.cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}
	double bost = 0.5*population;
	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return population*growthRate+bost;
	}

}
