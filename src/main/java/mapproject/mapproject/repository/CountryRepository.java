package mapproject.mapproject.repository;

import lombok.RequiredArgsConstructor;
import mapproject.mapproject.domain.Country;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CountryRepository {
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public List<Country> selectAll() {
        String query = "SELECT country_id, country_name, latitude, longitude \n"
            + "FROM t_country \n"
            + "ORDER BY country_name ASC";

        MapSqlParameterSource params = new MapSqlParameterSource();

        return namedParameterJdbcTemplate.query(
                query,
                params,
                (r, n) -> Country.builder()
                        .countryId(r.getString("country_id"))
                        .countryName(r.getString("country_name"))
                        .latitude(r.getDouble("latitude"))
                        .longitude(r.getDouble("longitude"))
                        .build()
        );
    }
}
