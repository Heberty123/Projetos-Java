package entities;

public class cadastro {

	private String name;
	private int idade;
	private int cpf;
	private String curso;
	private String TipoVest;
	
	
	public cadastro(String name, int idade, int cpf) {
		this.name = name;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTipoVest() {
		return TipoVest;
	}
	public void setTipoVest(String tipoVest) {
		TipoVest = tipoVest;
	}
	
	public String TiposCurso() {
		
		return "1- informática\n 2- hardware\n 3- administração\n 4- arduino\n 5- mecatronica\n 6-gestor\n 7- oratório\n 8- fullstack\n 9- WebDesign\n 10- Inglês";
	}
}
