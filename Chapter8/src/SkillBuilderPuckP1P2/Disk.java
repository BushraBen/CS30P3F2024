package SkillBuilderPuckP1P2;

public class Disk 
{
    private double radius;
    private double thickness;

    public Disk(double radius, double thickness)
    {
        this.radius = radius;
        this.thickness = thickness;
    }

    public double getRadius() 
    {
        return radius;
    }

    public double getThickness() 
    {
        return thickness;
    }


    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Disk disk = (Disk) obj;
        return Double.compare(disk.radius, radius) == 0 &&
               Double.compare(disk.thickness, thickness) == 0;
    }


    public String toString() {
        return "Disk[radius=" + radius + ", thickness=" + thickness + "]";
    }
}