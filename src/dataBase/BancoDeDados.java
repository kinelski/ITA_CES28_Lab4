package dataBase;

import notaFiscal.ProdutoServico;

public class BancoDeDados {
	
	private static DB_PS instanceOfDB_PS = DB_PS.getInstanceOf();
	private static DB_NF instanceOfDB_NF = DB_NF.getInstanceOf();
	private static DB_Tax instanceOfDB_Tax = DB_Tax.getInstanceOf();
	private static BancoDeDados instanceOfBancoDeDados = new BancoDeDados();
	
	private BancoDeDados(){};
	
	public static BancoDeDados getInstanceOf(){
		return instanceOfBancoDeDados;
	}
	
	public ProdutoServico getProdutoServico (String nome){
		return null;
	}
	
}