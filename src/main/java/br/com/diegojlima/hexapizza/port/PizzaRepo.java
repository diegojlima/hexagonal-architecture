package br.com.diegojlima.hexapizza.port;

import java.util.List;

import br.com.diegojlima.hexapizza.core.domain.Pizza;

public interface PizzaRepo {
	
	void createPizza(Pizza pizza);
	
	Pizza getPizza(String name);
	
	List<Pizza> getAllPizza();

}
