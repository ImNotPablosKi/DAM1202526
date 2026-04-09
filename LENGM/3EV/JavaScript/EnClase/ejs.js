const nombre = "María"
const edad = 25
const ciudad = "Madrid"

// 1. "Hola María"
const saludo = `Hola ${nombre}`

// 2. "María tiene 25 años"
const presentacion = `${nombre} tiene ${edad} años`

// 3. "María es de Madrid y tiene 25 años"
const presentacionCompleta = `${nombre} es de ${ciudad} y tiene ${edad} años`

// 4. Con operación dentro: "María tendrá 26 años el próximo año"
const proximoAnio = `${nombre} tendrá ${edad+1} años el próximo año`

// 5. Con condicional: "María es adulta" o "María es menor"
const estadoEdad = edad >= 18 ? `${nombre} es adulta` : `${nombre} es menor`

console.log(saludo)
console.log(presentacion)
console.log(presentacionCompleta)
console.log(proximoAnio)
console.log(estadoEdad)