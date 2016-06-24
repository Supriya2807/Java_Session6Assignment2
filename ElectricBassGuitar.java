package acadgild.assignments;

public class ElectricBassGuitar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringedInstrument inst1 = new StringedInstrument("Electric Bass Guitar");
		
		System.out.println("The instrument playing is : "+inst1.play());
		
		inst1.setstrings(4);
		System.out.println("The Electric Bass Guitar has : "+inst1.getstrings()+" Strings.");

		

	}

}
