package com.dap504;

public class Player {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    private int rank;


    public Player(String firstName, String lastName, int rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }


//    @Override
//    public String toString() {
//        return "Player{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", rank=" + rank +
//                '}';
//    }
}
