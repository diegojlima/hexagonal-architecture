package br.com.diegojlima.hexapizza.web;

import java.util.List;

import br.com.diegojlima.hexapizza.core.domain.Pizza;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PizzaRestUI {
	
	@PostMapping
	void createPizza(@RequestBody Pizza pizza);
	

	@GetMapping("/{name}")
	public Pizza getPizza(@PathVariable String name);

	@GetMapping
	public List<Pizza> listPizza() ;

}
