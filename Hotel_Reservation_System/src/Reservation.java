public class Reservation {
    Room room;
    int reservationId;
    String customer;
    int checkInDate;
    int checkOutDate;
    int noOfNights;
    int amount;
    boolean isBooked;
    Reservation(Room room, int reservationId, String customer,
                int checkInDate, int checkOutDate, int noOfNights){
        this.room = room;
        this.reservationId = reservationId;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.noOfNights = noOfNights;
        this.isBooked = true;
        room.setAvailability(false);
        calculateTotalAmount();
    }
    void cancelReservation(){
        room.setAvailability(true);
        isBooked = false;
    }
    void calculateTotalAmount(){
        amount=noOfNights*room.getPricePerNight();
    }
    void displayReservationDetail(){
        System.out.println("..........................");
        System.out.println("Reservation id :"+reservationId);
        System.out.println("Reserved room :"+room.getRoomId());
        System.out.println("Customer name :"+customer);
        System.out.println("CheckIn date :"+checkInDate);
        System.out.println("CheckOut date :"+checkOutDate);
        System.out.println("Total nights :"+noOfNights);
        System.out.println("Price per night :"+room.pricePerNight);
        System.out.println("Total amount :"+amount);
    }
    int getReservationId(){
        return reservationId;
    }
}
