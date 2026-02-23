import java.util.ArrayList;

public class InsertionSortExample {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(6);
        nums.add(4);
        nums.add(2);
        nums.add(18);
        nums.add(9);
        nums.add(11);
        nums.add(4);
        nums.add(7);
        nums.add(24);
        nums.add(17);

        System.out.println("Current contents: " + nums);
        insertionSort(nums);
        System.out.println("After sorting:    " + nums);
    }

    public static void insertionSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int tempValue = list.get(i);
            // saves element value
            int position = i;
            // shift elements if necessary
            while(position > 0 && list.get(position-1) > tempValue){
                list.set(position, list.get(position-1));
                position--;
            }
            // insert value in shifted posutiuon
            list.set(position, tempValue);

        }
    }
}