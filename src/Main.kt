fun main() {
    val vehiculo1 = Vehiculo("Avion", "A310", 5000)
    val automovil1 = Automovil("Audi", "A8", 100, "Sedan")
    val motocicleta1 = Motocicleta("Honda", "Forza", 50, 125)

    vehiculo1.calcularAutonomia()
    automovil1.calcularAutonomia()
    motocicleta1.calcularAutonomia()

    vehiculo1.mostrarInformacion()
    automovil1.mostrarInformacion()
    motocicleta1.mostrarInformacion()
}