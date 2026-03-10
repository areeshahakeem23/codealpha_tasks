import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class Hotel {
    Reservation reservation;
    public static String hotelName="Royal Arcadian";
    ArrayList <Room> roomList=new ArrayList<>();
    ArrayList <Reservation> reservationList=new ArrayList<>();
    public void addRoom(int id, String type, int price, boolean isAvailable) {
        Room r = new Room(id, type, price, isAvailable);
        roomList.add(r);
       saveRoomsToFile();
    }

    public void removeRoom(int id){
        for(Room r : roomList){
            if(r.getRoomId() == id){
                roomList.remove(r);
                break;
            }
        }
    }
    public void showRooms(){
        for(Room r:roomList){
            System.out.println("Room id :"+r.roomId+"   /    "+"Room type :"+r.roomType+"   /   "+"Room price :"+r.pricePerNight+"   /   "+"Room availability :"+r.isAvailable);
        }
    }
    public void bookRoom(int roomId,int reservationId,String customerName, int checkInDate, int checkOutDate,int noOfNights){
        for(Room r : roomList){
            if(r.getRoomId() == roomId){
                if(r.isAvailable()){
                    Reservation res = new Reservation(r,reservationId, customerName, checkInDate,  checkOutDate, noOfNights);
                    reservationList.add(res);
                    saveReservationsToFile();
                    r.setAvailability(false);
                    saveRoomsToFile();
                    System.out.println("Room booked successfully!");
                }
                else{
                    System.out.println("Room is already booked!");
                }
                return;
            }
        }
        System.out.println("Room not found!");
    }

    public void showReservation(){
        for(Reservation e:reservationList){
            System.out.println("......reserved rooms detail......");
            e.displayReservationDetail();
        }
    }
    public void cancelReservation(int id){
        for(Reservation e : reservationList){
            if(e.getReservationId() == id){
                reservationList.remove(e);
                e.cancelReservation();
                saveReservationsToFile();
                e.room.setAvailability(true);
                saveRoomsToFile();
                break;
            }
            else {
                System.out.println("reservation not found");
            }
        }
    }
    public void saveRoomsToFile(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("rooms.txt"));
            for(Room r : roomList){
                bw.write(r.roomId + "," + r.roomType + "," +
                        r.pricePerNight + "," + r.isAvailable);
                bw.newLine();
            }
            bw.close();
        }
        catch(IOException e){
            System.out.println("Error saving rooms!");
        }
    }
    public void saveReservationsToFile(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("reservations.txt"));
            for(Reservation r : reservationList){
                bw.write(r.reservationId + "," +
                        r.customer + "," +
                        r.room.getRoomId() + "," +
                        r.checkInDate + "," +
                        r.checkOutDate + "," +
                        r.noOfNights);
                bw.newLine();
            }
            bw.close();
        }
        catch(IOException e){
            System.out.println("Error saving reservations!");
        }
    }
}
