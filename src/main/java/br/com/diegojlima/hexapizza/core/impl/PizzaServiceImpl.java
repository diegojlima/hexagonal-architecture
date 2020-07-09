package br.com.diegojlima.hexapizza.core.impl;

import java.util.List;

import br.com.diegojlima.hexapizza.core.domain.Pizza;
import br.com.diegojlima.hexapizza.port.PizzaRepo;
import br.com.diegojlima.hexapizza.port.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaServiceImpl implements PizzaService {

	@Autowired
	private PizzaRepo pizzaRepo;

	@Override
	public void createPizza(Pizza pizza) {
		pizzaRepo.createPizza(pizza);
	}

	@Override
	public Pizza getPizza(String name) {

		return pizzaRepo.getPizza(name);
	}

	@Override
	public List<Pizza> listPizza() {
		return pizzaRepo.getAllPizza();
	}

}
