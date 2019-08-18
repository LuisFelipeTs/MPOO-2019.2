package Entrega1mpoo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	String nome;

	public String getNome() {
		return nome;
	}
	
	private String getTime() { 
		DateFormat hora = new SimpleDateFormat("HH:mm:ss"); 
		Date date = new Date(); 
		return hora.format(date); 
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void print() {
		System.out.println( this.getTime() + " - Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em java. Parabens." );
	}
}
