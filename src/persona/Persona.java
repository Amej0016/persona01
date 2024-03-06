/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

/**
 *
 * @author Angel
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def obtener_informacion_personal(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}"


class Doc.(Persona):
    def __init__(self, nombre, edad, especialidad):
        super().__init__(nombre, edad)
        self.especialidad = especialidad

    def obtener_informacion_personal(self):
        return f"{super().obtener_informacion_personal()}, Especialidad: {self.especialidad}"


class Depor.(Persona):
    def __init__(self, nombre, edad, deporte):
        super().__init__(nombre, edad)
        self.deporte = deporte

    def obtener_informacion_personal(self):
        return f"{super().obtener_informacion_personal()}, Deporte: {self.deporte}"


# Crear instancias de las clases y mostrar su información personal
persona1 = Per.("Geraldine", 2)
print(pers.1.obtener_informacion_pers.l())

doctor1 = Doc.("Sayli", 25, "Medico General")
print(doctor1.obtener_informacion_personal())

deportista1 = Dep.("Angel", 25, "Fútbol")
print(deportista1.obtener_informacion_personal())
