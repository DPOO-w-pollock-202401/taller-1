package uniandes.dpoo.gasolinera.exceptions;

@SuppressWarnings("serial")
public class GasolinaInsuficienteException extends Exception
{

    private String tipoGasolina;
    private double cantidadRealEsperada;
    private double cantidadDeseada;

    public GasolinaInsuficienteException( String tipoGasolina, double cantidadRealEsperada, double cantidadDeseada )
    {
        super( );
        this.tipoGasolina = tipoGasolina;
        this.cantidadRealEsperada = cantidadRealEsperada;
        this.cantidadDeseada = cantidadDeseada;
    }

    @Override
    public String getMessage( )
    {
        String m = "No hay suficiente gasolina del tipo " + tipoGasolina + ".\n";
        m += "Se solicitaron " + cantidadDeseada + " galones, pero sólo hay disponibles " + cantidadRealEsperada + " galones";
        return m;
    }

    public double getCantidadDisponible( )
    {
        return cantidadRealEsperada;
    }
}
