public class Main {
    public static void main(String[] args){
        Cliente jaimito = new Cliente();
        jaimito.setEdad(19);
        jaimito.setNombre("Jaime Corzo");
        jaimito.setTelefono(475848343);
        jaimito.setCredito(456);

        System.out.println("Nombre :" + jaimito.getNombre());
        System.out.println("Edad :" + jaimito.getEdad());
        System.out.println("Telefono :" + jaimito.getTelefono());
        System.out.println("Credito :" + jaimito.getCredito());

        Trabajador javier = new Trabajador();

        javier.setNombre("Javier Carvalo");
        javier.setEdad(54);
        javier.setTelefono(543543);
        javier.setSalario(930);

        System.out.println("Trabajador :" + javier.getNombre());
        System.out.println("Edad : " + javier.getEdad());
        System.out.println("Telefono: " + javier.getTelefono());
        System.out.println("Salario : " + javier.getSalario());
    }
}

class Persona {
    private int edad, telefono;
    private String nombre;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}