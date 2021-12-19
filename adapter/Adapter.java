package adapter;


public class Adapter {
    public static void main(String[] args) {

    }
}

interface Well {
    public double getWater();
    void makeEcho(String call);
}

class DogWell implements Well{

    @Override
    public double getWater() {
        return 0;
    }

    @Override
    public void makeEcho(String call) {
        System.out.println(call+"-"+call+call);
    }

    private double vote = 1000;
}
class Bucket{
    public double value = 10;
    public void feel(){
        System.out.println("Filling the bucket with water");
    }
    public void emptying(){
        System.out.println("Pouring water");
    }
}

class VeilWisBacket implements Well{

    private Bucket bucket = new Bucket();

    @Override
    public double getWater() {
        return 0;
    }

    @Override
    public void makeEcho(String call) {
    }
}