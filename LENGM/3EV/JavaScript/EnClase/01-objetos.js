const persona = {

    nombre: "Ana",
    edad: 23,
    email: "ana@name.es",

}

// PUEDES TENER VARIOS TIPOS DE ELEMENTOS EN EL MISMO ARRAY JSJSJAJAJAJ
const diasSemana = ["Lunes", "Martes", "Miércoles", persona]
diasSemana.push(67)
diasSemana.pop()

persona.nombre = "Javier Sanz"

diasSemana[0] = "Domingo"

console.log(persona)
console.log(diasSemana)

console.log(diasSemana.at(3).nombre)

