package controller;

import java.util.List;
import model.City;

public interface CityDao {
	public List<City> getAllCities();
	void addCity(City city);
	public City getCity(String name);
	public void updateCity(City city);
	public void deleteCity(City city);
}
