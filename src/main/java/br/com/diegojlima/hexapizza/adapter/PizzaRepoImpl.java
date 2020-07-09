package br.com.diegojlima.hexapizza.adapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.diegojlima.hexapizza.core.domain.Pizza;
import br.com.diegojlima.hexapizza.port.PizzaRepo;

@Repository
public class PizzaRepoImpl implements PizzaRepo {

	private Map<String, Pizza> pizzaStore = new HashMap<String, Pizza>();

	@Override
	public void createPizza(Pizza pizza) {
		pizzaStore.put(pizza.getName(), pizza);
	}

	@Override
	public Pizza getPizza(String name) {
		return pizzaStore.get(name);
	}

	@Override
	public List<Pizza> getAllPizza() {
		return pizzaStore.values().stream().collect(Collectors.toList());
	}

}
