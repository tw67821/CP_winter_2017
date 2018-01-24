package pl.waw.sgh.Hotel;

import java.util.ArrayList;

public class Person {

    private String Name;
    private String Surname;
    private ArrayList<Integer> bookedRooms;

    public Person(String Name, String Surname){
        this.Name = Name;
        this.Surname = Surname;
        bookedRooms = new ArrayList<Integer>();
    }

    public void bookRoom(int roomNumber){

        bookedRooms.add(roomNumber);

    }

    public ArrayList<Integer> getBookedRooms() {
        return bookedRooms;
    }

    public void setBookedRooms() {
        this.bookedRooms.clear();
    }

    public Person getInstance(){
        return this;
    }

    public String getSurname() {
        return Surname;
    }
}
