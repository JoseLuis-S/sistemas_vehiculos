open class Vehiculo(val marca: String, val modelo: String, val capacidadCombustible: Int) {
    fun mostrarInformacion() {
        println("Marca: $marca, Modelo: $modelo, Capacidad: $capacidadCombustible")
    }

    open fun calcularAutonomia() {
        println("Autonomia: ${capacidadCombustible * 10}km.")
    }
}