package br.uece.ps.abstractfactory;

import java.util.Calendar;
import java.util.Date;

public class Pizzaria {
	public Pizza fabricarPizza(Date data) {
		Calendar c = Calendar.getInstance();
		c.setTime(data);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		if(dayOfWeek == 2 || dayOfWeek == 4 || dayOfWeek == 6) {
			return new PizzaCalabresa();
		} else if (dayOfWeek == 3 || dayOfWeek == 5 || dayOfWeek == 7) {
			return new PizzaPresunto();
		} else {
			System.out.println("Fechado");
			return null;
		}
	}
}
