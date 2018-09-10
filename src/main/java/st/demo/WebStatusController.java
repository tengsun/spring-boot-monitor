package st.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebStatusController {

	@RequestMapping("/status")
	public String index() {
		return "Hi, I'm monitoring the status.";
	}
}
