public class MarketingAnalyst {
    Queue Bed = new Queue();
    Queue Sofa = new Queue();
    Queue Chair = new Queue();
    Queue Dresser = new Queue();
    Queue Table = new Queue();
    Queue Bookcase= new Queue();
    public  void  create(){
        int rand = (int)(Math.random()*6)+1;
        switch(rand){
            case 1:
                Bed.enqueue( "Bed");
                System.out.println("Marketing Analyst requesting Bed, SUCCESS, Bed manufactured");
                break;
            case 2:
                Sofa.enqueue("Sofa");
                System.out.println("Marketing Analyst requesting Sofa, SUCCESS, Sofa manufactured");
                break;
            case 3:
                Chair.enqueue("Chair");
                System.out.println("Marketing Analyst requesting Chair, SUCCESS, Chair manufactured");
                break;
            case 4:
                Dresser.enqueue("Dresser");
                System.out.println("Marketing Analyst requesting Dresser, SUCCESS, Dresser manufactured");
                break;
            case 5:
                Table.enqueue("Table");
                System.out.println("Marketing Analyst requesting Table, SUCCESS, Table manufactured");
                break;
            case 6:
                Bookcase.enqueue("Bookcase");
                System.out.println("Marketing Analyst requesting Bookcase, SUCCESS, Bookcase manufactured");
                break;
        }
    }
    public void store(){

    }
    public void report(){
        System.out.println("Amount of Bed in Factory Line: " + Bed.getCount());
        System.out.println("Amount of Sofa in Factory Line: " + Sofa.getCount());
        System.out.println("Amount of Chair in Factory Line: " + Chair.getCount());
        System.out.println("Amount of Dresser in Factory Line: " + Dresser.getCount());
        System.out.println("Amount of Table in Factory Line: " + Table.getCount());
        System.out.println("Amount of Bookcase in Factory Line: " + Bookcase.getCount());

    }
}
