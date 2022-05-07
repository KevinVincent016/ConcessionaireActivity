package ui;
import java.io.Console;
import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

import model.Concessionaire;
import model.OwnershipCard;
import model.SOAT;
import model.Tecnomechanics;

public class Main {
	
	private Concessionaire theConcessionaire;
	private Scanner sc;
	
	public Main(){
        theConcessionaire = new Concessionaire("ICESI");
		sc= new Scanner(System.in);

    }

	public static void main(String[] args) {
		Main m = new Main();

		int option = 0;
		do{
			option= m.showMenu();
			m.executeOperation(option);
			
		}while (option!=0);

	}

	public int showMenu() {
		int option=0;

		System.out.println(
				"Seleccione una opción para empezar\n" +
				"(1) Registrar vehiculos a la venta\n" +
                "(2) Calcular precio total de venta\n" + 
                "(3) Informe de los vehiculos\n" +
                "(4) Buscar estado de los documentos\n" +
                "(5) Mapa del parqueadero\n" +
                "(6) Informe de ocupacion\n" +
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}

	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
		    registerVehicle();
			break;
		case 2:
            
			break;
		case 3:
            
			break;
		case 4:
			
			break;
        case 5:

            break;
        case 6:

            break;
		default:
			System.out.println("Error, opción no válida");
		}
	}

    public void registerVehicle(){
        System.out.println("Empezando el registro del vehiculo");
        System.out.println("Primero indicar que tipo de vehiculo es");
        System.out.println("(1) Carro");
        System.out.println("(2) Moto");
        int typeOption = sc.nextInt();
        if(typeOption>2){
            System.out.println("Opcion incorrecta");
            typeOption = sc.nextInt();
        }
        sc.nextLine();
        switch(typeOption){
            case 1:
            System.out.println("Que tipo de carro es");
            System.out.println("(1) Gasolina");
            System.out.println("(2) Electrico");
            System.out.println("(3) Hibrido");
            int carTypeOption = sc.nextInt();
            if(carTypeOption>3){
                System.out.println("Opcion incorrecta");
                carTypeOption = sc.nextInt();
            }
            sc.nextLine();
            switch(carTypeOption){
                case 1:
                registerGasolineCar();
                break;

                case 2:
                registerElectricCar();
                break;

                case 3:
                registerHybridCar();
                break;

                default:
                System.out.println("Opcion no valida");
                carTypeOption = sc.nextInt();
            }
            sc.nextLine();
            break;

            case 2:
            registerMotorcycle();
            break;
        }
    }

    public void registerGasolineCar(){
        System.out.println("Para registrar un auto de gasolina, se necesitan primero los siguientes datos basicos");
        System.out.println("Que tipo de carro es");
        System.out.println("(1) Sedan");
        System.out.println("(2) Camioneta");
        int cartype = sc.nextInt();
        if(cartype>2){
            System.out.println("Opcion incorrecta");
            cartype = sc.nextInt();
        }
        System.out.println("Indicar el precio base del carro");
        double basePrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Cual es la marca del vehiculo");
        String brand = sc.nextLine();
        System.out.println("Cual es el modelo del vehiculo");
        String model = sc.nextLine();
        System.out.println("Cual es el cilindraje");
        int cylinderCapacity = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es el kilometraje");
        int klm = sc.nextInt();
        sc.nextLine();
        System.out.println("Con cuantas puertas cuenta el vehiculo");
        String doorsNumber = sc.nextLine();
        System.out.println("Las ventanas del vehiculo se encuentran polarizadas?");
        String option = sc.nextLine();
        boolean polarization = false;
        if(option.equalsIgnoreCase("si")){
            polarization = true;
        }else if(option.equalsIgnoreCase("no")){
            polarization = false;
        }
        System.out.println("Que tipo de gasolina consume el vehiculo");
        System.out.println("(1) Extra");
        System.out.println("(2) Corriente");
        System.out.println("(3) Diesel");
        int fuelOption = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Cual es la capacidad del tanque de gasolina (galones)");
        double fuelCapacity = sc.nextDouble();
        sc.nextLine();
        System.out.println("Cual es el consumo (galones por km) del vehiculo");
        double fuelConsume = sc.nextDouble();
        sc.nextLine();
        System.out.println("Indicar la placa del vehiculo");
        String plate = sc.nextLine();
        System.out.println("El vehiculo a registrar en que estado esta");
        System.out.println("(1) Nuevo");
        System.out.println("(2) Usado");
        int statusOption = sc.nextInt();
        if(statusOption>2){
            System.out.println("Opcion incorrecta");
            statusOption = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Ahora que se tienen estos datos, vamos a registrar datos mas especificos");
        switch(statusOption){
            case 1:
            SOAT theSoat = null;
            OwnershipCard theOwnershipCard = null;
            System.out.println("Relacionado a la tecnomecanica");
            System.out.println("Cual es el valor");
            double tecPrice = sc.nextDouble();
            sc.nextLine();
            System.out.println("De que año es la tecnomecanica");
            String tecYear = sc.nextLine();
            System.out.println("Cual es la 'imagen' de la tecnomecanica");
            int tecImage = sc.nextInt();
            System.out.println("Cual es el nivel de gases que emite el vehiculo");
            int gasLevels = sc.nextInt();
            Tecnomechanics theTecnomechanics = new Tecnomechanics(tecPrice, tecYear, tecImage, gasLevels);
            System.out.println(theConcessionaire.registerGasCar(basePrice,brand,model,cylinderCapacity,klm,theOwnershipCard,plate,statusOption,theSoat,theTecnomechanics,doorsNumber,polarization,cartype,fuelCapacity,fuelConsume,fuelOption));
            break;

            case 2:
            System.out.println("El vehiculo cuenta con SOAT?");
            String answer1 = sc.nextLine();
            if(answer1.equalsIgnoreCase("si")){

            }else{
                SOAT theSoat2 = null;
            }
        }
    }

    public void registerElectricCar(){

    }
    
    public void registerHybridCar(){

    }

    public void registerMotorcycle(){

    }
}