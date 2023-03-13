public class Tube {
    private double radius,height,volume;
    Tube(double radius,double height){
        this.radius=radius;
        this.height=height;
        this.volume=Math.PI*Math.pow(radius,2)*height;
    }
    Tube(double radius){
        this.radius=radius;
        this.height=radius;
        this.volume=Math.PI*Math.pow(radius,2)*height;
    }
    Tube(){
        this.radius=1;
        this.height=1;
        this.volume=Math.PI*Math.pow(radius,2)*height;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    void setHeight(double height){
        this.height=height;
    }
    void computeAndSetVolume(){
        this.volume=Math.PI*Math.pow(radius,2)*height;
    }

    double getVolume(){
        return this.volume;
    }

}
