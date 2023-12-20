public abstract class Elevator {

    Elevator previous;
    Elevator next;

    Status status;

    public Elevator(Elevator previous, Elevator next, Status status) {
        this.previous = previous;
        this.next = next;
        this.status = status;
    }

    int numOfFloor = 0;

    enum Status {
        FREE,
        BUSY
    }
}
