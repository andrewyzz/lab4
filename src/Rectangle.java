package src;

public class Rectangle {
    private int width;
    private int lenght;
    public Rectangle(int width,int lenght){
        this.width = width;
        this.lenght = lenght;
    }
    public int getWidth(){
        return this.width;
    }
    public int getLenght(){
        return this.lenght;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setLenght(int lenght){
        this.lenght=lenght;
    }
    public int calcAria(){
        return width * lenght;
    }
    public int calcPerim(){
        return 2* (width+lenght);
    }

}
