package vnomina;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author cahoperro
 */
public class EscuchaVentana implements WindowListener {

    Principal Obj;

    public EscuchaVentana(Principal Obj) {
        this.Obj = Obj;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if (Obj.principal != null && !Obj.principal.guardado) {
            int g = JOptionPane.showConfirmDialog(null, 
                    "¿Quieres guardar antes de salir?");

            switch (g) {
                case 0:
                    if (Obj.principal != null) {
                        if (Obj.fichero == null) {
                            Obj.guardarComo();
                            Obj.cerrar();
                        } else {
                            Obj.guardar();
                            Obj.cerrar();
                        }
                    }
                    break;
                case 2:
                    break;
                case 1:
                    Obj.cerrar();
                    break;
            }
        } else {
            Obj.cerrar();
        }
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // ventana cerrada
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
