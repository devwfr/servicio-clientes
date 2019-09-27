package io.swagger.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{
	
	@Transactional
    @Modifying
	@Query(value="UPDATE cliente SET idcategoria= ?2 WHERE idcliente = ?1", nativeQuery = true)
	int actualizarCategoria( int idCliente,int idCategoria);
	
	@Query(value="SELECT * FROM CLIENTE WHERE usuario = ?1", nativeQuery = true)
	Cliente getClienteByUser(String usuario);
	
	@Query(value="SELECT EMAIL FROM CLIENTE WHERE usuario = ?1", nativeQuery = true)
	String getCorreo(String usuario);
	
	@Transactional
    @Modifying
	@Query(value="UPDATE cliente SET password = ?2 WHERE usuario = ?1", nativeQuery = true)
	int actualizarContraseña(String usuario,String contraseña);
	
}
