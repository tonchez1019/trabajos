import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AddressBook {

    HashMap<String, String> agenda = new HashMap<String, String>();
    String NumTel;
    String Nombre;
    final static String outputFilepath = "D:/tareas/computacion en java/programas/actividad11/actividad/BaseDatos.txt";
    File file = new File(outputFilepath);

    public void create(String NumTel, String Nombre) {

        agenda.put(NumTel, Nombre);
    }

    public void delete(String Nombre) {

        agenda.remove(Nombre);

    }

    public void list() {

        System.out.println("lista de la agendea: ");

        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void save() {

        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : agenda.entrySet()) {

                bf.write(entry.getKey() + " : " + entry.getValue());
                bf.newLine();
            }
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
            } catch (Exception e) {
            }
        }
    }

    public void load() {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(":");

                String Tel = parts[0].trim();
                String Nombre = parts[1].trim();

                if (!Tel.equals("") && !Nombre.equals(""))
                    agenda.put(Tel, Nombre);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
                ;
            }
        }
    }
}
