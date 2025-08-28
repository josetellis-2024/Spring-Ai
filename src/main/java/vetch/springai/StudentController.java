package vetch.springai;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")


public class StudentController {
	private StudentResource st;

	public StudentController(StudentResource st) {
		super();
		this.st = st;
	}
	@GetMapping("/ask")
	public ResponseEntity<String> question (@RequestParam String q){
		System.out.println(q);
		String res = st.processQuetsion(q);
		return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(res);
	}
	
	

}
