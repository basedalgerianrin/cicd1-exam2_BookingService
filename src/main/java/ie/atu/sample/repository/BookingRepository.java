package ie.atu.sample.repository;
import ie.atu.sample.model.BookingModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface BookingRepository
        extends JpaRepository<BookingModel, Long>{
}
