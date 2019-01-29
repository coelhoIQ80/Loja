/***********************************************************
* Filename: InterfaceTextual.java
* Created:  2009/11/09
***********************************************************/
package loja.gui;

import javax.swing.JFrame;

import loja.BaseDados;
import loja.InterfaceLoja;
import loja.Produto;

/***********************************************************
 * @author Utilizador
 * 2009/11/09
 *
 ***********************************************************/
public class InterfaceTextual implements InterfaceLoja
{

    @Override
    public JanelaFactura criaJanelaFactura(BaseDados bd, JFrame contentor, boolean visivel)
    {
	return new CFactura(bd, contentor, visivel);
    }

    @Override
    public JanelaProduto criaJanelaProduto(BaseDados bd, JFrame contentor, boolean visivel)
    {
	return new CProduto(bd, contentor, visivel);
    }
}
