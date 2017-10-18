package enigmaMachine;

public class Rotor1 {

	private String inputValues = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String[] rotor1Values = {"E", "K", "M", "F", "L", "G", "D", "Q", "V", "Z", "N", "T", "O", "W", "Y", "H", "X", "U", "S", "P", "A", "I", "B", "R", "C", "J"};
	private String convertedValue;
	private int rotorPosition;
	
	
	
	public Rotor1(String letterInput) {
		this.rotorPosition = inputValues.indexOf(letterInput);
		this.convertedValue = rotor1Values[rotorPosition];
	}

	public String getValue() {
		return (convertedValue);
	}
	
}
