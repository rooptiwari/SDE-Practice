package Software_Engineer.Java8Feature.ArrayList_WayOfPrinting;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> tvShows = new ArrayList<>();
        tvShows.add("GOT");
        tvShows.add("SquidGame");
        tvShows.add("Money Hiest");

        System.out.println("========Lamnda Expraession===========");

        tvShows.forEach(show -> {
            System.out.println(show);
        });

        System.out.println("==========Iterator=========");

        Iterator<String> it = tvShows.iterator();
        while(it.hasNext()){
            String show = it.next();
            System.out.println(show);
        }

        System.out.println("==========Iterator=========");

        it = tvShows.iterator();
        it.forEachRemaining(show -> {
            System.out.println(show);
        });
    }
}
