package io.swagger.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.Cliente;
import io.swagger.model.Direccion;
import io.swagger.model.repository.ClienteRepository;
import io.swagger.model.repository.DireccionRepository;
import io.swagger.util.EmailService;
import io.swagger.util.GeneradorContraseña;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	@Autowired
	private DireccionRepository dirRepo;
	
	@Autowired
	private EmailService emailServ;

	@Override
	public void crearCliente(Cliente cliente) {
		clienteRepo.save(cliente);
		
	}

	@Override
	public List<Cliente> listarAllClientes() {
		return clienteRepo.findAll();
	}

	@Override
	public void actualizarClientePorId(Cliente cliente) {
		clienteRepo.save(cliente);			
	}

	@Override
	public Cliente getClienteById(int idCliente) {
		Cliente cliente = clienteRepo.findOne(idCliente);
		return cliente;
	}

	@Override
	public int actualizarCategoria(int idCliente, int idCategoria) {
		return clienteRepo.actualizarCategoria(idCliente,idCategoria);
	}

	@Override
	public Cliente getClienteByUser(String usuario) {
		return clienteRepo.getClienteByUser(usuario);
	}

	@Override
	public void crearDireccion(Direccion direccion) {
		dirRepo.save(direccion);		
	}

	@Override
	public List<Direccion> getDireccionesByUser(String user) {		
		return dirRepo.getDireccionesByUser(user);
	}

	@Override
	public void actualizarDireccion(Direccion direccion) {
		dirRepo.save(direccion);
	}


	@Override
	public void recuperarCredenciales(String usuario) {

		String nuevaContraseña = GeneradorContraseña.generateRandomPassword(8);
		String correo = clienteRepo.getCorreo(usuario);				
		emailServ.enviarCorreoRecuperarContraseña(usuario, correo, nuevaContraseña);	
		clienteRepo.actualizarContraseña(usuario, nuevaContraseña);
	}

	
	
	
	
}
