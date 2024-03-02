package LOGICA;

public class CLIENTE_AUTO {

    private long Celular, Identificacion, numero_de_venta;
    private String Email, Nombres_Apellidos, Fecha_de_nacimiento, direccion_cliente, modelo_de_carro, color_de_carro, placa_de_carro;
    private double precio_de_compra_carro, precio_de_venta_carro, ganancia;

    public CLIENTE_AUTO(long Celular, long Identificacion, long numero_de_venta, String Email, String Nombres_Apellidos, String Fecha_de_nacimiento, String direccion_cliente, String modelo_de_carro, String color_de_carro, String placa_de_carro, double precio_de_compra_carro, double precio_de_venta_carro, double ganancia) {
        this.Celular = Celular;
        this.Identificacion = Identificacion;
        this.numero_de_venta = numero_de_venta;
        this.Email = Email;
        this.Nombres_Apellidos = Nombres_Apellidos;
        this.Fecha_de_nacimiento = Fecha_de_nacimiento;
        this.direccion_cliente = direccion_cliente;
        this.modelo_de_carro = modelo_de_carro;
        this.color_de_carro = color_de_carro;
        this.placa_de_carro = placa_de_carro;
        this.precio_de_compra_carro = precio_de_compra_carro;
        this.precio_de_venta_carro = precio_de_venta_carro;
        this.ganancia = ganancia;
    }

    public long getCelular() {
        return Celular;
    }

    public void setCelular(long Celular) {
        this.Celular = Celular;
    }

    public long getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(long Identificacion) {
        this.Identificacion = Identificacion;
    }

    public long getNumero_de_venta() {
        return numero_de_venta;
    }

    public void setNumero_de_venta(long numero_de_venta) {
        this.numero_de_venta = numero_de_venta;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombres_Apellidos() {
        return Nombres_Apellidos;
    }

    public void setNombres_Apellidos(String Nombres_Apellidos) {
        this.Nombres_Apellidos = Nombres_Apellidos;
    }

    public String getFecha_de_nacimiento() {
        return Fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String Fecha_de_nacimiento) {
        this.Fecha_de_nacimiento = Fecha_de_nacimiento;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getModelo_de_carro() {
        return modelo_de_carro;
    }

    public void setModelo_de_carro(String modelo_de_carro) {
        this.modelo_de_carro = modelo_de_carro;
    }

    public String getColor_de_carro() {
        return color_de_carro;
    }

    public void setColor_de_carro(String color_de_carro) {
        this.color_de_carro = color_de_carro;
    }

    public String getPlaca_de_carro() {
        return placa_de_carro;
    }

    public void setPlaca_de_carro(String placa_de_carro) {
        this.placa_de_carro = placa_de_carro;
    }

    public double getPrecio_de_compra_carro() {
        return precio_de_compra_carro;
    }

    public void setPrecio_de_compra_carro(double precio_de_compra_carro) {
        this.precio_de_compra_carro = precio_de_compra_carro;
    }

    public double getPrecio_de_venta_carro() {
        return precio_de_venta_carro;
    }

    public void setPrecio_de_venta_carro(double precio_de_venta_carro) {
        this.precio_de_venta_carro = precio_de_venta_carro;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public Object[] mostrar() {
        Object v[] = new Object[13];
        v[0] = Celular;
        v[1] = Identificacion;
        v[2] = numero_de_venta;
        v[3] = Email;
        v[4] = Nombres_Apellidos;
        v[5] = Fecha_de_nacimiento;
        v[6] = direccion_cliente;
        v[7] = modelo_de_carro;
        v[8] = color_de_carro;
        v[9] = placa_de_carro;
        v[10] = precio_de_compra_carro;
        v[11] = precio_de_venta_carro;
        v[12] = ganancia;
        return v;
    }

    public Object[] mostrar_2() {
        Object v[] = new Object[13];
        v[0] = Celular;
        v[1] = Identificacion;
        v[2] = numero_de_venta;
        v[3] = Email;
        v[4] = Nombres_Apellidos;
        v[5] = Fecha_de_nacimiento;
        v[6] = direccion_cliente;
        v[7] = modelo_de_carro;
        v[8] = color_de_carro;
        v[9] = placa_de_carro;
        v[10] = precio_de_compra_carro;
        v[11] = precio_de_venta_carro;
        return v;
    }
}
