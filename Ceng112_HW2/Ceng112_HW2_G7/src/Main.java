import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MarketingAnalyst MA = new MarketingAnalyst();
        SofaWarehouse Sofa1 = new SofaWarehouse();
        BedWarehouse Bed1 = new BedWarehouse();
        ChairWarehouse Chair1 = new ChairWarehouse();
        DresserWarehouse Dresser1 = new DresserWarehouse();
        TableWarehouse Table1 = new TableWarehouse();
        BookcaseWarehouse Bookcase1 = new BookcaseWarehouse();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of random request cycles: ");
        int number = scanner.nextInt();

        for(int i = 0; i< number;i++){
            System.out.print((i+1)+".  ");
            int rand1 = (int)(Math.random()*3)+1;
            if(rand1 == 1){
                MA.create();
            }
            else if(rand1 == 2) {
                if (!MA.Bed.isEmpty()){
                    Bed1.Bed.push("Bed");
                    System.out.println("Storage Chief storing Bed, SUCCESS, Bed stored in bed warehouse");
                    MA.Bed.dequeue();
                }
                else if(!MA.Sofa.isEmpty()){
                    Sofa1.Sofa.push("Sofa");
                    System.out.println("Storage Chief storing Sofa, SUCCESS, Sofa stored in sofa warehouse");
                    MA.Sofa.dequeue();
                }
                else if(!MA.Chair.isEmpty()){
                    Chair1.Chair.push("Chair");
                    System.out.println("Storage Chief storing Chair, SUCCESS, Chair stored in chair warehouse");
                    MA.Chair.dequeue();
                }
                else if(!MA.Dresser.isEmpty()){
                    Dresser1.Dresser.push("Dresser");
                    System.out.println("Storage Chief storing Dresser, SUCCESS, Dresser stored in dresser warehouse");
                    MA.Dresser.dequeue();
                }
                else if(!MA.Table.isEmpty()){
                    Table1.Table.push("Table");
                    System.out.println("Storage Chief storing Table, SUCCESS, Table stored in table warehouse");
                    MA.Table.dequeue();
                }
                else if(!MA.Bookcase.isEmpty()){
                    Bookcase1.Bookcase.push("Bookcase");
                    System.out.println("Storage Chief storing Bookcase, SUCCESS, Bookcase stored in bookcase warehouse");
                    MA.Bookcase.dequeue();
                }
                else{
                    System.out.println("Storage Chief storing product, FAIL, There are no products in factory lines!!");
                }
            }
            else {
                int rand2 = (int)(Math.random()*6)+1;
                switch (rand2){

                    case 1:
                        if (Bed1.isStored()){
                            Bed1.Bed.pop();
                            Bed1.setCount_sold(Bed1.getCount_sold()+1);
                        System.out.println("Customer buying Bed, SUCCESS, Customer bought Bed");
                        }
                        else{
                            System.out.println("Customer buying Bed, FAIL, Bed warehouse is empty");
                        }
                        break;
                    case 2:
                        if (Sofa1.isStored()){
                            Sofa1.Sofa.pop();
                            Sofa1.setCount_sold(Sofa1.getCount_sold()+1);
                            System.out.println("Customer buying Sofa, SUCCESS, Customer bought Sofa");
                        }
                        else{
                            System.out.println("Customer buying Sofa, FAIL, Sofa warehouse is empty");
                        }
                        break;
                    case 3:
                        if (Chair1.isStored()){
                            Chair1.Chair.pop();
                            Chair1.setCount_sold(Chair1.getCount_sold()+1);
                            System.out.println("Customer buying Chair, SUCCESS, Customer bought Chair");
                        }
                        else{
                            System.out.println("Customer buying Chair, FAIL, Chair warehouse is empty");
                        }
                        break;
                    case 4 :
                        if (Dresser1.isStored()){
                            Dresser1.Dresser.pop();
                            Dresser1.setCount_sold(Dresser1.getCount_sold()+1);
                            System.out.println("Customer buying Dresser, SUCCESS, Customer bought Dresser");
                        }
                        else{
                            System.out.println("Customer buying Dresser, FAIL, Dresser warehouse is empty");
                        }
                        break;
                    case 5:
                    if (Table1.isStored()){
                        Table1.Table.pop();
                        Table1.setCount_sold(Table1.getCount_sold()+1);
                        System.out.println("Customer buying Table, SUCCESS, Customer bought Table");
                    }
                    else{
                        System.out.println("Customer buying Table, FAIL, Table warehouse is empty");
                    }
                    break;
                    case 6:
                    if (Bookcase1.isStored()){
                        Bookcase1.Bookcase.pop();
                        Bookcase1.setCount_sold(Bookcase1.getCount_sold()+1);
                        System.out.println("Customer buying Bookcase, SUCCESS, Customer bought Bookcase");
                    }
                    else{
                        System.out.println("Customer buying Bookcase, FAIL, Bookcase warehouse is empty");
                    }
                    break;

                }
            }
        }
        System.out.println("");
        System.out.println("Report:\n");
        MA.report();
        System.out.println("");
        System.out.println("Amount of Bed in Bed Warehouse: "+(Bed1.Bed.getTopIndex()+1));
        System.out.println("Amount of Sofa in Sofa Warehouse: "+(Sofa1.Sofa.getTopIndex()+1));
        System.out.println("Amount of Chair in Chair Warehouse: "+(Chair1.Chair.getTopIndex()+1));
        System.out.println("Amount of Dresser in Dresser Warehouse: "+(Dresser1.Dresser.getTopIndex()+1));
        System.out.println("Amount of Table in Table Warehouse: "+(Table1.Table.getTopIndex()+1));
        System.out.println("Amount of Bookcase in Bookcase Warehouse: "+(Bookcase1.Bookcase.getTopIndex()+1)+"\n");
        System.out.println("Amount of Bed Sold: "+(Bed1.getCount_sold()));
        System.out.println("Amount of Sofa Sold: "+(Sofa1.getCount_sold()));
        System.out.println("Amount of Chair Sold: "+(Chair1.getCount_sold()));
        System.out.println("Amount of Dresser Sold: "+(Dresser1.getCount_sold()));
        System.out.println("Amount of Table Sold: "+(Table1.getCount_sold()));
        System.out.println("Amount of Bookcase Sold: "+(Bookcase1.getCount_sold()));


    }
}
