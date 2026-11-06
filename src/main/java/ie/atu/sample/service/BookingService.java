package ie.atu.sample.service;
import ie.atu.sample.service.BookingService;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.dto.Bookingdto;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class BookingService {

    private final BookingRepository bookingRepository;
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
}
