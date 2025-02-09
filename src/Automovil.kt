class Automovil(marca: String, modelo: String, capacidadCombustible: Int, val tipo: String):
    Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia() {
        println("Autonomia: ${capacidadCombustible * 10 + 100}km.")
    }
}