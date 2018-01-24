package pl.waw.sgh.Hotel;

public class RoomNumber {

    private int floorNumber;
    private int roomNumber;
    private Person person;

    public RoomNumber(int floorNumber,int roomNumber){
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        person = null;
    }

    public boolean isEmpty(){

        if(person == null)
            return true;
        return false;
    }

    public String getPersonSurname(){
        if(person!= null)
            return person.getSurname();
        else
            return null;
    }

    public void setPerson(Person person){
        this.person = person;
    }


    public int getRoomNumber(){
        return roomNumber;
    }
    public int getFloorNumber(){
        return floorNumber;
    }

}
