public class Cube {
    private double side,volume;
    Cube(double side){
        this.side=side;
        this.volume=Math.pow(side,3);
    }
    Cube(){
        this.side=1;
        this.volume=side*side;
    }
    void setSisi(double side){
        this.side=side;
    }
    void computeAndSetVolume(){
        this.volume=Math.pow(side,3);
    }
    double getVolume(){
        return this.volume;
    }
}
