package poo_model;

public class Endereco {

	public enum TipoEndereco {
		RESIDENCIAL,
		ENTREGA,
		TRABALHO
	}
	
	public Integer codigo;
	public String nome;
	public String cpf;
	
	public String endereco;
	public String numero;
	public String complemento;
	public String cidade;
	public String bairro;
	
}