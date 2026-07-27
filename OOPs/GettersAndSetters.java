package OOPs;

public class GettersAndSetters {

    public static void main(String args[]){
        Pen pen = new Pen();
        pen.setColor("Blue");
        pen.setTip(0.5f);
        System.out.println("Color: " + pen.getColor());
        System.out.println("Tip: " + pen.getTip());
    }
    
}

class Pen{
    private String color;
    private float tip;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setTip(float tip){
        this.tip = tip;
    }

    public float getTip(){
        return this.tip;
    }
}
