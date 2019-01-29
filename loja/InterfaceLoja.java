/***********************************************************
* Filename: InterfaceLoja.java
* Created:  2009/11/09
***********************************************************/
package loja;

import javax.swing.JFrame;

import loja.gui.JanelaFactura;
import loja.gui.JanelaProduto;

/***********************************************************
 * @author Utilizador
 * 2009/11/09
 *
 ***********************************************************/
public interface InterfaceLoja
{
    public JanelaFactura criaJanelaFactura(BaseDados bd, JFrame contentor, boolean visivel);
    public JanelaProduto criaJanelaProduto(BaseDados bd, JFrame contentor, boolean visivel);    
}
