import java.util.Map;

/**
 * CLASS - RoomSearchService
 *
 * Use Case 4: Room Search & Availability Check
 *
 * @version 4.0
 */
public class RoomSearchService {

    /**
     * Displays available rooms along with their details.
     * This method only reads inventory data.
     */
    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Available Rooms\n");

        // Check Single Room availability
        if (availability.get("Single Room") > 0) {
            System.out.println("Single Room:");
            singleRoom.displayRoomDetails();
            System.out.println("Available Rooms: " + availability.get("Single Room"));
            System.out.println();
        }

        // Check Double Room availability
        if (availability.get("Double Room") > 0) {
            System.out.println("Double Room:");
            doubleRoom.displayRoomDetails();
            System.out.println("Available Rooms: " + availability.get("Double Room"));
            System.out.println();
        }

        // Check Suite Room availability
        if (availability.get("Suite Room") > 0) {
            System.out.println("Suite Room:");
            suiteRoom.displayRoomDetails();
            System.out.println("Available Rooms: " + availability.get("Suite Room"));
            System.out.println();
        }
    }
}