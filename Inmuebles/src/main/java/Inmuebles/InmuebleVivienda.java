package Inmuebles;
public class InmuebleVivienda extends Inmueble{
protected int numeroHabitaciones;
protected int numeroBaños;  
public InmuebleVivienda(int identificadorInmobiliario, int área, String
dirección, int numeroHabitaciones, int numeroBaños) {
    super(identificadorInmobiliario, área, dirección); 
    this.numeroHabitaciones = numeroHabitaciones;
    this.numeroBaños = numeroBaños;
}
void imprimir() {
super.imprimir();
System.out.println("Número de habitaciones = " + numeroHabitaciones);
System.out.println("Número de baños = " + numeroBaños);
}
}
