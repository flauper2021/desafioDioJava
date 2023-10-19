import resource.navegador.Navegador;
import resource.reprodutorMusical.ReprodutorMusical;
import resource.telefone.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        
        Navegador navegador = new Navegador();
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        Telefone telefone = new Telefone();

        System.out.println("\n");

        navegador.exibirPagina();
        navegador.abrirNovaPagina();
        navegador.atualizarPagina();

        System.out.println("\n");

        reprodutor.tocarMusica();
        reprodutor.pausarMusica();
        reprodutor.selecionarMusica();

        System.out.println("\n");

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();


    }
}
