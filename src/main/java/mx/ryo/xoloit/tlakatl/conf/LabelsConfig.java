package mx.ryo.xoloit.tlakatl.conf;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LabelsConfig {

	@Bean(name = "labels")
	public ResourceBundle getLabel() {
		Locale locale = new Locale("es", "MX");
		ResourceBundle labels = ResourceBundle.getBundle("statics.labels", locale);
		return labels;
	}

	@Bean(name = "errors")
	public ResourceBundle getError() {
		Locale locale = new Locale("es", "MX");
		ResourceBundle errorCode = ResourceBundle.getBundle("statics.error", locale);
		return errorCode;
	}

	@Bean(name = "paths")
	public ResourceBundle getPath() {
		ResourceBundle errorCode = ResourceBundle.getBundle("conf.paths");
		return errorCode;
	}

	@Bean(name = "params")
	public ResourceBundle getParam() {
		ResourceBundle errorCode = ResourceBundle.getBundle("conf.control-params");
		return errorCode;
	}
}
