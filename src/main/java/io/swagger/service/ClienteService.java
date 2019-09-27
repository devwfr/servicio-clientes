package io.swagger.service;

import java.util.ArrayList;
import java.util.List;

import io.swagger.model.Cliente;
import io.swagger.model.Direccion;

public interface ClienteService {
	
	public void crearCliente(Cliente cliente);
	public List<Cliente> listarAllClientes();
	public void actualizarClientePorId(Cliente cliente);
	public Cliente getClienteById(int idCliente);
	public int actualizarCategoria(int idCliente, int idCategoria);
	public Cliente getClienteByUser(String usuario);
	
	public void crearDireccion(Direccion direccion);
	public List<Direccion> getDireccionesByUser(String user);
	public void actualizarDireccion(Direccion direccion);
	
	public void recuperarCredenciales(String usuario);

}
