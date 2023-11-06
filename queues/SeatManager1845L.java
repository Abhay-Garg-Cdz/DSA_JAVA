package queues;

// import java.util.PriorityQueue;
import java.util.TreeSet;

public class SeatManager1845L {

    // Approach - 1 : Using PriorityQueue
    /*
     * private PriorityQueue<Integer> seats;
     * public SeatManager1845L(int n){
     * seats = new PriorityQueue<>();
     * for (int i = 1; i <= n; i++) {
     * seats.offer(i);
     * }
     * }
     * 
     * public int reserve() {
     * if(!seats.isEmpty()){
     * int reserveSeat = seats.poll();
     * return reserveSeat;
     * }
     * return -1;
     * }
     * 
     * public void unreserve(int seatNumber) {
     * seats.offer(seatNumber);
     * }
     */

    // Approach -2 [Using Bit-Manipulation]

    /*
     * private BitSet seats; // Bitset to track seat reservation status
     * 
     * public SeatManager(int n) {
     * seats = new BitSet(n);
     * }
     * 
     * public int reserve() {
     * int nextAvailableSeat = seats.nextClearBit(0); // Find the first unset (0)
     * bit
     * seats.set(nextAvailableSeat); // Reserve the seat (set the bit to 1)
     * return nextAvailableSeat + 1; // Seat numbers are 1-based, so add 1
     * }
     * 
     * public void unreserve(int seatNumber) {
     * // Convert the seat number to a 0-based index
     * int seatIndex = seatNumber - 1;
     * if (seats.get(seatIndex)) {
     * seats.clear(seatIndex); // Mark the seat as unreserved (set the bit to 0)
     * }
     * }
     */

    // Approach -3 [Using TreeSet]

    private TreeSet<Integer> seats;

    public SeatManager1845L(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value of n.");
        }

        seats = new TreeSet<>();
        for (int i = 1; i <= n; ++i) {
            seats.add(i);
        }
    }

    public int reserve() {
        if (seats.isEmpty()) {
            return -1; // No available seats.
        }
        return seats.pollFirst();
    }

    public void unreserve(int seatNumber) {
        if (seatNumber > 0) {
            seats.add(seatNumber);
        }
    }
}
