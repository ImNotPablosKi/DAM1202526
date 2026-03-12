// Nos permite extraer los valores de objetos o de arrays fácilmente
const persona = {

    nombre: "Dylan",
    edad: 20,

}
/*
const nombre = persona.nombre

const edad = persona.edad
*/

const {nombre, edad} = persona

console.log(nombre)
