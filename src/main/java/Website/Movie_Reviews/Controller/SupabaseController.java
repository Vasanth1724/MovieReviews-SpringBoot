package Website.Movie_Reviews.Controller;

import Website.Movie_Reviews.Database.SupabaseSetUp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/supabase")
public class SupabaseController {

    private final SupabaseSetUp supabaseService;

    public SupabaseController(SupabaseSetUp supabaseService) {
        this.supabaseService = supabaseService;
    }

    @GetMapping("/movies")
    public String getAllUsers() {
        return supabaseService.getAllUsers();
    }

}
