/***********************************************************
 * @author FBA
 * 2009/03/10
 *
 ***********************************************************/
public class Main
{   

    /***********************************************************
     * @param args
     ***********************************************************/
    public static void main(String[] args)
    {		
	//		testaNumeracao();
	//		testaReflexividade();
	//		testaCopiarAlterar();
	//		testaOrdenar();
	//		testaTimer();

	BaseDados dados = new BaseDados("data/produtos.txt",
					"data/facturas.txt",
					"data/linhas_factura.txt");
	dados.carrega();
	
	try
	{
	    //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    // Guarantees the native look and feel (e.g. Windows, Linux, Mac)
	    
	    InterfaceJanelas iface = new InterfaceJanelas(dados);
	    
	} catch (Exception e)
	{
	    System.err.println("Falling back to the plain Java look and feel...");
	}
	
    }
