package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Juego;

/**
 * @ClassName JuegoService
 *
 * @author María Castro
 *
 * @date 24 jun. 2021
 * 
 * @version 1.0
 */
public interface JuegoService {
	
	//Para modificar y añadir juego
	public void save(Juego juego);
	
	//Para recuperar un juego y poder modificarlo
	public Juego getById(int id);
	
	//Para eliminar juego por id
	public void deleteById(int id);
	
	//Para listar todos los juegos
	public List<Juego> findAll();
	
	//Merodo propio para listar juegos de genero = plataforma
	public List<Juego> findByGeneroPlataforma();

}
