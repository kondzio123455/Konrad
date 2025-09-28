public class HotelroomQ4 {
    // room attributes
    private int roomNumber;
    private String roomType;
    private int availability;
    private double rate;
    private boolean isOccupied;
    //contructor
    public HotelroomQ4() {
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

        public boolean getIsOccupied() {
        return isOccupied;
    }
    

    public void isOccupied() {
        if (availability == 0) {
            isOccupied = true;
            System.out.println("room is occupied");
        } else if (availability == 1) {
            isOccupied = false;
            System.out.println("room is not occupied");
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


