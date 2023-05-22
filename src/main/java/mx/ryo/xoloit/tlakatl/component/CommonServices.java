package mx.ryo.xoloit.tlakatl.component;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import mx.ryo.xoloit.tlakatl.exception.devel.InvalidValueException;
import mx.ryo.xoloitek.common.utils.api.InternalHeaderType;

@Component
public class CommonServices {
	@Autowired
	private ResourceBundle labels;
	@Autowired
	private ResourceBundle errors;

	public String getLabel(String keyLabel) {
		return this.labels.getString(keyLabel);
	}

	public String getError(String keyLabel) {
		return this.errors.getString(keyLabel);
	}

	public String getValHeader(InternalHeaderType xheader) throws InvalidValueException {
		final HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		final String valReq = request.getHeader(xheader.getKey());
		if (StringUtils.isBlank(valReq))
			throw new InvalidValueException(String
					.format(this.getError("error.code.header_obligatorio.pkey1"), xheader.getKey()));
		return valReq;
	}

}
