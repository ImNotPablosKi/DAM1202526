// 1. Copia un array y agrega un elemento
const original = [1, 2, 3]
const copia = [...original, 4]

// 2. Combina dos arrays
const array1 = [1, 2, 3]
const array2 = [4, 5, 6]
const combinado = [...array1, ...array2]

// 3. Copia un objeto y modifica una propiedad
const persona = { nombre: "Ana", edad: 30 }
const personaActualizada = {...persona, edad: 67}

// 4. Combina dos objetos
const obj1 = { a: 1, b: 2 }
const obj2 = { c: 3, d: 4 }
const combinadoObj = {...obj1, ...obj2}

// 5. Copia un array y agrega múltiples elementos
const base = [10, 20]
const conAgregar = [...base, 6,7,8,9]

console.log(copia)
console.log(combinado)
console.log(personaActualizada)
console.log(combinadoObj)
console.log(conAgregar)