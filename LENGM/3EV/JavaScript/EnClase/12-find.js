// find devuelve SOLO el primer elemento que coincida con una condición, filter devuelve TODOS
const users = [

    {id: 1, nombre: "Ana"},
    {id: 2, nombre: "Iker"},
    {id: 3, nombre: "David"},

]

const resultado1 = users.filter(u => u.id === 2)
resultado1.forEach(u => console.log(u))

const resultado2 = users.find(u => u.id === 2)
console.log(resultado2)