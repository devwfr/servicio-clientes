package io.swagger.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

	 @Autowired
	    public JavaMailSender emailSender;

	@Override
	public void enviarCorreoRecuperarContraseña(String usuario, String correo,String contraseña) { 
	        
	        SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setTo(correo); 
	        message.setSubject("Recuperación de contraseña");
	        message.setText("La nueva contraseña de su usuario: "+usuario+" es: "+contraseña);
	        emailSender.send(message);
		
	}
	 
	 
	 
}
