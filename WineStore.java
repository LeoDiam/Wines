package gr.wine.store.manager;

import java.util.ArrayList;

import gr.wine.store.model.Drink;
 
public class WineStore
{
	private String name;
	private String address;
	private ArrayList<Drink> drinks;
 
	public WineStore(String name, String address, ArrayList<Drink> drinks)
	{
		this.name = name;
		this.address = address;
		this.drinks = drinks;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public ArrayList<Drink> getDrinks()
	{
		return drinks;
	}
}
	