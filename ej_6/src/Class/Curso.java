/*
    Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para 
    organizar la información de cada curso. Para ello, crearemos una clase entidad llamada Curso, cuyos 
    atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
    precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se 
    alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
    1. Un constructor por defecto.
    2. Un constructor con todos los atributos como parámetro.
    3. Métodos getters y setters de cada atributo.
    4. Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
    Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en 
    cada repetición que se ingrese el nombre de cada alumno.
    5. Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le 
    asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() 
    para asignarle valor al atributo alumnos
    6. Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, 
    se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días 
    a la semana que se repite el encuentro.
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Curso {
    private String nombre_curso;
    private int cant_hrs_dia;
    private int cant_dias_sem;
    private char turno;
    private float precio_hora;
    private String[] alumnos;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Curso() {
    }

    public Curso(String nombre_curso, int cant_hrs_dia, int cant_dias_sem, char turno, float precio_hora) {
        this.nombre_curso = nombre_curso;
        this.cant_hrs_dia = cant_hrs_dia;
        this.cant_dias_sem = cant_dias_sem;
        this.turno = turno;
        this.precio_hora = precio_hora;
        this.alumnos = new String[5];
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public int getCant_hrs_dia() {
        return cant_hrs_dia;
    }

    public void setCant_hrs_dia(int cant_hrs_dia) {
        this.cant_hrs_dia = cant_hrs_dia;
    }

    public int getCant_dias_sem() {
        return cant_dias_sem;
    }

    public void setCant_dias_sem(int cant_dias_sem) {
        this.cant_dias_sem = cant_dias_sem;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public float getPrecio_hora() {
        return precio_hora;
    }

    public void setPrecio_hora(float precio_hora) {
        this.precio_hora = precio_hora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    private void cargar_alumnos() {
        this.alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese en nombre del alumno " + (i+1) + ": ");
            this.alumnos[i] = leer.next();
        }
    }
    
    public void cargar_curso() {
        System.out.println("Ingrese el nombre del curso:");
        this.nombre_curso = leer.next();
        System.out.println("Ingrese la cantidad de horas al dia: ");
        this.cant_hrs_dia = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias a la semana: ");
        this.cant_dias_sem = leer.nextInt();
        System.out.println("Ingrese el turno(M o T):");
        this.turno = Character.toLowerCase(leer.next().charAt(0));
        System.out.println("Ingrese el precio de la hora:");
        this.precio_hora = leer.nextInt();
        this.cargar_alumnos();
    }
    
    public double calcular_ganancia_semanal() {
        return this.cant_hrs_dia*this.precio_hora*this.cant_dias_sem*this.alumnos.length;
    }

    @Override
    public String toString() {
        String alumnos_string = "";
        for(String a : alumnos) {
            alumnos_string += a + " - ";
        }
        return "Curso{" + "nombre_curso=" + nombre_curso + ", cant_hrs_dia=" + cant_hrs_dia + ", cant_dias_sem=" + cant_dias_sem + ", turno=" + turno + ", precio_hora=" + precio_hora + ", alumnos=" + alumnos_string;
    }
    
    
}
