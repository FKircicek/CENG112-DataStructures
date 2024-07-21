public class Simulation {
    private int number;
    PriorityQueue<Computation> computationPriorityQueue = new PriorityQueue<>();
    AListProcess<Process> list = new AListProcess<>();
    AListComputation<Computation> high = new AListComputation<>();
    AListComputation<Computation> normal = new AListComputation<>();
    AListComputation<Computation> low = new AListComputation<>();

    int totalWaitHigh = 0;
    int totalWaitNormal = 0;
    int totalWaitLow = 0;

    int totalCountHigh = 0;
    int totalCountNormal = 0;
    int totalCountLow = 0;


    public Simulation(int number) {
        this.number = number;
    }

    public  void sortComputationsToPQ(AListComputation<Computation> list, PriorityQueue<Computation> PQ){
        AListComputation<Computation> sort = new AListComputation<>();


        for (Computation i: list.toArray()){
            int max = 0;
            for (Computation j: list.toArray()){
                if (j.getOccupation() > max){
                    max = j.getOccupation();
                }
            }
            for (int k = 0; k < list.getLength();k ++){
                if( list.getEntry(k+1).getOccupation()== max){
                    sort.add(list.getEntry(k+1));
                    list.remove(k+1);
                }
            }
        }
        for (Computation i : sort.toArray()){
            PQ.add(i);
        }
    }
    public void CreateSimulation(int procedures) {

        for (int i = 0; i < procedures; i++) {
            int randPrio = (int) (Math.random() * 3) + 1;
            Process Pro = new Process(randPrio, i + 1);
            this.list.add(Pro);
        }
        for (Process i: list.toArray()) {
            if (i != null) {
                Computation computation = new Computation(i.getNumber(),i);
            }
        }

        for (Process i : list.toArray()) {
            if (i != null) {
                if (i.getPriority() == 1) {
                    Computation computation = new Computation(i.getNumber(),i);
                    totalWaitHigh += computation.getOccupation();
                    high.add(computation);
                } else if (i.getPriority() == 2) {
                    Computation computation = new Computation(i.getNumber(),i);
                    totalWaitNormal += computation.getOccupation();
                    normal.add(computation);
                } else {
                    Computation computation = new Computation(i.getNumber(),i);
                    totalWaitLow += computation.getOccupation();
                    low.add(computation);
                }
            }
        }
        totalCountHigh = high.getLength();
        totalCountNormal = normal.getLength();
        totalCountLow = low.getLength();
        sortComputationsToPQ(high,computationPriorityQueue);
        sortComputationsToPQ(normal,computationPriorityQueue);
        sortComputationsToPQ(low,computationPriorityQueue);

    }
    public void show(){
        int totalWait = 0;
        System.out.println("Simulation Numer: "+number);
        System.out.print("Computation Queue: ");
        for (Computation i: computationPriorityQueue.toArray()) {
            if (i != null) {
                totalWait += i.getOccupation();
                if (i != computationPriorityQueue.peek()){
                    System.out.print(" ← "+ i.toString() + "," + i.getProcess().getType() + "," + i.getOccupation()+"ns");
                }
                else {
                    System.out.print(i.toString() + "," + i.getProcess().getType() + "," + i.getOccupation()+"ns");
                }
            }
        }
        System.out.println("\nTotal numbers of computations: "+computationPriorityQueue.getLength());

        System.out.println("\nTotal waiting time: "+totalWait);
        System.out.println("Average waiting time: "+ totalWait/computationPriorityQueue.getLength());

        System.out.println("Total number of computations for High:" + totalCountHigh);
        System.out.println("Total number of computations for Normal:" + totalCountNormal);
        System.out.println("Total number of computations for Low:" + totalCountLow);


        if(totalWaitHigh == 0){
            System.out.println("\nTotal waiting time for High: "+totalWaitHigh);
            System.out.println("Average waiting time for High: "+totalWaitHigh);
        }
        else {
            System.out.println("\nTotal waiting time for High: "+totalWaitHigh);
            System.out.println("Average waiting time for High: "+totalWaitHigh/totalCountHigh);
        }
        if(totalWaitNormal == 0){
            System.out.println("\nTotal waiting time for Normal: "+totalWaitNormal);
            System.out.println("Average waiting time for Normal: "+totalWaitNormal);
        }
        else {
            System.out.println("\nTotal waiting time for Normal: "+totalWaitNormal);
            System.out.println("Average waiting time for Normal: "+totalWaitNormal/totalCountNormal);
        }
        if(totalWaitLow == 0){
            System.out.println("\nTotal waiting time for Low: "+totalWaitLow);
            System.out.println("Average waiting time for Low: "+totalWaitLow);
        }
        else {
            System.out.println("\nTotal waiting time for Low: "+totalWaitLow);
            System.out.println("Average waiting time for Low: "+totalWaitLow/totalCountLow);
        }
    }
}
