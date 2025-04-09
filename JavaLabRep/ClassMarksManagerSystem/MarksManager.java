package JavaLabRep.ClassMarksManagerSystem;

import java.util.ArrayList;
import java.util.Collections;

public class MarksManager {
    private ArrayList<Integer> marks = new ArrayList<>();

    //to add marks
    public void addMark(int mark){
        marks.add(mark);
        System.out.println("Marks added successfully!");
    }

    //to display the marks 
    public void displayMark(){
        if(marks.isEmpty()){
            System.out.println("No marks available to display.");
        }
        else{
            System.out.println("Marks: "+marks);
        }
    }

    //to update the marks at the mentioned index
    public void updateMarks(int index, int newMarks){
        if(index>=0 && index<marks.size()){
            marks.set(index, newMarks);
            System.out.println("Marks updated successfully!");
        }
        else{
            System.out.println("Wrong index!");
        }
    }

    //remove marks from the mentioned index
    public void removeMarks(int index){
        if(index>=0 && index<marks.size()){
            marks.remove(index);
            System.out.println("Marks removed successfully!");
        }
        else{
            System.out.println("Wrong index!");
        }
    }

    //remove marks by mentioned value
    public void removeMarksbyValue(int value){
        if(marks.remove((Integer)value)){
            System.out.println("Mentioned mark removed successfully");
        }
        else{
            System.out.println("Wrong mark provided!");
        }
    }

    //to calcutale the average of the marks
    public double calAvgMarks(){
        if(marks.isEmpty()){
            System.out.println("No marks to calculate!");
            return 0.0;
        }
        int sum=0;
        for(int m : marks){
            sum+=m;
        }
        double average = (double) sum/ marks.size();
        System.out.println("Average of the marks: "+average);
        return average;
    }

    //to search a mark
    public void searchMarks(int mark){
        if(marks.contains(mark)){
            System.out.println("Mark is present.");
        }
        else{
            System.out.println("Mark is not present.");
        }
    }

    //to get the higgest marks
    public int getHighMark(){
        if(marks.isEmpty()){
            System.out.println("No marks available.");
            return -1;
        }
        else{
            int max=Collections.max(marks);
            System.out.println("The higgest mark is: "+max);
            return max;
        }
    }

    //to get the lowest marks
    public int getLowMark(){
        if(marks.isEmpty()){
            System.out.println("No marks available.");
            return -1;
        }
        else{
            int min=Collections.min(marks);
            System.out.println("The lowest mark is: "+min);
            return min;
        }
    }

    //to get in ascending order
    public void forAscendingMarks(){
        Collections.sort(marks);
        System.out.println("Marks in ascending order: "+marks);
    }

    //to get the descending order
    public void forDescendingMarks(){
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println("Marks in descending order: "+marks);
    }

}
