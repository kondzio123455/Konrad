public class HotelroomQ3 {
    // room attributes
    private int roomNumber;
    private String roomType;
    private int availability;
    private double rate;
    //contructor
    public HotelroomQ3() {
    }
    // room number getter and setter
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    // room type getter and setter
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    // availability getter and setter
    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        if (availability == 0) 
        {
            this.availability = availability;
            System.out.println("room is not available");
        } 
        else if (availability == 1) 
        {
            this.availability = availability;
            System.out.println("room is available");
        }
    }
    // rate getter and setter
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate >= 0) {
            this.rate = rate;
        }
    }
}


