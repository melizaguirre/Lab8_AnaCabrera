
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class SistemaCorredores {
    private ArrayList<Corredores> autos = new ArrayList();
    static RandomAccessFile carros;
    File file =  null; 
    
    public SistemaCorredores() throws FileNotFoundException, IOException{
       File file = new File("Autos");
       file.mkdirs();
       SistemaCorredores.carros = new RandomAccessFile("Autos/carros.amci", "rw");
    }
    public SistemaCorredores(String path) {
        file = new File(path);
    }

    public ArrayList<Corredores> getAutos() {
        return autos;
    }

        
    public void agregarCorredor (String TipCarro, String nomCorredor, int Color)throws IOException {     
     carros.seek(carros.length());   
     carros.writeLong(0);
     carros.writeUTF(nomCorredor);
     carros.writeInt(Color);
     carros.writeUTF(TipCarro);
    }
    
    public void Leer() throws ClassNotFoundException {
        FileInputStream fileI = null;
        ObjectInputStream object = null;

        try {
            if (file.exists()) {
                autos = new ArrayList();
                Corredores aute;
                fileI = new FileInputStream(file);
                object = new ObjectInputStream(fileI);
                try {
                    while ((aute = (Corredores) object.readObject()) != null && idUnico(aute.getIdentificacion())) {
                        autos.add(aute);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
        try {
            object.close();
            fileI.close();
        } catch (Exception e) {

        }
    }

    public void escribir() {
        FileOutputStream fileI = null;
        ObjectOutputStream object = null;
        try {
            fileI = new FileOutputStream(file);
            object = new ObjectOutputStream(fileI);
            for (Corredores auto : autos) {
                object.writeObject(auto);
            }
            object.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            object.close();
            fileI.close();
        } catch (Exception e) {
        }
    }

    private boolean idUnico(int idUnico) {
        for (Corredores auto : autos) {
            if (auto.getIdentificacion() == idUnico) {
                return true;
            }
        }
        return false;
    }
}
