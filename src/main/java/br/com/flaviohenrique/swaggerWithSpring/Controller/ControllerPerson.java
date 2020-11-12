package br.com.flaviohenrique.swaggerWithSpring.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flaviohenrique.swaggerWithSpring.domain.Person;
import br.com.flaviohenrique.swaggerWithSpring.service.ServicePerson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/people")
@Api(value = "API REST Pessoas")
@CrossOrigin(origins = "*")
public class ControllerPerson {
	
	@Autowired
	private ServicePerson servicePerson;
	
	@GetMapping("/{name}")
	@ApiOperation(value = "Retorna uma pessoa")
	public Person buscar(@PathVariable String name) {
		return servicePerson.retornaPerson(name);
	}
	
	@PostMapping()
	@ApiOperation(value = "Salva uma pessoa")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Avaliações Listadas com sucesso"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
		    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	public Person cadastro(@PathVariable String name) {
		return servicePerson.retornaPerson(name);
	}

}