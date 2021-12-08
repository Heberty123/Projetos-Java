package matricula;

import java.util.Date;

public class Matricula {

	private Date data;
	private Integer number;
	private String curso;
	private double valor;
	
	
	public Matricula(Date data, Integer number, String curso, double valor) {
		super();
		this.data = data;
		this.number = number;
		this.curso = curso;
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (String.format("Matricula: %d foi realizado no " + this.getData() + ", curso: %s e valor: %.2f\n",
				this.getNumber(), this.getCurso(), this.getValor()));
	}
	
	
}
