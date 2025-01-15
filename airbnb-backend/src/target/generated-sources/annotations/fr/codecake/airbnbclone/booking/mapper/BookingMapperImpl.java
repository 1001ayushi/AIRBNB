package fr.codecake.airbnbclone.booking.mapper;

import fr.codecake.airbnbclone.booking.application.dto.BookedDateDTO;
import fr.codecake.airbnbclone.booking.application.dto.NewBookingDTO;
import fr.codecake.airbnbclone.booking.domain.Booking;
import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-15T15:59:54+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.v20241217-1506, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class BookingMapperImpl implements BookingMapper {

    @Override
    public Booking newBookingToBooking(NewBookingDTO newBookingDTO) {
        if ( newBookingDTO == null ) {
            return null;
        }

        Booking booking = new Booking();

        booking.setStartDate( newBookingDTO.startDate() );
        booking.setEndDate( newBookingDTO.endDate() );

        return booking;
    }

    @Override
    public BookedDateDTO bookingToCheckAvailability(Booking booking) {
        if ( booking == null ) {
            return null;
        }

        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;

        startDate = booking.getStartDate();
        endDate = booking.getEndDate();

        BookedDateDTO bookedDateDTO = new BookedDateDTO( startDate, endDate );

        return bookedDateDTO;
    }
}
