import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) throws FileNotFoundException {
        Playlist p = new Playlist();
        p.readFile();
        Scanner in = new Scanner(System.in);
        int next = 0;

        boolean wtong = true;
        while(wtong){
        try {
            System.out.println("Spotify Menu");
            System.out.println("1 - Sort by Artist (A-Z)");
            System.out.println("2 - Sort by Artist (Z-A)");
            System.out.println("3 - Sort by Year (Oldest to Newest)");
            System.out.println("4 - Sort by Year (Newest to Oldest)");
            System.out.println("5 - Sort by Genre");
            System.out.println("6 - Display all Songs");
            System.out.println("7 - Quit");
            next = in.nextInt();
            wtong = false;
        } catch (InputMismatchException e) {
            System.out.println("lets try that again, input a number");
            in.nextLine();
        }}
        if(next == 1){

        }
        else if (next == 6){
            System.out.println("Enter in a genre to search for");
            in.nextLine();
            String query = in.nextLine();
            p.searchGenre(query);
        }



    }



//    public static void SelectionSort(ArrayList<Integer> list){
//        for (int i = 0; i < list.size() - 1; i++) {
//            int minIndex = i;
//
//            for (int j = i+1; j < list.size(); j++) {
//                if(list.get(j) < list.get(minIndex))
//                    minIndex = j;
//
//                //swap values
//                int temp = list.get(i);
//                list.set(i, list.get(minIndex));
//                list.set(minIndex, temp);
//
//            }
//        }
//    }
}
