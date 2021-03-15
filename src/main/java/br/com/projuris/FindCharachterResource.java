package br.com.projuris;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindCharachterResource {
	private MyFindChar find;
	
	public FindCharachterResource() {
		find = new MyFindChar();
	}
	
	@RequestMapping(value="/busca_letra_unica", method = RequestMethod.POST)
	public ResponseEntity<String> buscaSubArray(@RequestBody FindCharBody body) {
		return new ResponseEntity<String>(Character.toString(find.findChar(body.getWord())), HttpStatus.OK);
	}
}
