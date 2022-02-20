package Q1;

import java.util.Date;

public class GeometricObject {

    // if using getter setter, use private
    private String color;
    private boolean filled;
    private Date dateCreated = new Date();

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString() {
        return "created on " + this.getDateCreated() + "\ncolor: " + getColor() + " and filled: " + isFilled();
    }
}