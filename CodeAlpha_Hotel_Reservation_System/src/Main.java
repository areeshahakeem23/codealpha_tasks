import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Hotel hotel=new Hotel();
    Scanner sc=new Scanner(System.in);
    int choice;
    do{
        System.out.println(".......Hotel reservation system....");
        System.out.println("enter 1 to add room");
        System.out.println("enter 2 to book room");
        System.out.println("enter 3 to show room deatil");
        System.out.println("enter 4 to show reservation");
        System.out.println("enter 5 to cancel reservation");
        System.out.println("enter 6 to remove room");
        System.out.println("enter 7 to exit ");
        System.out.println("........................");
        System.out.println("enter yor choice!!!");
        choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("enter room id :");
                int roomId = sc.nextInt();
                sc.nextLine();
                System.out.println("enter room type");
                String type=sc.nextLine();
                System.out.println("enter price");
                int price=sc.nextInt();
                System.out.println("enter the avaliablity status");
                boolean status=sc.nextBoolean();
                hotel.addRoom(roomId,type,price,status);
                System.out.println("room added successfully");
                System.out.println("....................");
                break;
            case 2:
                System.out.print("Enter Room ID: ");
                int roomId1= sc.nextInt();
                System.out.print("Enter Reservation ID: ");
                int resId = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Customer Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Check-in Date: ");
                int checkIn = sc.nextInt();
                System.out.print("Enter Check-out Date: ");
                int checkOut = sc.nextInt();
                System.out.print("Enter Number of Nights: ");
                int nights = sc.nextInt();
                hotel.bookRoom(roomId1, resId, name, checkIn, checkOut, nights);
                System.out.println("room booked successfully");
                System.out.println("........................");
                break;
            case 3:
                hotel.showRooms();
                break;
            case 4:
                hotel.showReservation();
                break;
            case 5:
                System.out.println("enter id to cancel");
                int id=sc.nextInt();
                hotel.cancelReservation(id);
                System.out.println("reservation cancelled successfully");
                System.out.println("........................");
                break;
            case 6:
                System.out.println("enter id to remove room");
                int id2=sc.nextInt();
                hotel.removeRoom(id2);
                System.out.println("room removed successfully");
                System.out.println(".......................");
                break;
            case 7:
                System.out.println("exitting...Thank you!");
                System.exit(0);
            default:
                System.out.println("wrong choice....try again!!!!");
        }
    }while(choice!=7);
}
}
