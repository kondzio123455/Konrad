public class mainQ4 {
    public static void main(String[] args) {
        // created first room (roomA)
        HotelroomQ4 roomA = new HotelroomQ4();
        roomA.setRoomNumber(121);
        roomA.setRoomType("Single");
        roomA.setAvailability(0);
        roomA.isOccupied();//not available
        roomA.setRate(80);
    // created first room (roomB)
        HotelroomQ4 roomB = new HotelroomQ4();
        roomB.setRoomNumber(122);
        roomB.setRoomType("Double");
        roomB.setAvailability(1);
        roomB.isOccupied();// available
        roomB.setRate(100);

        hotel4 roomC = new hotel4(0, null, 0, 0);
        roomC.setRoomNumber(202);
        roomC.setRoomType("single");
        roomC.setAvailability(0);
        roomC.isOccupied();// available
        roomC.setRate(90);

        // print details for both rooms
        System.out.println(" the room number is " + roomA.getRoomNumber() +" the room type is " + roomA.getRoomType() +" The rooms availability is " + roomA.getIsOccupied() +" the rooms rate is " + roomA.getRate());

        System.out.print(" the room number is " + roomB.getRoomNumber() +" the room type is " + roomB.getRoomType() +" The rooms availability is " + roomB.getIsOccupied() +" the rooms rate is " + roomB.getRate() + "\n");

        System.out.print(" the room number is "+ roomC.getRoomNumber() +" the room type is " + roomC.getRoomType() +" The rooms availability is " + roomC.getIsOccupied() +" the rooms rate is " + roomC.getRate());
    }
}

