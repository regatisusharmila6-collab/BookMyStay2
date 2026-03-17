/**
 * ABSTRACT CLASS - Room
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * @version 2.1
 */

public abstract class Room{

    // Number of beds available in the room
    protected int numberOfBeds;

    // Total size of the room in square feet
    protected int squareFeet;

    // Price per night
    protected double pricePerNight;

    /**
     * Constructor to initialize room attributes
     */
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    /**
     * Displays room details
     */
    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}
