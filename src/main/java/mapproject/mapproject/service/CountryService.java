package mapproject.mapproject.service;

import lombok.RequiredArgsConstructor;
import mapproject.mapproject.domain.Country;
import mapproject.mapproject.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;
    public List<Country> getCountries() {
        return countryRepository.selectAll();
    }
}
