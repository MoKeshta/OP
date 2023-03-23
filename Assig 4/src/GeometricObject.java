public abstract class GeometricObject {

    private String color = "while";
    private boolean filled;




    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }






    public abstract double getArea();


    public abstract double getPer();


}