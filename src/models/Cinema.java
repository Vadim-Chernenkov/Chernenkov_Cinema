package models;

import java.util.List;

public class Cinema <T> {

    private List<User> users;
    private List<Tickets> tickets;
    private int numberOfTickets;
    private int idCinema;
    private int date;
    private String nameOfmovie;
    private List<T> list;

    public Cinema(){
        this.list = list;
        this.numberOfTickets = numberOfTickets;
        this.idCinema = idCinema;
        this.date= date;
        this.nameOfmovie = nameOfmovie;
    }

    public void printList(){
        for (int i=0; i <list.size(); i++){
            System.out.println(i+ "" + list.get(i));
        }
    }
}
