import java.util.ArrayList;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {
        LinkedList<Simulation> simulationLinkedList = new LinkedList<>();
        Simulation firstSimulation = new Simulation(1);
        firstSimulation.CreateSimulation(3);
        simulationLinkedList.add(firstSimulation);
        System.out.println();
        firstSimulation.show();
        System.out.println("\n******************************************\n");
        Simulation secondSimulation = new Simulation(2);
        secondSimulation.CreateSimulation(5);
        simulationLinkedList.add(secondSimulation);
        secondSimulation.show();
        System.out.println("\n******************************************\n");
        Simulation thirdSimulation = new Simulation(3);
        thirdSimulation.CreateSimulation(10);
        simulationLinkedList.add(thirdSimulation);
        thirdSimulation.show();
        System.out.println("\n******************************************\n");

    }
}

