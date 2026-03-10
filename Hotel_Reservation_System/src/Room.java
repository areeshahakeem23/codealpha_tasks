public class Room {
    int roomId;
    String roomType;
    int pricePerNight;
    boolean isAvailable;
    Room(int roomId,String roomType,int pricePerNight,boolean isAvailable){
        this.roomId=roomId;
        this.roomType=roomType;
        this.pricePerNight=pricePerNight;
        this.isAvailable=isAvailable;
    }
   int getPricePerNight(){
        return pricePerNight;
   }
   boolean isAvailable(){
        return isAvailable;
   }
    void setAvailability(boolean status){
        isAvailable = status;
    }
    public int getRoomId() {
        return roomId;
    }
}
