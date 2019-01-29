package loja.gui;

import java.util.List;

import javax.swing.JFrame;

import loja.BaseDados;
import loja.Factura;
import loja.Produto;

public abstract class JanelaFactura extends JFrame
{
    private final BaseDados bDados;
    
    protected JFrame chamadora;
    protected Factura factura_corrente;

    /***********************************************************
    * @param bd
    * @param contentor
    * @param visivel
    ***********************************************************/
    public JanelaFactura(BaseDados bd, JFrame contentor, boolean visivel)
    {
	this.bDados = bd;
	this.chamadora = contentor;
	this.setVisible(visivel);
	this.factura_corrente = new Factura();
    }

    protected void setCorrente(Factura f)
    {
        factura_corrente = f;
    }

    /***********************************************************
     * @return the bDados
     ***********************************************************/
    protected BaseDados getBDados()
    {
        return bDados;
    }
    
    /***********************************************************
     * @param estado
     ***********************************************************/
     public void visivel(boolean estado)
     {
	this.setVisible(estado);
     }
         
     /***********************************************************
      * @param f
      ***********************************************************/
     protected void escreve(Factura f)
     {
 	System.out.println(f);
     }
}
