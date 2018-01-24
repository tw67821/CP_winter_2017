package pl.waw.sgh.Hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelMenu {


    public static void main(String[] args) {


        int floors, rooms;
        int  select;
        String name,surname;
        int roomNumber;
        Scanner userInput = new Scanner(System.in);


        System.out.println("Let's create our Hotel !");
        System.out.println("Choose amount of floors");
        floors = userInput.nextInt();
        System.out.println("Choose amount of rooms");
        rooms = userInput.nextInt();
        Hotel testHotel = new Hotel(floors,rooms);


        do {
            System.out.println("1. View rooms arrangement");
            System.out.println("2. View amount of rooms on each floor");
            System.out.println("3. Check if any room is empty");
            System.out.println("4. Check how many empty rooms are in Hotel");
            System.out.println("5. Check if room is empty");
            System.out.println("6. Book a room");
            System.out.println("7. Check out person");
            System.out.println("8. Check if person has booked any room(s)");
            System.out.println("9. View all rooms booked by a person");
            System.out.println("10. Exit program");

            select = userInput.nextInt();

            switch (select) {
                case 1:
                    testHotel.printRooms();
                    System.out.println();
                    break;
                case 2:
                    testHotel.countRooms();
                    System.out.println();
                    break;
                case 3:
                   if(testHotel.isAnyRoomEmpty())
                       System.out.println("There is an empty room in hotel!");
                   else
                       System.out.println("There is no empty room in hotel!");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("There is/are "+ testHotel.howManyEmptyRooms() + " empty room(s) in hotel!");
                    break;
                case 5:

                    System.out.println("Choose room number");
                    roomNumber = userInput.nextInt();
                    if(testHotel.isRoomEmpty(roomNumber))
                        System.out.println("Room is empty!");
                    else
                        System.out.println("Room is not empty!");

                    System.out.println();

                    break;
                case 6:


                    System.out.println("Choose room number to book");
                    roomNumber = userInput.nextInt();
                    if(testHotel.isRoomEmpty(roomNumber)) {
                        System.out.println("State Name of person booking the room");
                        name = userInput.nextLine();
                        userInput.nextLine();
                        System.out.println("State Surname of person booking the room");
                        surname = userInput.nextLine();
                        System.out.println(surname);

                        testHotel.bookRoom(name,surname,roomNumber);

                        System.out.println("Room successfully booked ! ");
                    }
                    else
                        System.out.println("This room is already booked ! ");

                    System.out.println();

                    break;
                case 7:

                    System.out.println("State Surname of person booking the room");
                    userInput.nextLine();
                    surname = userInput.nextLine();

                    if( testHotel.checkOut(surname))
                        System.out.println("Checked out this person!");
                    else
                        System.out.println("Did not find this person");

                    break;
                case 8:

                    System.out.println("State Surname of person you are looking for");
                    userInput.nextLine();
                    surname = userInput.nextLine();
                    System.out.println(surname);
                    if( testHotel.isRentingRoom(surname))
                        System.out.println("Person is renting room!");
                    else
                        System.out.println("Person is not renting any room");

                    break;

                case 9:

                    ArrayList<Integer> temp;

                    System.out.println("State Surname of person you are looking for");
                    userInput.nextLine();
                    surname = userInput.nextLine();
                    temp = testHotel.getBookedRooms(surname);
                    if(temp != null) {
                        System.out.println("Rooms rented:");
                        for (Integer i : temp)
                            System.out.print(i + ", ");

                        System.out.println("");
                    }
                    else
                        System.out.println("Null");
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Wrong Input!");
            }

        } while (select != 10);

    }
}
