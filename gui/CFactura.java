/***********************************************************
 * Filename: CFactura.java
 * Created:  2009/11/09
 ***********************************************************/
package loja.gui;

import java.util.Scanner;

import javax.swing.JFrame;

import utilities.Data;

import loja.BaseDados;
import loja.Factura;

/***********************************************************
 * @author Utilizador 2009/11/09
 * 
 ***********************************************************/
public class CFactura extends JanelaFactura
{

    /***********************************************************
     * @param bd
     * @param contentor
     * @param visivel
     ***********************************************************/
    public CFactura(BaseDados bd, JFrame contentor, boolean visivel)
    {
	super(bd, contentor, visivel);
	menuFacturas();
    }

    private void menuFacturas()
    {
	Scanner linha = new Scanner(System.in);
	char escolha = ' ';
	do
	{
	    System.out.println("******** Menu de Facturas ***********");
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
        	    case 'N': nova(); break;
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
	    System.out.print("Nº factura [" + getBDados().facturas().get(0).getNumero()
		    + "-" + getBDados().facturas().get(getBDados().facturas().size() - 1).getNumero()
		    + "]>");
	    numero = Integer.parseInt(linha.nextLine());
	} while (getBDados().procuraFactura(numero) == null);
	linha.close();
	setCorrente(getBDados().procuraFactura(numero));
	lista();
    }

    private void nova()
    {
	// TODO Auto-generated method stub

    }

    private void lista()
    {
	for (Factura f : getBDados().facturas())
	    System.out.println((f == factura_corrente ? "* " : "  ")
		    + f.cabecalho());
    }

}
