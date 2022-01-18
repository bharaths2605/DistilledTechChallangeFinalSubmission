package ie.dsch.be.preferences;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.core.JsonParseException;

import io.jsonwebtoken.MalformedJwtException;

/**
 * @author Bharath
 *
 */
@ControllerAdvice
public class UserPreferenceContollerAdvice {

	/**
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(JsonParseException.class)
	public ResponseEntity<String> invalidFormatException(JsonParseException ex) {

		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("Given Json Value is not in correct format");
	}
	
	@ExceptionHandler(MalformedJwtException.class)
	public ResponseEntity<String> invalidFormatException1(MalformedJwtException ex) {

		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("JWT Token is Not Valid");
	}
	
	
}
