package meet2.Tugas.Shape;

public class Shape{
    private String color;
    private boolean filled;

    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        return "Shape[color="+ color +", filled="+ filled + "]";
    }
}
