package matricula;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map.Entry;

import Excepetion.DomainException;

public class Matricula {

	private int id;
	private Date data;
	private String curso;
	private double valor;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private static int incremento = 1;
	
	
	public Matricula(Date data, String curso, double valor) throws DomainException {
		if(exist(data, curso, valor)) {
			throw new DomainException(String.format("Inválido: Id %d de matricula já existe na lista !", incremento));
		}else {
			this.id = incremento;
			this.data = data;
			this.curso = curso;
			this.valor = valor;
			incremento++;
		}
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
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
	
	
	private boolean exist(Date data2, String curso2, double valor2) {
		for (Matricula matricula : new ConjuntosMatricula().getTreeset()) {
			if(matricula.equals(data2, curso2, valor2)) {
				return true;
			}
		}
		return false;
	}
	

	public boolean ehIgual(Object o) {
		Matricula m = (Matricula) o;
		if(this.data.getTime() == m.getData().getTime() && this.curso == m.getCurso() && this.valor == m.getValor()) {
			return true;
		}
		return false;
	}
	

	public boolean equals(Date data, String curso, double valor) {
		if(this.data.getTime() == data.getTime() && this.curso == curso && this.valor == valor) {
			return true;
		}
		return false;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (String.format("id %d - Matricula realizado no " + sdf.format(this.data) + ", curso: %s e valor: %.2f\n", this.getId(), this.getCurso(), this.getValor()));
	}
	
	
	
}
