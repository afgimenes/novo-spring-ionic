package com.projeto.andromeda.services;

import org.springframework.mail.SimpleMailMessage;

import com.projeto.andromeda.domain.Cliente;
import com.projeto.andromeda.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
