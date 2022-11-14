package vnomina;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class UtilNavegador {

    public static void abrirURL(String url) {

        try {
            URI uri = new URI(url);
            Desktop desktop = null;
            if (Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
            }

            if (desktop != null) {
                desktop.browse(uri);
            }
        } catch (IOException | URISyntaxException ioe) {
            JOptionPane.showMessageDialog(null,
                    "Error al abrir la ayuda, "+ioe.getMessage(),
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
