package com.poo.app;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		Gerente gerente = new Gerente();
		gerente.setNome("João");
		
		Atendente atendente = new Atendente();
		atendente.setNome("Maria");

		Cliente cliente = new Cliente();
		cliente.setNome("José");

		Endereco endereco = new Endereco();
		endereco.setEstado(UnidadeFederal.RJ);

		System.out.println(endereco.getEstado());

		// Acessando nomePorExtenso

		System.out.println(UnidadeFederal.RJ.getNomePorExtenso());

		System.out.println(LocalDate.now());

		// Qual o dia da semana do LocalDate.now?
		System.out.println(LocalDate.now().getDayOfWeek());

		// SimpleDateFormat
		LocalDate data = LocalDate.now();

		// Convertendo para o java.util.Date
		Date dataUtil = Date.from(data.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(dataUtil));
	
	}

}

