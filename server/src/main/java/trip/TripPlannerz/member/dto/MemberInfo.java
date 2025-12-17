package trip.TripPlannerz.member.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberInfo {
    private String email;
    private String name;

    @QueryProjection
    public MemberInfo(String email, String name) {
        this.email = email;
        this.name = name;
    }
}
