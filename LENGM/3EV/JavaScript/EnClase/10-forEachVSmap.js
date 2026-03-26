// forEach - SOLO ITERA, NO devuelve NADA
const nums = [1,2,3,4,5,6,7,8,9,10]
const r1 = nums.forEach(n => n*2)
console.log(r1) // Vacío, no devuelve nada

// map - transforma y devuelve un nuevo array
const r2 = nums.map(n => n*2)
console.log(r2) // Si que musetra valores