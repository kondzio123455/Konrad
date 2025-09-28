public class mainQ2 {
    public static void main(String[] args) {
        // created first room (roomA)
        HotelroomQ2 roomA = new HotelroomQ2();
        roomA.setRoomNumber(121);
        roomA.setRoomType("Single");
        roomA.setAvailability(0);//not available
        roomA.setRate(80);
    // created first room (roomB)
        HotelroomQ2 roomB = new HotelroomQ2();
        roomB.setRoomNumber(122);
        roomB.setRoomType("Double");
        roomB.setAvailability(1);// available
        roomB.setRate(100);
        // print details for both rooms
        System.out.println(" the room number is " + roomA.getRoomNumber() +" the room type is " + roomA.getRoomType() +" The rooms availability is " + roomA.getAvailability() +" the rooms rate is " + roomA.getRate());
        System.out.print(" the room number is " + roomB.getRoomNumber() +" the room type is " + roomB.getRoomType() +" The rooms availability is " + roomB.getAvailability() +" the rooms rate is " + roomB.getRate());
    }
}

