public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Carlos");
        persona1.setEdad(32);
        persona1.setTelefono("97679823");

        System.out.println("=====DATOS PERSONALES=====");
        System.out.println("NOMBRE: "+persona1.getNombre());
        System.out.println("EDAD: "+persona1.getEdad());
        System.out.println("TELEFONO: "+persona1.getTelefono());
    }

}
