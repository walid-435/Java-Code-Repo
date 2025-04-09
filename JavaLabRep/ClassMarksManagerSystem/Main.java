package JavaLabRep.ClassMarksManagerSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MarksManager manager=new MarksManager();
        
        int choice;

        do { 
            System.out.println("\nMarks Manager System: ");
            System.out.println("1. Add marks.");
            System.out.println("2. Display marks: ");
            System.out.println("3. Update marks.");
            System.out.println("4. Remove marks by index.");
            System.out.println("5. Remove marks by value.");
            System.out.println("6. Calculate the average.");
            System.out.println("7. Search for marks.");
            System.out.println("8. Get the highest mark.");
            System.out.println("9. Get the lowest mark.");
            System.out.println("10. Sort marks in ascending order.");
            System.out.println("11. Sort marks in desecending order.");
            System.out.println("12. Exit");
            
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();

            switch (choice) {

                case 1:

                System.out.print("Enter your mark to add: ");
                int toadd=sc.nextInt();
                manager.addMark(toadd);
                break;
                    
                case 2:

                manager.displayMark();
                break;
                    
                case 3: 

                System.out.print("Enter the index number: ");
                int indextoupdate=sc.nextInt();
                System.out.print("Enter the mark to update: ");
                int newMark=sc.nextInt();
                manager.updateMarks(indextoupdate, newMark);
                break;

                case 4:

                System.out.print("Enter index number to remove: ");
                int indextorev=sc.nextInt();
                manager.removeMarks(indextorev);
                break;

                case 5:

                System.out.print("Enter the mark to remove: ");
                int valuetorev=sc.nextInt();
                manager.removeMarksbyValue(valuetorev);
                break;

                case 6:

                System.out.print("Average marks: " +manager.calAvgMarks());
                break;

                case 7:

                System.out.print("Enter the marks to search: ");
                int searchmarks=sc.nextInt();
                manager.searchMarks(searchmarks);
                break;

                case 8: 

                manager.getHighMark();
                break;

                case 9:

                manager.getLowMark();
                break;

                case 10: 

                manager.forAscendingMarks();
                manager.displayMark();
                break;

                case 11:

                manager.forDescendingMarks();
                manager.displayMark();
                break;

                case 12: 

                System.out.println("Leaving System!");
                break;

                default:
                System.out.println("Wrong choice! Try agaiin!");

            }

        } while (choice!=12);

    }
}
