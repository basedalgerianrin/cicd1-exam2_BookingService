package ie.atu.sample.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity @Table
public class BookingModel {
    private long attendeeCount;
    private String Status;
    private String orgName;
    private long roomId;



}
