public class mainQ3 {
    public static void main(String[] args) {
        // created first room (roomA)
        HotelroomQ3 roomA = new HotelroomQ3();
        roomA.setRoomNumber(121);
        roomA.setRoomType("Single");
        roomA.setAvailability(0);//not available
        roomA.setRate(80);
    // created first room (roomB)
        HotelroomQ3 roomB = new HotelroomQ3();
        roomB.setRoomNumber(122);
        roomB.setRoomType("Double");
        roomB.setAvailability(1);// available
        roomB.setRate(100);

        hotel4 roomC = new hotel4(0, null, 0, 0);
        roomC.setRoomNumber(202);
        roomC.setRoomType("single");
        roomC.setAvailability(0);// available
        roomC.setRate(90);

        // print details for both rooms
        System.out.println(" the room number is " + roomA.getRoomNumber() +" the room type is " + roomA.getRoomType() +" The rooms availability is " + roomA.getAvailability() +" the rooms rate is " + roomA.getRate());

        System.out.print(" the room number is " + roomB.getRoomNumber() +" the room type is " + roomB.getRoomType() +" The rooms availability is " + roomB.getAvailability() +" the rooms rate is " + roomB.getRate() + "\n");

        System.out.print(" the room number is "+ roomC.getRoomNumber() +" the room type is " + roomC.getRoomType() +" The rooms availability is " + roomC.getAvailability() +" the rooms rate is " + roomC.getRate());
    }
}

