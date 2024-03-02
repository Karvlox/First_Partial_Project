import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UploadTXT {

    public String readFile() {
        File f;
        javax.swing.JFileChooser j = new javax.swing.JFileChooser();
        j.showOpenDialog(j);
        String path = j.getSelectedFile().getAbsolutePath();//guarda la ruta completa del archivo que elegimos
        String lectura = "";
        f = new File(path);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String aux;
            while ((aux = br.readLine()) != null){
                lectura = lectura + aux + "\n";
            }
        }catch (IOException e){}
        return lectura.toLowerCase(); // Convertimos a minúsculas para ser insensibles a mayúsculas.
    }



}
