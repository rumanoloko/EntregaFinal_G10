import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StartLine {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        try {
            fos = new FileOutputStream("C:\\Users\\Vlad\\OneDrive - Universidad de Castilla-La Mancha\\Escritorio\\EntregaFinal_G10\\FrontEnd_G10\\puerto.dat");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            salida = new ObjectOutputStream(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Carguero c = new Carguero();
        try {
            salida.writeObject(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            salida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */


        try {
            FirstWindow fw = new FirstWindow();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
