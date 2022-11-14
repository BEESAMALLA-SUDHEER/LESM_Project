package ls.lesm.restcontroller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ls.lesm.payload.response.RecruiterDropDownResponse;
import ls.lesm.service.impl.RecruiterServiceImpl;

@RestController
@RequestMapping("/api/v1/drop-down")
public class DropDownController {
	
	@Autowired
	private RecruiterServiceImpl recruiterServiceImpl;
	
	@GetMapping("/rec")
	public ResponseEntity<List<RecruiterDropDownResponse>> temp(Principal principal) {
		
	
		return new ResponseEntity<List<RecruiterDropDownResponse>>(this.recruiterServiceImpl.recruitersDropDown(principal), HttpStatus.OK);
	}

}
