public class Fitbyte {
    private int age;
    private int restingHeartRate;
    private double percentageOfMaximum;

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public int getAge(){
        return age;
    }

    public int getRestingHeartrate(){
        return restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){  
        percentageOfMaximum = 206.3 - (0.711 * age);
        return percentageOfMaximum;
    }
}