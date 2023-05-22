package mx.ryo.xoloit.tlakatl.exception.advice;

//import org.hibernate.exception.DataException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

import mx.ryo.xoloit.tlakatl.exception.BusinessLogicException;
import mx.ryo.xoloit.tlakatl.exception.DevelLogicException;
import mx.ryo.xoloit.tlakatl.exception.devel.DataNotFoundException;
import mx.ryo.xoloitek.common.utils.api.InternalHeaderType;
import mx.ryo.xoloitek.common.utils.bundle.MsgBundleType;
import mx.ryo.xoloitek.common.utils.bundle.MsgBundleUtils;

@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(value = { ResponseStatusException.class })
	public ResponseEntity<String> handleResponseStatusExceptionn(Exception devLogExc) {
		logger.error("DevelLogicException handler executed" + devLogExc.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(MsgBundleUtils.useResponse(MsgBundleType.OP_FALLIDA));
	}

	@ExceptionHandler(value = { DataNotFoundException.class })
	public ResponseEntity<String> handleIOException(DevelLogicException devLogExc) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).header(InternalHeaderType.X_CRO.getKey(), devLogExc.getMessage())
				.body(devLogExc.getMessage());
	}

	@ExceptionHandler(value = { BusinessLogicException.class })
	public ResponseEntity<String> handleIOException(BusinessLogicException devLogExc) {
		logger.error("Solicita apoyo con tu administrador para atender el fallo" + devLogExc.getMessage());
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(devLogExc.getMessage());
	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<String> handleIOException(Exception exc) {
		logger.error(">>> " + exc.getMessage());
		logger.error(">>>>>> " + exc.getCause());
		return ResponseEntity.status(HttpStatus.NO_CONTENT).header(InternalHeaderType.X_CRO.getKey(), exc.getMessage())
				.body(exc.getMessage());
	}

//	@ExceptionHandler(value = { DataException.class })
//	public ResponseEntity<String> handleIOException(DataException exc) {
//		return ResponseEntity.status(HttpStatus.NO_CONTENT).header(InternalHeaderType.X_CRO.getKey(), exc.getMessage())
//				.body(exc.getMessage());
//	}

}
