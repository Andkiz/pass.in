package passin.dto.event;


import lombok.Getter;
import passin.entities.Event;

@Getter
public class EventResponseDTO {

    EventDetailDTO eventDetailDTO;

    public EventResponseDTO(Event eventDetailDTO, Integer numberOfAttendees){
        this.eventDetailDTO = new EventDetailDTO(
                eventDetailDTO.getId(),
                eventDetailDTO.getTitle(),
                eventDetailDTO.getDetails(),
                eventDetailDTO.getSlug(),
                eventDetailDTO.getMaximumAttendees(),
                numberOfAttendees
        );
    }
}
