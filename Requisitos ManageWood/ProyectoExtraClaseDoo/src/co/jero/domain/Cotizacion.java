package co.jero.domain;

import java.util.List;

public class Cotizacion {
    private int codigo;
    private String nombre;
    private byte metrosMubleBajo;
    private byte metrosMubleAlto;
    private byte metrosMeson;
    private int valorCotizacion;
    private TipoCotizacion tipoCotizacion;
    private Sede sede;
    private Cliente cliente;
    private List<MateriaPrima> MateriasPrimas;

    public void CalcularValorCotizacion(){

    }
    public  void SolictarMateriaPrima(MateriaPrima materiaPrima){

    }

}
