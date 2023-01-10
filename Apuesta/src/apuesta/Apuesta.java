package apuesta;

/**
 * La clase Apuesta contiene los diferentes metodos y constructores para
 * efectuar y comprobar una apuesta en el ambito de futbol.
 * @author Unknown
 * @version Unknown
 */
public class Apuesta {
    /**
     * Dinero disponible
     */
    private int dineroDisponible;

    /**
     * Goles que ha marcado el equipo local
     */
    private int golesLocal;

    /**
     * Goles que ha marcado el equipo visitante
     */
    private int golesVisitante;

    /**
     * Dinero apostado
     */
    private int apostado;

    /**
     * Constructor sin parametros de la clase apuesta,
     * todos los atributos se inician a 0
     */
    public Apuesta() {
        // Constructor por Defecto
    }

    /**
     * Construye el objeto en base a los parametros dineroDisponible,
     * golesLocal y golesVisitante
     * @param dineroDisponible Dinero disponible
     * @param golesLocal Goles del equipo local
     * @param golesVisitante Goles del equipo visitante
     */
    public Apuesta(int dineroDisponible, int golesLocal, int golesVisitante) {
        this.dineroDisponible = dineroDisponible;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.apostado = 0;
    }
    
    /**
     * Método para obtener el dinero disponible
     * @return Devuelve el dinero disponible
     */
    public int getdineroDisponible() {
        return dineroDisponible;
    }
    
    /**
     * Método para dar un valor al dinero disponible
     * @param dineroDisponible Da un valor al dinero disponible
     */
    public void setdineroDisponible(int dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    /**
     * Método que te permite elegir la cantidad a apostar,
     * la cual esta no puede ser inferior a 1 ni superior al saldo ya disponible
     * @param dinero El Dinero que tienes en tu cuenta
     * @throws Exception Lanza una excepción en caso
     * de que tu dinero sea menor a 1 o superior al saldo disponible
     */
    public void apostar(int dinero) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No se puede apostar menos de 1�");
        } if (dinero > dineroDisponible) {
            throw new Exception("No se puede apostar m�s de lo que tienes");
        } {
            dineroDisponible = dinero - dineroDisponible;
            apostado = dinero;
        }
    }
    
    /**
     * Función que comprobará si ha acertado o no el resultado
     * @param local Goles del equipo local
     * @param visitante Goles del equipo visitante
     * @return True si ha acertado false si no acerto
     * @throws Exception Lanza una excepción en caso de que
     * algún equipo tenga menos de 0 goles
     */
    public boolean comprobarResultado(int local, int visitante) throws Exception {
        boolean acertado = false;
        if (local < 0 || visitante < 0) {
            throw new Exception("Un equipo no puede meter menos de 0 goles, por malo que sea");
        } if (golesLocal == local && golesVisitante == visitante) {
            acertado = true;
        } return acertado;
    }
    
    /**
     * Método para cobrar la apuesta
     * @param golesLocal Goles del equipo local
     * @param golesVisitante Goles del equipo visitante
     * @throws Exception Lanza excepción si no se acerto el resultado
     */
    void cobrarApuesta(int golesLocal, int golesVisitante) throws Exception {
        if (!comprobarResultado(golesLocal, golesVisitante)) {
            throw new Exception("No se puede cobrar una apuesta no acertada");
        } dineroDisponible = dineroDisponible * 10;
    }

    /**
     * Método para obtener los goles del local
     * @return Devuelve los locales
     */
    public int getgolesLocal() {
        return golesLocal;
    }

    /**
     * Método para dar un valor a golesLocal
     * @param golesLocal Contiene los goles del local
     */
    public void setgolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    /**
     * Método para obtener los goles del visitante
     * @return Devuelve los goles del visitante
     */
    public int getgolesVisitante() {
        return golesVisitante;
    }

    /**
     * Método para dar un valor a golesVisitante
     * @param golesVisitante Contiene los goles del visitante
     */
    public void setgolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    /**
     * Método para obtener el dinero apostado
     * @return Devuelve el dinero apostado
     */
    public int getApostado() {
        return apostado;
    }

    /**
     * Método para dar un valor al dinero apostado
     * @param apostado Contiene el dinero apostado
     */
    public void setApostado(int apostado) {
        this.apostado = apostado;
    }

}
