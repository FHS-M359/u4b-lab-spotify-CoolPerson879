import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Playlist {

    ArrayList<Song> songs = new ArrayList<>();

    public Playlist(Scanner file) throws FileNotFoundException {
        readFile(file);
    }

    /**
     * takes in a file, reads each line and  puts the values into an ArrayList of Song objects, songs
     * precondition: file seperated by commas
     * @param file
     */
    public void readFile(Scanner file) {
        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] lineArr = line.split(",");
            Song song = new Song(lineArr[0], lineArr[1], lineArr[2], Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4]), lineArr[5]);
            songs.add(song);
        }
    }


    /**
     * returns the array as a string formatted in the ideal way
     * @return out as String
     */
    public String toString() {
        String out = "";
        for (Song s : songs)
            //noinspection StringConcatenationInLoop annoying yellow line
            out += songs + "\n";
        return out;
    }

    /**
     * searches for genre given a string to search for
     * if string doesn't exist, print "no songs"
     * precondition: String s
     * @param s string used to search for genre
     */
    public void searchGenre(String s) {
        ArrayList<Song> out = new ArrayList<>();
        for (Song c : songs) {
            if (c.getGenre().equalsIgnoreCase(s)) {
                out.add(c);
            }
        }
        if (out.isEmpty())
            System.out.println("no songs found with given query");
        for (Song f : out)
            System.out.println(f);
    }

    /**
     * use a selection sort to sort the values of the artist names alphabetically from A - Z
     * void method, print to user instead
     * no precondition
     */
    public void SelectionSortAZArtist() {
        ArrayList<Song> list = new ArrayList<>();
        for (Song s : songs)
            list.add(s);


        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getArtist().compareToIgnoreCase(list.get(minIndex).getArtist()) < 0)
                    minIndex = j;

                //swap values
                Song temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);

            }

        }
        for (Song s : list)
            System.out.println(s);



    }

    /**
     * same function as the above but from Z-A
     * @return
     */
    public String SelectionSortZAArtist() {
        ArrayList<Song> list = new ArrayList<>();
        for (Song s : songs)
            list.add(s);


        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getArtist().compareToIgnoreCase(list.get(minIndex).getArtist()) > 0)
                    minIndex = j;

                //swap values
                Song temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);

            }

        }
        for (Song s : list)
            System.out.println(s);

        return "";

    }

    /**
     * use an insertion sort algorithm to sort the values of songs years from newest (largest number) to oldest (smallest)
     * void, returns nothing
     * prints to the console
     * no precondition necessary
     */
    public void InsertionSortYearNewToOld(){
        ArrayList<Song> list = new ArrayList<>();
        list = songs;
        for (int i = 0; i < list.size(); i++) {
            Song tempValue = list.get(i);
            // saves element value
            int position = i;
            // shift elements if necessary
            while(position > 0 && list.get(position-1).getYear() > tempValue.getYear()){
                list.set(position, list.get(position-1));
                position--;
            }
            // insert value in shifted position
            list.set(position, tempValue);

        }
        for (Song s : list)
            System.out.println(s);


    }
    /**
     * use an insertion sort algorithm to sort the values of songs years from oldest (smallest number) to newest (largest)
     * void, returns nothing
     * prints to the console
     * no precondition necessary
     */
    public void InsertionSortYearOldToNew(){
        ArrayList<Song> list;
        list = songs;
        for (int i = 0; i < list.size(); i++) {
            Song tempValue = list.get(i);
            // saves element value
            int position = i;
            // shift elements if necessary
            while(position > 0 && list.get(position-1).getYear() < tempValue.getYear()){
                list.set(position, list.get(position-1));
                position--;
            }
            // insert value in shifted position
            list.set(position, tempValue);

        }
        for (Song s : list)
            System.out.println(s);


    }
    }


