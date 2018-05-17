package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	
public static void main(String[] args) {
	Animal chicken = new Chicken();
	Animal cow = new Cow();
	Animal goat = new goat();
	Animal pig = new Pig();
	Animal chicken2 = new Chicken();
	Animal goat2 = new goat();
	ArrayList<Animal> farm = new ArrayList<Animal>();
	farm.add(chicken);
	farm.add(cow);
	farm.add(goat);
	farm.add(pig);
	farm.add(chicken2);
	farm.add(goat2);
	for (int i = 0; i < farm.size(); i++) {
		Animal a = farm.get(i);
	System.out.println(a.makeNoise());
	System.out.println(a.legs());
	}
	
}
}
