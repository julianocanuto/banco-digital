package com.julianocanuto.bancodigital;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.julianocanuto.bancodigital.entities.Cliente;
import com.julianocanuto.bancodigital.entities.Conta;
import com.julianocanuto.bancodigital.entities.ContaCorrente;
import com.julianocanuto.bancodigital.entities.ContaPoupanca;

@SpringBootApplication
public class BancodigitalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BancodigitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente c1 = new Cliente();
		c1.setNome("Juliano Canuto");

		Conta cc = new ContaCorrente(c1);
		Conta poupanca = new ContaPoupanca(c1);

		cc.depositar(1000000);
		cc.transferir(7230, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
