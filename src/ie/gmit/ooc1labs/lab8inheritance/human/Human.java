package ie.gmit.ooc1labs.lab8inheritance.human;

public class Human {
	
	// Instance Variable
	private double weight;
	
	// Default Constructor 
	public Human() {
		weight = 80.0;
	}

	// Parameterised Constructor
	public Human(double weight){
		/* this  is a keyword in Java. It can be used inside a Method or 
		 * constructor of  Class. this works as a reference to the current 
		 * Object whose Method or constructor is being invoked. The this keyword 
		 * can be used to refer to any member of the current object from within 
		 * an instance Method or a constructor.
		 */
		this.weight = weight;
	}
	
	// Getter
	public double getWeight() {
		return weight;
	}

	//Setter
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// Eat method for Human Class
	public double eat(double weightGain){
		weight = weight + weightGain;
		System.out.println("You have eaten and you now weigh " + weight + " kilos.");
		return weight;
	}
	
}
