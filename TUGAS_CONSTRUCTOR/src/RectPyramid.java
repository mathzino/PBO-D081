public class RectPyramid {
    double side,height,volume;
    RectPyramid(double side, double height){
        this.side= side;
        this.height= height;
        this.volume=Math.pow(side,2)*height/3;
    }
    RectPyramid(){
        this.side= 1;
        this.height= 1;
        this.volume=Math.pow(side,2)*height/3;
    }
    RectPyramid(double side){
        this.side= side;
        this.height= side;
        this.volume=Math.pow(side,2)*height/3;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void computeAndSetVolume(){
        this.volume=Math.pow(side,2)*height/3;
    }
    public double getVolume() {
        return volume;
    }
}
