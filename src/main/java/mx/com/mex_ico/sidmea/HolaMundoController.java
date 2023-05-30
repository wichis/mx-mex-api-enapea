package mx.com.mex_ico.sidmea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sidmea")
public class HolaMundoController {
	@GetMapping("/hola")
	public String saluda() {
		return "Hola, mundo";
	}
}
