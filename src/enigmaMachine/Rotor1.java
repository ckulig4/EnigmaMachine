package enigmaMachine;

public class Rotor1 {

	private String[] inputValues = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	private String[] rotor1Values = {"E", "K", "M", "F", "L", "G", "D", "Q", "V", "Z", "N", "T", "O", "W", "Y", "H", "X", "U", "S", "P", "A", "I", "B", "R", "C", "J"};
	private String convertedValue;
	private int rotorPosition;
	
	
	
	public Rotor1(String letterInput) {
		this.rotorPosition = inputValues[0].indexOf(letterInput);
		this.convertedValue = rotor1Values[rotorPosition];
	}

	public String getValue() {
		return (convertedValue);
	}
	
}
