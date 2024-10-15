package SkillBuilderRectangle;

public class Rectangle 
 
 implements Comparable< Rectangle >, ComparableArea 
 {
    private double length, width;

    public Rectangle() 
    {
        length = 1;
        width = 1;
    }

    public Rectangle(double L, double w) 
    {
        length = L;
        width = w;
    }

    public double getLength() 
    {
        return length;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setLength(double newL) 
    {
        length = newL;
    }

    public void setWidth(double newW) 
    {
        width = newW;
    }

    public double area() 
    {
        return length * width;
    }

  
    public boolean equals(Object rec) 
    {
        if (this == rec) return true;
        if (!(rec instanceof Rectangle)) return false;
        Rectangle testRect = (Rectangle) rec;
        return Double.compare(testRect.getLength(), length) == 0 && 
               Double.compare(testRect.getWidth(), width) == 0;
    }

  
    public String toString() 
    {
        return "Rectangle has a length of " + length + " and width of " + width;
    }


    public int compareTo(Rectangle other) 
    {
        if (this.equals(other)) 
        {
            return 0;
        }
        if (this.length < other.length || (this.length == other.length && this.width < other.width)) 
        {
            return -1;
        }
        return 1;
    }

   
    public int compareToArea(Object obj) 
    {
        if (!(obj instanceof Rectangle)) 
        {
            throw new IllegalArgumentException("Object is not a Rectangle");
        }
        Rectangle other = (Rectangle) obj;
        double thisArea = this.area();
        double otherArea = other.area();
        if (thisArea == otherArea) {
            return 0;
        } else if (thisArea < otherArea) {
            return -1;
        } else {
            return 1;
        }
    }
}