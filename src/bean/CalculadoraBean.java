package bean;

import javax.faces.bean.ManagedBean;

import bo.CalculoBO;

@ManagedBean
public class CalculadoraBean {

	//Primeira responsabilidade: Receber os parâmetros de entrada
	private Double numero1;
	private Double numero2;
	
	public Double getNumero1() {
		return numero1;
	}
	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}
	public Double getNumero2() {
		return numero2;
	}
	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}
	
	//Terceira responsabilidade: Criar os placeholders (propriedades utilizadas para a resposta)
	private Double resultado;
	private String operacao;
	
	public Double getResultado() {
		return resultado;
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	//Segunda responsabilidade: Fazer a orquestração da requisição (tratar a requisição com os métodos action controller)
	public String somar(){
		try{
			
			resultado = CalculoBO.somar(numero1, numero2);
			operacao = "+";
			return "resultado";
		
		}catch(Exception e){
		
			return "erro";
			
		}
	}
	
	public String subtrair(){
		try{
			
			resultado = CalculoBO.subtrair(numero1, numero2);
			operacao = "-";
			return "resultado";
		
		}catch(Exception e){
		
			return "erro";
			
		}
	}
	
	public String multiplicar(){
		try{
			
			resultado = CalculoBO.multiplicar(numero1, numero2);
			operacao = "*";
			return "resultado";
		
		}catch(Exception e){
		
			return "erro";
			
		}
	}
	
	public String dividir(){
		try{
			
			resultado = CalculoBO.dividir(numero1, numero2);
			operacao = "/";
			return "resultado";
		
		}catch(Exception e){
		
			return "erro";
			
		}
	}
	
	public String fatorial(){
		try{
			
			resultado = CalculoBO.fatorial(numero1.intValue()).doubleValue();
			operacao = "!";
			return "resultado";
		
		}catch(Exception e){
		
			return "erro";
			
		}
	}
	
}
