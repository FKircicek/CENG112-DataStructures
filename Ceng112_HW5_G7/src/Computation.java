public class Computation {
    private int id;
    private IProcess process;
    private int occupation;

    public Computation(int id, IProcess process) {
        this.id = id;
        this.process = process;
        int occupation = (int)(Math.random()*(10)+1);
        this.occupation = occupation;
    }
    public String toString() {
        return process.toString();
    }

    public int getOccupation() {
        return occupation;
    }

    public IProcess getProcess() {
        return process;
    }
}
