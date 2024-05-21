package mapproject.mapproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import mapproject.mapproject.domain.Country;
import mapproject.mapproject.service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CountryRestController {
    private final CountryService countryService;

    @CrossOrigin
    @GetMapping("/countries/list")
    public ResponseEntity<?> getCountries(){
        List<Country> countries = countryService.getCountries();
        return ResponseEntity.ok().body(countries);
    }
}
