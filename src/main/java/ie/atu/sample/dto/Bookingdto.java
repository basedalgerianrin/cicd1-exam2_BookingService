package ie.atu.sample.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Bookingdto {
    @NotBlank String orgName;
    @NotNull long roomID;
    @NotNull long bookingID;
    @NotNull long attendeeCount;
    @NotNull String Status;
}
