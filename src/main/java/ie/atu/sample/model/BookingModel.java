package ie.atu.sample.model;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class BookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long attendeeCount;
    private String Status;
    private String orgName;
    @Getter
    private long roomId;

    public BookingModel() {

    }

    public Long getAttendeeCount() {return attendeeCount;}
    public void setAttendeeCount(long attendeeCount) {}
    public String getStatus() {return Status;}
    public void setStatus(String status) {}
    public String getOrgName() {return orgName;}
    public void setOrgName(String orgName) {}

    public void setRoomId(long roomId) {}

}


