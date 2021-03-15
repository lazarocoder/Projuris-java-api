package br.com.projuris;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindArrayResource {
	private MyFindArray find;

	public FindArrayResource() {
		find = new MyFindArray();
	}

	@RequestMapping(value="/busca_sub_array", method = RequestMethod.POST)
	public ResponseEntity<Integer> buscaSubArray(@RequestBody FindArrayBody body) {
		return new ResponseEntity<Integer>(find.findArray(body.getMainArray(), body.getSubArray()), HttpStatus.OK);
	}
}
