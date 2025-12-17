package trip.TripPlannerz.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Header {
    private String resultCode;
    private String resultMessage;
}
