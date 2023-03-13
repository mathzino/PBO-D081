public class Block {
    private double length,width,height,volume;
    Block(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
        this.volume=length*width*height;
    }
    Block(double length){
        this.length=length;
        this.width=length;
        this.height=length;
        this.volume=length*width*height;
    }
    Block(double length, double width){
        this.width=width;
        this.height=width;
        this.length=length;
        this.volume=this.length*this.width*this.height;
    }
    Block(){
        this.width=1;
        this.height=1;
        this.length=1;
        this.volume=this.length*this.width*this.height;
    }
    void setPanjang(double length){
        this.length=length;
    }
    void setTinggi(double height){
        this.height=height;
    }
    void setLebar(double width){
        this.width=width;
    }
    void computeAndSetVolume(){
        this.volume=length*width*height;
    }
    double getVolume(){
        return this.volume;
    }
}
