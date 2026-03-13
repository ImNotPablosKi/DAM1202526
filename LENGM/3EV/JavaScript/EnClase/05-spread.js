// Me sirve para operar con arrays y objetos, me permite expandirlos
// El operador spread es: ...

const numeros = [1,2,3,4]

const listaNumeros = [...numeros, 5,6,7,8]

console.log(listaNumeros)

// También funciona con objetos

const persona = {

    nombre: "Hecprooll",
    edad: 18,

}

const personaCompleta = {

    ...persona,
    ciudad: "Teruel",
    codigoPostal: 44002,
    email: "hecprooll@hypixel.org"

}

console.log(personaCompleta)