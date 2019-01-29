/***********************************************************
 * Filename: CFactura.java
 * Created:  2009/11/09
 ***********************************************************/
package loja.gui;

import java.util.Scanner;
import javax.swing.JFrame;

import loja.BaseDados;
import loja.Produto;

/***********************************************************
 * @author Utilizador 2009/11/09
 * 
 ***********************************************************/
public class CProduto extends JanelaProduto
{
    private static final long serialVersionUID = 1L;

    /***********************************************************
     * @param bd
     * @param contentor
     * @param visivel
     ***********************************************************/
    public CProduto(BaseDados bd, JFrame contentor, boolean visivel)
    {
	super(bd, contentor, visivel);
	menuProdutos();
    }

    private void menuProdutos()
    {
	Scanner linha = new Scanner(System.in);
	char escolha = ' ';
	do
	{
	    System.out.println("******** Menu de Produtos ***********");
	    System.out.println("L - Listar");
	    System.out.println("E - Escolher");
	    System.out.println("N - Nova");
	    System.out.println("M - Modificar");
	    System.out.println("A - Apagar");
	    System.out.println("S - Sair");

	    escolha = linha.nextLine().toUpperCase().charAt(0);
	    switch (escolha)
	    {
        	    case 'L': lista(); break;
        	    case 'N': novo(); break;
        	    case 'E': escolhe(); break;
        	    case 'M': modifica(); break;
        	    case 'A': apaga(); break;
        	    case 'S': break;
        	    default: System.out.println("Comando Inválido!");
	    }
	} while (escolha != 'S');
	linha.close();
    }

    private void apaga()
    {
	// TODO Auto-generated method stub

    }

    private void modifica()
    {
	// TODO Auto-generated method stub

    }

    private void escolhe()
    {
	Scanner linha = new Scanner(System.in);
	Integer numero;
	do
	{
	    System.out.print("Nº produto [" + getBDados().produtos().get(0).getCodigo()
		    + "-" + getBDados().produtos().get(getBDados().produtos().size() - 1).getCodigo()
		    + "]>");
	    numero = Integer.parseInt(linha.nextLine());
	} while (getBDados().procuraProduto(numero) == null);
	linha.close();
	this.setCorrente(getBDados().procuraProduto(numero));
	lista();
    }

    private void novo()
    {
	// TODO Auto-generated method stub

    }

    private void lista()
    {
	for (Produto p : getBDados().produtos())
	    System.out.println((p == this.produto_corrente ? "* " : "  ")
		    + p.cabecalho());
    }

    @Override
    protected void escreve(Produto f)
    {
	// TODO Auto-generated method stub
	
    }

}