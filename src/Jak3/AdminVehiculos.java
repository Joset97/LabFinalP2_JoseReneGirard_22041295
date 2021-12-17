/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jak3;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author jrgir
 */
public class AdminVehiculos {

    ArrayList<Vehiculos> car;
    private File archivo = null;

    public AdminVehiculos(String path) {

        archivo = new File(path);

    }

    public ArrayList<Vehiculos> getCar() {
        return car;
    }

    public void setCar(ArrayList<Vehiculos> car) {
        this.car = car;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "car=" + car;
    }

    public void setVehiculos(Vehiculos p) {
        boolean existe = false;
        for (Vehiculos partidas : car) {

            if (p.getNombre().equals(partidas.getNombre())) {
                existe = true;
            }
        }
        if (existe == false) {
            this.car.add(p);
        }
    }

    public void cargarArchivo() {
        try {
            car = new ArrayList();
            Vehiculos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Vehiculos) objeto.readObject()) != null) {
                        car.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Vehiculos t : car) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
