package loja.gui;

import java.util.List;

import javax.swing.JFrame;

import loja.BaseDados;
import loja.Factura;
import loja.Produto;

public abstract class JanelaProduto extends JFrame
{
    private final BaseDados bDados;
    
    protected JFrame chamadora;
    protected Produto produto_corrente;

    /***********************************************************
    * @param bd
    * @param contentor
    * @param visivel
    ***********************************************************/
    public JanelaProduto(BaseDados bd, JFrame contentor, boolean visivel)
    {
	this.bDados = bd;
	this.chamadora = contentor;
	this.setVisible(visivel);
    }

    protected void setCorrente(Produto p)
    {
        produto_corrente = p;
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
     abstract protected void escreve(Produto f);
          
}

