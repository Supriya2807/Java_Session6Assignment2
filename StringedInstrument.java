package acadgild.assignments;

public class StringedInstrument extends Instrument {
	
	int numberOfStrings;
	
	StringedInstrument (String a){
		super(a);
		
	}
	
	public String play(){
		
		return name;
	}

	 void setstrings(int i){
		
		
		numberOfStrings=i;
		
	}
	public int getstrings(){
		
		return numberOfStrings;
		
	}
}
