package br.com.diegojlima.hexapizza.port;

import java.util.List;

import br.com.diegojlima.hexapizza.core.domain.Pizza;

public interface PizzaService {
	
	public void createPizza(Pizza pizza);
	
	public Pizza getPizza(String name);
	
	public List<Pizza> listPizza();

}
