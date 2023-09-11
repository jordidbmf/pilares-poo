import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorUsuario {
    public static void main(String[] args) {
        // System.out.println("MSN");
        // MSNMessenger msn = new MSNMessenger();
        // msn.enviarMensagem();
        // msn.receberMensagem();

        // System.out.println("FACEBOOK");
        // FacebookMessenger fcb = new FacebookMessenger();
        // fcb.enviarMensagem();
        // fcb.receberMensagem();

        // System.out.println("TELEGRAM");
        // Telegram tlg = new Telegram();
        // tlg.enviarMensagem();
        // tlg.receberMensagem();

        ServicoMensagemInstantanea smi = null;
        /*
         * Não se saber qual app
         * mas qualquer um devera enviar e receber mensagem
         */
        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();


    }
}
