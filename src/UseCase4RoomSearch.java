/**
 * MAIN CLASS - UseCase4RoomSearch
 *
 * Use Case 4: Room Search & Availability Check
 *
 * @version 4.0
 */
public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Initialize search service
        RoomSearchService searchService = new RoomSearchService();

        System.out.println("Hotel Room Search\n");

        // Perform search (read-only operation)
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}