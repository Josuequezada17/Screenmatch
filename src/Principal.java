import com.JQIndustries.screenmatch.modelos.Pelicula;

public class Principal {

    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula();

        pelicula.evaluaPelicula(9);
        pelicula.evaluaPelicula(9);

        pelicula.setNombre("Hola");
        pelicula.setDuracionEnMinutos(345);
        pelicula.setFechaDeLanzamiento(2022);
        pelicula.setIncluidoEnElPlan(false);

        pelicula.muestraFichaTecnica();
        System.out.println(pelicula.getSumaDeEvaluaciones());
        System.out.println(pelicula.getTotalEvaluaciones());
        System.out.println(pelicula.calcularMedia());
    }
}
