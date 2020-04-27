package com.dap504;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("this is going to git hub");


//        List<String> myList  = new ArrayList<>();
//        myList.add("Hadley");
//        myList.add("Bronwyn");
//        myList.add("Emily");
//
//        for (int i = 0; i < myList.size() ; i++) {
//            System.out.println(myList.get(i));
//
//        }

        List<Player> players = new ArrayList<>();

        players.add(new Player("Roger", "Holden", 555));
        players.add(new Player("Hadley", "Holden", 21));

        for (Player theplayer: players ) {
            System.out.print(theplayer.getFirstName() + " ");
            System.out.println(theplayer.getLastName());
        }

//        for (Player theplayer : players) {
//®
//
//        }


    }
}
