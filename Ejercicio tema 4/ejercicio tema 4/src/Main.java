public class Main {

    public static void main(String[] args) {
        //Primera parte:
        int numeroif = -5;
        if(numeroif>0){
            System.out.println("El número es positivo");
        }else if( numeroif<0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es 0");
        }

        //Segunda parte:
        int numeroWhile = 5;
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Tercera parte:
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile<3);

        //Cuarta parte:
        int numeroFor = 0;
        for (int i =0; i<=3; i++ ){
            numeroFor++;
            System.out.println(numeroFor);
        }

        //Quinta parte:
        int estacion = 2;
        switch (estacion){
            case 1 :
                System.out.println("Verano"); break;
            case 2:
                System.out.println("Otoño");break;
            case 3:
                System.out.println("Primavera"); break;
            case 4:
                System.out.println("Invierno"); break;
            default:
                System.out.println("El valor no corresponde a una estación");
        }
    }
}
