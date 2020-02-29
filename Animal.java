//Diane Vinson
//2/29/20
import java.util.*;

public class Animal {
    String name;
    int numLegs;

    Animal(String name, int numLegs) {
	this.name = name;
	this.numLegs = numLegs;
    }
    
    public int getLegs() {
	return numLegs;
    }

    public String toString() {
	return (name + ", " + numLegs);
    }
}
