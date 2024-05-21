package mapproject.mapproject.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Country {
    private String countryId;
    private String countryName;
    private double latitude;
    private double longitude;
}
