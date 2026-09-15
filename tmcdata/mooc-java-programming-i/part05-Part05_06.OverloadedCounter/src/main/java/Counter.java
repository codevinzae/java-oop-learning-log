public class Counter {
    private int value;

    public Counter(int startValue){
        this.value = startValue;
    }

    public int value(){
        return value;
    }

    public void increase(){
        this.value = this.value + 1;
    }

    public void decrease(){
        this.value = this.value - 1;
    }

    public void increaseee(int increasedBy){
        if(increasedBy >= 0){
         this.value = value + increasedBy;
        }
     }

     public void decreaseee(int decreasedBy){
        if(decreasedBy >= 0){
         this.value = value - decreasedBy;
        }
     }

     @Override
     public String toString(){
        return "Value: " + this.value;
     }
}

