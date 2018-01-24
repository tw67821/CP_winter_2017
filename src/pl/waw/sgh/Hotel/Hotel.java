package pl.waw.sgh.Hotel;

import java.util.ArrayList;


public class Hotel {

    private int numberOfFloors;
    private int numberOfRooms;
    ArrayList<RoomNumber> hotelRooms;
    ArrayList<Person> persons;

    public Hotel(int numberOfFloors,int numberOfRooms) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        hotelRooms = new ArrayList<>();
        persons = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {

        int roomsPerFloor = numberOfRooms / numberOfFloors; // try to divide rooms across floors evenly
        int remainingRooms = numberOfRooms % numberOfFloors; // if some rooms are "left"
        int roomNumber = 1;


        if (remainingRooms != 0)
            for (int floorNumber = 1; floorNumber <= remainingRooms; ++floorNumber)
                for (int m = 0; m < roomsPerFloor + 1; ++m) {
                    hotelRooms.add(new RoomNumber(floorNumber, roomNumber));
                    ++roomNumber;
                }

        for (int floorNumber = remainingRooms + 1; floorNumber <= numberOfFloors; ++floorNumber)
            for (int j = 0; j < roomsPerFloor; ++j) {
                hotelRooms.add(new RoomNumber(floorNumber, roomNumber));
                ++roomNumber;
            }
    }
    public void printRooms(){

            int currFloor = 0;
            for(RoomNumber room : hotelRooms) {
                if(room.getFloorNumber() > currFloor){
                    System.out.println();
                    System.out.println("Floor "+room.getFloorNumber());
                    currFloor = room.getFloorNumber();
                }
                System.out.print("Room " + room.getRoomNumber() + " ");
            }
        }

    public void countRooms(){

        int currFloor = 1;
        int roomCounter = 0;
        for(RoomNumber room : hotelRooms) {
            if(room.getFloorNumber() > currFloor){
                System.out.println("Floor "+currFloor+ " has "+ roomCounter + " room(s)");
                currFloor = room.getFloorNumber();
                roomCounter = 0;
            }
            ++roomCounter;
        }
        System.out.println("Floor "+currFloor+ " has "+ roomCounter + " room(s)");
    }

    public boolean isAnyRoomEmpty(){

       boolean anyRoomEmpty = false;

        for(RoomNumber room : hotelRooms) {
            if(room.isEmpty())
                anyRoomEmpty = true;

        }
       return anyRoomEmpty;
    }

    public int howManyEmptyRooms(){

        int emptyRoomCounter = 0;

        for(RoomNumber room : hotelRooms) {
            if(room.isEmpty())
                ++emptyRoomCounter;

        }
        return emptyRoomCounter;
    }

    public void bookRoom(String name, String surname,int roomNumber){

        boolean isAlreadyInList = false;
        Person newPerson;
        Person oldPerson;

        for (Person person : persons) {  // checking if the person is already booking something
            if (person.getSurname().equals(surname)) { //if yes
                isAlreadyInList = true;
                oldPerson = person.getInstance();

                for (RoomNumber room : hotelRooms) { //use old person
                    if (room.getRoomNumber() == roomNumber) {
                        room.setPerson(oldPerson);
                        break;
                    }
                }
                oldPerson.bookRoom(roomNumber);
            }
        }

        if (!isAlreadyInList) { //if not
                newPerson = new Person(name, surname); //create new person
                persons.add(newPerson);

                for (RoomNumber room : hotelRooms) {
                    if (room.getRoomNumber() == roomNumber) {
                        room.setPerson(newPerson);
                        break;
                    }
                }
                newPerson.bookRoom(roomNumber);
            }

    }

    public boolean checkOut(String surname){

        boolean isCheckedOut = false;
        if(!persons.isEmpty()) { //if there are no renters yet there is no point in checking rooms
            for (RoomNumber room : hotelRooms) {
                if (room.getPersonSurname() != null && room.getPersonSurname().equals(surname) ) {
                    room.setPerson(null);
                    isCheckedOut = true;
                }
            }


            for (Person person : persons) {
                if (person.getSurname().equals(surname)) {
                    person.setBookedRooms();
                }
            }
        }
        return isCheckedOut;
    }

    public boolean isRoomEmpty(int roomNumber){
       boolean isEmpty = false;

       for(RoomNumber room : hotelRooms)
            if(room.getRoomNumber() == roomNumber)
                if(room.isEmpty()) {
                    isEmpty = true;
                    break;
                }

      return isEmpty;
    }

    public boolean isRentingRoom(String surname){
        boolean isRenting = false;

        for(Person person : persons) {
            if(person.getSurname().equals(surname)) {
                if(!person.getBookedRooms().isEmpty())
                    isRenting = true;
            }
        }

        return isRenting;
    }

    public ArrayList<Integer> getBookedRooms(String surname) {


        for(Person person : persons) {
            if(person.getSurname().equals(surname)) {
                if(!person.getBookedRooms().isEmpty())
                   return person.getBookedRooms();
            }
        }

        return null;
    }




}
