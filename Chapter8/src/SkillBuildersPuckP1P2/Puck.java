package SkillBuildersPuckP1P2;

public class Puck extends Disk implements Comparable<Puck> {
    private double weight;
    private boolean standard;
    private boolean youth;

    public Puck(double weight) {
        super(1.5, 1.0);  
        this.weight = weight;
        this.standard = weight >= 5.0 && weight <= 5.5;
        this.youth = weight >= 4.0 && weight < 5.0;
    }		 
    public double getWeight() {
        return weight;
    }

    public String getDivision() {
        if (standard) return "Standard";
        if (youth) return "Youth";
        return "Invalid";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Puck puck = (Puck) obj;
        return Double.compare(puck.weight, weight) == 0;

        
    }

  
    public String toString() {
        return "Puck[weight=" + weight + ", division=" + getDivision() + ", " + super.toString() + "]";
    }

    public int compareTo(Puck other) {
        return Double.compare(this.weight, other.weight);
    }
} 

