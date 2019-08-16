package model;

public class Vertex {
    public double x;
    public double y;
    public double z;

    public Vertex(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getLength(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
}
