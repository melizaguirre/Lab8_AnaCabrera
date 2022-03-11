
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Corredores {
     protected String cnombreCorredor;
    protected String idCorredor;
    protected File file = null;

    public Corredores(String cnombreCorredor, String idCorredor) {
        this.cnombreCorredor = cnombreCorredor;
        this.idCorredor = idCorredor;
    }

    public String getCnombreCorredor() {
        return cnombreCorredor;
    }

    public void setCnombreCorredor(String cnombreCorredor) {
        this.cnombreCorredor = cnombreCorredor;
    }

    public String getIdCorredor() {
        return idCorredor;
    }

    public void setIdCorredor(String idCorredor) {
        this.idCorredor = idCorredor;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
}
