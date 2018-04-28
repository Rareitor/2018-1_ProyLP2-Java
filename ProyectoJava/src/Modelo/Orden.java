package Modelo;

import java.util.Date;

public class Orden {

//atributos
        private String id;
        private Date fechaVenta;
        private Producto producto;
        private Canal canal;
        private Payee payee;
        private Retribucion retribucion;
        private double montoPago;
//metodos
	//constructores
        public Orden()
        {
        }
	//setters y getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    /**
     * @return the payee
     * no implementado hasta definir casteo
     */
//    public Payee getPayee() {
//        return payee;
//    }

    /**
     * @param payee the payee to set
     * no implementado hasta definir casteo
     */
//    public void setPayee(Payee payee) {
//        this.payee = payee;
//    }

    /**
     * @return the retribucion
     * no implementado hasta definir casteo y/o polimorfismo
     */
//    public Retribucion getRetribucion() {
//        return retribucion;
//    }

    /**
     * @param retribucion the retribucion to set
     * no implementado hasta definir casteo y/o polimorfismo
     */
//    public void setRetribucion(Retribucion retribucion) {
//        this.retribucion = retribucion;
//    }
    
    /**
     * @return the montoPago
     */
    public double getMontoPago() {
        return montoPago;
    }

    /**
     * @param montoPago the montoPago to set
     */
    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }
    
//metodos adicionales
    public void CalcularComision(){
        //cálculo
    }
}
