import java.util.Scanner;

public class LoopForElevators implements ElevatorFree, Callable {

    Elevator status;
    Elevator first;
    Elevator last;
    int numOfFloors;

    public LoopForElevators(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public Elevator free() {
        return status;
    }

    public void addAnEvenElevator() {
        for (int i = 0; i < numOfFloors; i++) {
            Elevator newElevator = new EvenElevator(this.last, this.first, Elevator.Status.FREE);
            this.last = newElevator;
            if (first == null) {
                first = last;
            } else if (first == last) {
                first.next = last;
            } else {
                last.previous.next = last;
            }
        }
    }

    public void addAnOddElevator() {
        for (int i = 0; i < numOfFloors; i++) {
            Elevator newElevator = new OddElevator(this.last, this.first, Elevator.Status.FREE);
            this.last = newElevator;
            if (first == null) {
                first = last;
            } else if (first == last) {
                first.next = last;
            } else {
                last.previous.next = last;
            }
        }
    }

    public void addAnEmployeeElevator() {
        for (int i = 0; i < numOfFloors; i++) {
            Elevator newElevator = new EmployeeElevator(this.last, this.first, Elevator.Status.FREE);
            this.last = newElevator;
            if (first == null) {
                first = last;
            } else if (first == last) {
                first.next = last;
            } else {
                last.previous.next = last;
            }
        }
    }

    public boolean isFree() {
        Elevator current = new EvenElevator(null, first, Elevator.Status.FREE);
        for (int i = 0; i < numOfFloors - 1; i++) {
            current = current.next;
            if (current.status != Elevator.Status.FREE) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean callElevator() {
        if (isFree()) {
            return true;
        } else {
            return false;
        }
    }
}
