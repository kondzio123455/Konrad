public class mainQ1 {

    public static void main(String[] args) {
        HotelroomQ1 roomA = new HotelroomQ1 ();
        roomA.setRoomNumber(121);
        roomA.setRoomType( "Single");

        HotelroomQ1 roomB = new HotelroomQ1();
        roomB.setRoomNumber(122);
        roomB.setRoomType( "Double");
        
        

        System.out.println("this the room number " + roomA.getRoomNumber()  + " the type is " + roomA.getRoomType()  );
        System.out.println("this the room number " + roomB.getRoomNumber()  + " the type is " + roomB.getRoomType()  );
        //main roomB = new main("this the room number " + roomNumber  + "the type is " + roomType  );
    }

}
