public class Process implements IProcess {
    public int prio;
    public int number;
    public Process(int prio,int number) {
        this.prio = prio;
        this.number = number;
    }

    @Override
    public String getType() {
        if(prio == 1){
            return "High";
        }
        else if (prio == 2){
            return "Normal";
        }
        else {
            return "Low";
        }
    }

    @Override
    public int getPriority() {
        return prio;
    }

    @Override
    public String toString() {
        return "P"+ number;
    }

    public int getNumber() {
        return number;
    }
}
