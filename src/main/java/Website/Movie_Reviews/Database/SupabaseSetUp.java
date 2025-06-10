package Website.Movie_Reviews.Database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import java.util.Collections;

@Service
public class SupabaseSetUp {

    private final RestTemplate restTemplate;

    @Value("${supabase.api.url}")
    private String supabaseUrl;

    @Value("${supabase.api.key}")
    private String supabaseKey;


    public SupabaseSetUp(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getAllUsers() {
        String url = supabaseUrl + "/rest/v1/Movies";

        // Set headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("apikey", supabaseKey);
        headers.set("Authorization", "Bearer " + supabaseKey);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>(headers);

        // Make GET request
        try {
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
            System.out.println("Response: " + response.getBody());
            return response.getBody();
        } catch (Exception e) {
            return "Error fetching data from Supabase: " + e.getMessage();
        }

    }
}
