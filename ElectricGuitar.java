package acadgild.assignments;

public class ElectricGuitar {
	
	public static void main(String []args){
		
		StringedInstrument inst1 = new StringedInstrument("Electric Guitar");
		
		System.out.println("The instrument playing is : "+inst1.play());
		
		inst1.setstrings(6);
		System.out.println("The Electric Guitar has : "+inst1.getstrings()+" Strings.");

		
	}
	
	

}
