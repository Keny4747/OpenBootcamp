public class Main {



    public static void main(String[] args) {
        //Objeto cliente que hereda de persona, con sus valores asignados
        Cliente cliente1 = new Cliente();

        cliente1.setNombre("Juan Perez");
        cliente1.setEdad(32);
        cliente1.setTelefono("99887989");
        cliente1.setCredito(2434.23);

        System.out.println("====DATOS CLIENTE:======");
        System.out.println("NOMBRE: "+cliente1.getNombre());
        System.out.println("EDAD: "+cliente1.getEdad());
        System.out.println("TELEFONO: "+cliente1.getTelefono());
        System.out.println("CRÉDITO: "+cliente1.getCredito());

        //Objeto trabajador que hereda de Persona ,con sus valores asignados
        Trabajador trabajador1 = new Trabajador();

        trabajador1.setNombre("Federico Gomez");
        trabajador1.setEdad(23);
        trabajador1.setTelefono("9874324");
        trabajador1.setSalario(2343.23);

        System.out.println("====DATOS TRABAJADOR:======");
        System.out.println("NOMBRE: "+trabajador1.getNombre());
        System.out.println("EDAD: "+trabajador1.getEdad());
        System.out.println("TELEFONO: "+trabajador1.getTelefono());
        System.out.println("SUELDO: "+trabajador1.getSalario());
    }
}
