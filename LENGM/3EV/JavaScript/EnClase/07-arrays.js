// Crear un array
const frutas = ["manzana", "pera", "melocoton"]

frutas[frutas.length-1] = "piña"

console.log(frutas)
console.log(frutas.length)

console.log(frutas[frutas.length-1])

const carrito = ["raton", "monitor"]
console.log(carrito)

// Eliminar ultimo elemento
// carrito.pop()

// Unshift añade al principio
carrito.unshift("Webcam")
console.log(carrito)

// shift quita el primer elemento
const lista2 = carrito.shift()
console.log(`lista2 es: ${carrito}`)