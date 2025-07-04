package dockerassignment;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public Map<String, String> welcome()
	{
		return Map.of("message","To Docker World");
	}

	@GetMapping("/goodday")
	public Map<String, String> goodday()
	{
		return Map.of("message","Have A Good Day");
	}

	@GetMapping("/error")
	public Map<String, String> errors()
	{
		return Map.of("message","ERROR");
	}
	@GetMapping("/goodday")
	public Map<String, String> goodday()
	{
		return Map.of("message","Have A Good Day");
	}
}
