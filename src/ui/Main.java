package ui;
import java.util.*;

import model.Concessionaire;

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
            calculateFinalPrice();
			break;
		case 3:
            generateInform();
			break;
		case 4:
            documentationStatus();
			break;
        case 5:
            
            break;
        case 6:
            test();
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
        System.out.println("Cual es el año del modelo del vehiculo");
        int model = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es el cilindraje");
        int cylinderCapacity = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es el kilometraje");
        int klm = sc.nextInt();
        sc.nextLine();
        System.out.println("Con cuantas puertas cuenta el vehiculo");
        int doorsNumber = sc.nextInt();
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
        System.out.println("El vehiculo a registrar en que estado esta");
        System.out.println("(1) Nuevo");
        System.out.println("(2) Usado");
        int statusOption = sc.nextInt();
        if(statusOption>2){
            System.out.println("Opcion incorrecta");
            statusOption = sc.nextInt();
        }
        sc.nextLine();
        String plate = "";
        if(statusOption==2){
            System.out.println("Indicar la placa del vehiculo");
            plate = sc.nextLine();
        }else{
            plate = "No aplica";
        }
        System.out.println("Ahora que se tienen estos datos, vamos a registrar datos mas especificos");
        switch(statusOption){
            case 1:
            double soPrice = 0;
            int soYear = 0;
            int soImage = 0;
            double soCoverageAmount = 0;

            double owPrice = 0;
            int owYear = 0;
            int owImage = 0;

            System.out.println("Relacionado a la tecnomecanica");
            System.out.println("Cual es el valor");
            double tePrice = sc.nextDouble();
            sc.nextLine();
            System.out.println("De que año es la tecnomecanica");
            int teYear = sc.nextInt();
            sc.nextLine();
            System.out.println("Cual es la 'imagen' de la tecnomecanica");
            int teImage = sc.nextInt();
            System.out.println("Cual es el nivel de gases que emite el vehiculo");
            int teGasLevels = sc.nextInt();
            sc.nextLine();
            System.out.println(theConcessionaire.registerGasCar(basePrice,brand,model,cylinderCapacity,klm,owPrice,owYear,owImage,plate,statusOption,soPrice,soYear,soImage,soCoverageAmount,tePrice,teYear,teImage,teGasLevels,doorsNumber,polarization,cartype,fuelCapacity,fuelOption));
            break;

            case 2:
            double soPrice1;
            int soYear1;
            int soImage1;
            double soCoverageAmount1;

            double tePrice1;
            int teYear1;
            int teImage1;
            int teGasLevels1;

            double owPrice1;
            int owYear1;
            int owImage1;

            System.out.println("El vehiculo cuenta con SOAT? (Si/No)");
            String answer1 = sc.nextLine();
            if(answer1.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor del SOAT?");
                soPrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es el SOAT?");
                soYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                soImage1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Cual es la covertura del SOAT?");
                soCoverageAmount1 = sc.nextDouble();
                sc.nextLine();
            }else{
                soPrice1 = 0;
                soYear1 = 0;
                soImage1 = 0;
                soCoverageAmount1 = 0;
            }
            System.out.println("El vehiculo cuenta con Tecnomecanica? (Si/No)");
            String answer2 = sc.nextLine();
            if(answer2.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor de la Tecnomecanica?");
                tePrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es la Tecnomecanica?");
                teYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                teImage1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Cual es el nivel de gases emitidos?");
                teGasLevels1 = sc.nextInt();
                sc.nextLine();
            }else{
                tePrice1 = 0;
                teYear1 = 0;
                teImage1 = 0;
                teGasLevels1 = 0;
            }
            System.out.println("El vehiculo cuenta con Tarjeta de propiedad? (Si/No)");
            String answer3 = sc.nextLine();
            if(answer3.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor de la tarjeta de propiedad?");
                owPrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es la tarjeta de propiedad?");
                owYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                owImage1 = sc.nextInt();
                sc.nextLine();
            }else{
                owPrice1 = 0;
                owYear1 = 0;
                owImage1 = 0;
            }
            System.out.println(theConcessionaire.registerGasCar(basePrice,brand,model,cylinderCapacity,klm,owPrice1,owYear1,owImage1,plate,statusOption,soPrice1,soYear1,soImage1,soCoverageAmount1,tePrice1,teYear1,teImage1,teGasLevels1,doorsNumber,polarization,cartype,fuelCapacity,fuelOption));
            break;
        }
    }

    public void registerElectricCar(){
        System.out.println("Para registrar un auto electrico, se necesitan primero los siguientes datos basicos");
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
        System.out.println("Cual es el año del modelo del vehiculo");
        int model = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es el cilindraje");
        int cylinderCapacity = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es el kilometraje");
        int klm = sc.nextInt();
        sc.nextLine();
        System.out.println("Con cuantas puertas cuenta el vehiculo");
        int doorsNumber = sc.nextInt();
        System.out.println("Las ventanas del vehiculo se encuentran polarizadas?");
        String option = sc.nextLine();
        boolean polarization = false;
        if(option.equalsIgnoreCase("si")){
            polarization = true;
        }else if(option.equalsIgnoreCase("no")){
            polarization = false;
        }
        System.out.println("Que tipo de cargador utiliza el vehiculo");
        System.out.println("(1) Normal");
        System.out.println("(2) Rapido");
        int chargerOption = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Cual es la capacidad de carga de la bateria (por km)");
        double batteryDuration = sc.nextDouble();
        sc.nextLine();
        System.out.println("El vehiculo a registrar en que estado esta");
        System.out.println("(1) Nuevo");
        System.out.println("(2) Usado");
        int statusOption = sc.nextInt();
        if(statusOption>2){
            System.out.println("Opcion incorrecta");
            statusOption = sc.nextInt();
        }
        sc.nextLine();
        String plate = "";
        if(statusOption==2){
            System.out.println("Indicar la placa del vehiculo");
            plate = sc.nextLine();
        }else{
            plate = "No aplica";
        }
        System.out.println("Ahora que se tienen estos datos, vamos a registrar datos mas especificos");
        switch(statusOption){
            case 1:
            double soPrice = 0;
            int soYear = 0;
            int soImage = 0;
            double soCoverageAmount = 0;

            double owPrice = 0;
            int owYear = 0;
            int owImage = 0;

            System.out.println("Relacionado a la tecnomecanica");
            System.out.println("Cual es el valor");
            double tePrice = sc.nextDouble();
            sc.nextLine();
            System.out.println("De que año es la tecnomecanica");
            int teYear = sc.nextInt();
            sc.nextLine();
            System.out.println("Cual es la 'imagen' de la tecnomecanica");
            int teImage = sc.nextInt();
            System.out.println("Cual es el nivel de gases que emite el vehiculo");
            int teGasLevels = sc.nextInt();
            sc.nextLine();
            System.out.println(theConcessionaire.registerElectricCar(basePrice,brand,model,cylinderCapacity,klm,owPrice,owYear,owImage,plate,statusOption,soPrice,soYear,soImage,soCoverageAmount,tePrice,teYear,teImage,teGasLevels,doorsNumber,polarization,cartype,batteryDuration,chargerOption));
            break;

            case 2:
            double soPrice1;
            int soYear1;
            int soImage1;
            double soCoverageAmount1;

            double tePrice1;
            int teYear1;
            int teImage1;
            int teGasLevels1;

            double owPrice1;
            int owYear1;
            int owImage1;

            System.out.println("El vehiculo cuenta con SOAT? (Si/No)");
            String answer1 = sc.nextLine();
            if(answer1.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor del SOAT?");
                soPrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es el SOAT?");
                soYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                soImage1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Cual es la covertura del SOAT?");
                soCoverageAmount1 = sc.nextDouble();
                sc.nextLine();
            }else{
                soPrice1 = 0;
                soYear1 = 0;
                soImage1 = 0;
                soCoverageAmount1 = 0;
            }
            System.out.println("El vehiculo cuenta con Tecnomecanica? (Si/No)");
            String answer2 = sc.nextLine();
            if(answer2.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor de la Tecnomecanica?");
                tePrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es la Tecnomecanica?");
                teYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                teImage1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Cual es el nivel de gases emitidos?");
                teGasLevels1 = sc.nextInt();
                sc.nextLine();
            }else{
                tePrice1 = 0;
                teYear1 = 0;
                teImage1 = 0;
                teGasLevels1 = 0;
            }
            System.out.println("El vehiculo cuenta con Tarjeta de propiedad? (Si/No)");
            String answer3 = sc.nextLine();
            if(answer3.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor de la tarjeta de propiedad?");
                owPrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es la tarjeta de propiedad?");
                owYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                owImage1 = sc.nextInt();
                sc.nextLine();
            }else{
                owPrice1 = 0;
                owYear1 = 0;
                owImage1 = 0;
            }
            System.out.println(theConcessionaire.registerElectricCar(basePrice,brand,model,cylinderCapacity,klm,owPrice1,owYear1,owImage1,plate,statusOption,soPrice1,soYear1,soImage1,soCoverageAmount1,tePrice1,teYear1,teImage1,teGasLevels1,doorsNumber,polarization,cartype,batteryDuration,chargerOption));
            break;
        }
    }
    
    public void registerHybridCar(){
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
        System.out.println("Cual es el año del modelo del vehiculo");
        int model = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es el cilindraje");
        int cylinderCapacity = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es el kilometraje");
        int klm = sc.nextInt();
        sc.nextLine();
        System.out.println("Con cuantas puertas cuenta el vehiculo");
        int doorsNumber = sc.nextInt();
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
        System.out.println("Que tipo de cargador tiene el vehiculo");
        System.out.println("(1) Normal");
        System.out.println("(2) Rapido");
        int chargerOption = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Cual es la duracion de la bateria (por km)");
        double batteryDuration = sc.nextDouble();
        sc.nextLine();
        System.out.println("El vehiculo a registrar en que estado esta");
        System.out.println("(1) Nuevo");
        System.out.println("(2) Usado");
        int statusOption = sc.nextInt();
        if(statusOption>2){
            System.out.println("Opcion incorrecta");
            statusOption = sc.nextInt();
        }
        sc.nextLine();
        String plate = "";
        if(statusOption==2){
            System.out.println("Indicar la placa del vehiculo");
            plate = sc.nextLine();
        }else{
            plate = "No aplica";
        }
        System.out.println("Ahora que se tienen estos datos, vamos a registrar datos mas especificos");
        switch(statusOption){
            case 1:
            double soPrice = 0;
            int soYear = 0;
            int soImage = 0;
            double soCoverageAmount = 0;

            double owPrice = 0;
            int owYear = 0;
            int owImage = 0;

            System.out.println("Relacionado a la tecnomecanica");
            System.out.println("Cual es el valor");
            double tePrice = sc.nextDouble();
            sc.nextLine();
            System.out.println("De que año es la tecnomecanica");
            int teYear = sc.nextInt();
            sc.nextLine();
            System.out.println("Cual es la 'imagen' de la tecnomecanica");
            int teImage = sc.nextInt();
            System.out.println("Cual es el nivel de gases que emite el vehiculo");
            int teGasLevels = sc.nextInt();
            sc.nextLine();
            System.out.println(theConcessionaire.registerHybridCar(basePrice,brand,model,cylinderCapacity,klm,owPrice,owYear,owImage,plate,statusOption,soPrice,soYear,soImage,soCoverageAmount,tePrice,teYear,teImage,teGasLevels,doorsNumber,polarization,cartype,fuelCapacity,fuelOption,batteryDuration,chargerOption));
            break;

            case 2:
            double soPrice1;
            int soYear1;
            int soImage1;
            double soCoverageAmount1;

            double tePrice1;
            int teYear1;
            int teImage1;
            int teGasLevels1;

            double owPrice1;
            int owYear1;
            int owImage1;

            System.out.println("El vehiculo cuenta con SOAT? (Si/No)");
            String answer1 = sc.nextLine();
            if(answer1.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor del SOAT?");
                soPrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es el SOAT?");
                soYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                soImage1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Cual es la covertura del SOAT?");
                soCoverageAmount1 = sc.nextDouble();
                sc.nextLine();
            }else{
                soPrice1 = 0;
                soYear1 = 0;
                soImage1 = 0;
                soCoverageAmount1 = 0;
            }
            System.out.println("El vehiculo cuenta con Tecnomecanica? (Si/No)");
            String answer2 = sc.nextLine();
            if(answer2.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor de la Tecnomecanica?");
                tePrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es la Tecnomecanica?");
                teYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                teImage1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Cual es el nivel de gases emitidos?");
                teGasLevels1 = sc.nextInt();
                sc.nextLine();
            }else{
                tePrice1 = 0;
                teYear1 = 0;
                teImage1 = 0;
                teGasLevels1 = 0;
            }
            System.out.println("El vehiculo cuenta con Tarjeta de propiedad? (Si/No)");
            String answer3 = sc.nextLine();
            if(answer3.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor de la tarjeta de propiedad?");
                owPrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es la tarjeta de propiedad?");
                owYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                owImage1 = sc.nextInt();
                sc.nextLine();
            }else{
                owPrice1 = 0;
                owYear1 = 0;
                owImage1 = 0;
            }
            System.out.println(theConcessionaire.registerHybridCar(basePrice,brand,model,cylinderCapacity,klm,owPrice1,owYear1,owImage1,plate,statusOption,soPrice1,soYear1,soImage1,soCoverageAmount1,tePrice1,teYear1,teImage1,teGasLevels1,doorsNumber,polarization,cartype,fuelCapacity,fuelOption,batteryDuration,chargerOption));
            break;
        } 
    }

    public void registerMotorcycle(){
        System.out.println("Para registrar una moto, se necesitan primero los siguientes datos basicos");
        System.out.println("Que tipo de moto es");
        System.out.println("(1) Cross");
        System.out.println("(2) Deportiva");
        System.out.println("(3) Estandar");
        System.out.println("(4) Scooter");
        int motoOption = sc.nextInt();
        if(motoOption>4){
            System.out.println("Opcion incorrecta");
            motoOption = sc.nextInt();
        }
        System.out.println("Indicar el precio base de la moto");
        double basePrice = sc.nextDouble();
        sc.nextLine();
        System.out.println("Cual es la marca de la moto");
        String brand = sc.nextLine();
        System.out.println("Cual es el año del modelo del vehiculo");
        int model = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es el cilindraje");
        int cylinderCapacity = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es el kilometraje");
        int klm = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es la capacidad del tanque de gasolina (galones)");
        double fuelCapacity = sc.nextDouble();
        sc.nextLine();
        System.out.println("El vehiculo a registrar en que estado esta");
        System.out.println("(1) Nuevo");
        System.out.println("(2) Usado");
        int statusOption = sc.nextInt();
        if(statusOption>2){
            System.out.println("Opcion incorrecta");
            statusOption = sc.nextInt();
        }
        sc.nextLine();
        String plate = "";
        if(statusOption==2){
            System.out.println("Indicar la placa del vehiculo");
            plate = sc.nextLine();
        }else{
            plate = "No aplica";
        }
        System.out.println("Ahora que se tienen estos datos, vamos a registrar datos mas especificos");
        switch(statusOption){
            case 1:
            double soPrice = 0;
            int soYear = 0;
            int soImage = 0;
            double soCoverageAmount = 0;

            double owPrice = 0;
            int owYear = 0;
            int owImage = 0;

            System.out.println("Relacionado a la tecnomecanica");
            System.out.println("Cual es el valor");
            double tePrice = sc.nextDouble();
            sc.nextLine();
            System.out.println("De que año es la tecnomecanica");
            int teYear = sc.nextInt();
            sc.nextLine();
            System.out.println("Cual es la 'imagen' de la tecnomecanica");
            int teImage = sc.nextInt();
            System.out.println("Cual es el nivel de gases que emite el vehiculo");
            int teGasLevels = sc.nextInt();
            sc.nextLine();
            System.out.println(theConcessionaire.registerMotorcycle(basePrice, brand, model, cylinderCapacity, klm, owPrice, owYear, owImage, plate, statusOption, soPrice, soYear, soImage, soCoverageAmount, tePrice, teYear, teImage, teGasLevels, fuelCapacity, motoOption));
            break;

            case 2:
            double soPrice1;
            int soYear1;
            int soImage1;
            double soCoverageAmount1;

            double tePrice1;
            int teYear1;
            int teImage1;
            int teGasLevels1;

            double owPrice1;
            int owYear1;
            int owImage1;

            System.out.println("El vehiculo cuenta con SOAT? (Si/No)");
            String answer1 = sc.nextLine();
            if(answer1.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor del SOAT?");
                soPrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es el SOAT?");
                soYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                soImage1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Cual es la covertura del SOAT?");
                soCoverageAmount1 = sc.nextDouble();
                sc.nextLine();
            }else{
                soPrice1 = 0;
                soYear1 = 0;
                soImage1 = 0;
                soCoverageAmount1 = 0;
            }
            System.out.println("El vehiculo cuenta con Tecnomecanica? (Si/No)");
            String answer2 = sc.nextLine();
            if(answer2.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor de la Tecnomecanica?");
                tePrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es la Tecnomecanica?");
                teYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                teImage1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Cual es el nivel de gases emitidos?");
                teGasLevels1 = sc.nextInt();
                sc.nextLine();
            }else{
                tePrice1 = 0;
                teYear1 = 0;
                teImage1 = 0;
                teGasLevels1 = 0;
            }
            System.out.println("El vehiculo cuenta con Tarjeta de propiedad? (Si/No)");
            String answer3 = sc.nextLine();
            if(answer3.equalsIgnoreCase("si")){
                System.out.println("Cual es el valor de la tarjeta de propiedad?");
                owPrice1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("De que año es la tarjeta de propiedad?");
                owYear1 = sc.nextInt();
                sc.nextLine();
                System.out.println("IMAGE");
                owImage1 = sc.nextInt();
                sc.nextLine();
            }else{
                owPrice1 = 0;
                owYear1 = 0;
                owImage1 = 0;
            }
            System.out.println(theConcessionaire.registerMotorcycle(basePrice, brand, model, cylinderCapacity, klm, owPrice1, owYear1, owImage1, plate, statusOption, soPrice1, soYear1, soImage1, soCoverageAmount1, tePrice1, teYear1, teImage1, teGasLevels1, fuelCapacity, motoOption));
            break;
        }
    }

    public void calculateFinalPrice(){
        System.out.println("Para conocer el precio de venta se necesita la placa del vehiculo");
        String plate = sc.nextLine();
        System.out.println(theConcessionaire.calculateSellPrice(plate));
    }

    public void generateInform(){
        System.out.println("Para generar un informe seleccione uno de los siguientes criterios");
        System.out.println("(1) Tipo de vehiculo");
        System.out.println("(2) Tipo de combustible");
        System.out.println("(3) Autos nuevos/usados");
        int answer = sc.nextInt();
        System.out.println(theConcessionaire.generateInfo(answer));
    }

    public void documentationStatus(){
        System.out.println("Para generar el estado de la documentacion de un vehiculo primero debe indicar la placa");
        String plate = sc.nextLine();
        System.out.println("El estado de los documentos es el siguiente:");
        System.out.println(theConcessionaire.documentStatus(plate));
    }

    public void test(){
        System.out.println(theConcessionaire.tostrings());
    }
}