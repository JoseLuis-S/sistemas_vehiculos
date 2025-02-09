class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, val cilindrada: Int):
    Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia() {
        println("Autonomia: ${capacidadCombustible * 10 - 40}km.")
    }
}