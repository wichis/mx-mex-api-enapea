package mx.ryo.xoloit.tlakatl.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= {"test"})
public class TestController {

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public Date guardar() {
		return new Date();
	}
	
}
