
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

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
    static RandomAccessFile carros;
    
    public SistemaCorredores() throws FileNotFoundException, IOException{
       File file = new File("Autos");
       file.mkdirs();
    }
}
