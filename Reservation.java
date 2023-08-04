
import java.time.LocalDateTime;

public class Reservation {
    private String reservationId;
    private String licensePlate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private ParkingSlot reservedSlot;

    public Reservation(String reservationId, String licensePlate, LocalDateTime entryTime, LocalDateTime exitTime, ParkingSlot reservedSlot) {
        this.reservationId = reservationId;
        this.licensePlate = licensePlate;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.reservedSlot = reservedSlot;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public ParkingSlot getReservedSlot() {
        return reservedSlot;
    }

    // Other methods...
}
