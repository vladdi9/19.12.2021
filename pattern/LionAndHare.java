package pattern;

public class LionAndHare {
    public static void main(String[] args) {
        /*Hare hare = new CleverHare();
        Lion lion = new StupidLion();
        hare.meetWithLion(lion);
        lion.meetWithHare(hare);*/
        Hare hare = new StupidHare();
        Lion lion = new CleverLion();
        hare.meetWithLion(lion);
        lion.meetWithHare(hare);
    }
}

abstract class Lion {
    protected boolean wit;

    public Lion() {
    }

    public abstract void meetWithHare(Hare hare);
}

    abstract class Hare{
        protected boolean wit;

        public Hare(){

        }
        abstract public void meetWithLion(Lion lion);

    }

class CleverLion extends Lion {

    @Override
    public void meetWithHare(Hare hare) {
        if (hare.wit) System.out.println("");
        else
            System.out.println("The Hare is stupid, I'd rather eat him.");
    }

    public CleverLion() {
        this.wit = true;
    }
}

class StupidLion extends Lion {
    @Override
    public void meetWithHare(Hare hare) {
        if (hare.wit) System.out.println("The Hare is stupid, I'd rather eat him.");
        else
            System.out.println("What? Another lion in my jungle? Take me to him immediately.");
    }
}

class CleverHare extends Hare{

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.wit) System.out.println("It is another hare. I'm very hungry.");
        else
            System.out.println("The Lion is clever, my attempt fails");
    }
}

class StupidHare extends Hare{

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.wit) System.out.println("The clever Lion! I can't do anything!");
        else
            System.out.println("The stupid Lion! I afraid him!");
    }
}