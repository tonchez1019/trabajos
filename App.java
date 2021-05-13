import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        AddressBook agent = new AddressBook();
        String aul,aul2;
        int respuesta;

        do{
            System.out.println("Bienvenido a tu agenda \n 1-Agregar \n 2-Borrar \n 3-Cargar \n 4-Mostrar Agenda \n 5-Guardar agenda \n 0-Guardar agenda");
            respuesta = sc.nextInt();
            switch (respuesta) {

                case 1:
                    System.out.println("Dame numero de telefono:");
                    aul = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Dame Nombre:");
                    aul2 = sc.nextLine();

                    agent.create(aul, aul2);
                    break;
                case 2:
                    System.out.println("Dame Nombre de quien deseas eliminar:");
                    aul2 = sc.nextLine();

                    agent.delete(aul2);
                    break;
                case 3:
                    agent.load();
                    break;
                case 4:
                    agent.list();
                    break;
                case 5:
                    agent.save();
                    break;
                case 0:
                    System.out.println("adios");
                default:
                    break;
            }
        }while(respuesta !=0 );

    }
}
