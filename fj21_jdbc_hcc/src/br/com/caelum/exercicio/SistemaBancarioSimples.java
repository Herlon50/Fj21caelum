package br.com.caelum.exercicio;

public class SistemaBancarioSimples {

	public String titular;
	public int numero;
	public double saldo;
	
	public SistemaBancarioSimples(String titular, int numero, double saldo){
	  this.titular = titular;
	  this.numero = numero;
	  this.saldo = saldo;
	  
	 
	  }
	
	  public void depositarDinheiro(double saldo ) {
		  if (saldo>0)this.saldo+=saldo;
	   
		}
	public void sacarDinheiro(double valor) {  
	 if (valor >0 && saldo>=valor)this.saldo -=valor;
	}
	
	public void consultarSaldo( ) {
	System.out.println("saldo atual: R$" + this.saldo);
	}
		
}
