public class Sphere {
    private double radius,volume;
    Sphere(double radius){
        this.radius=radius;
        this.volume=Math.PI*Math.pow(radius,3)*4/3;
    }
    Sphere(){
        this.radius=1;
        this.volume=Math.PI*Math.pow(radius,3)*4/3;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void computeAndSetVolume() {
        this.volume = Math.PI*Math.pow(radius,3)*4/3;
    }
    public double getVolume() {
        return volume;
    }
}
