const nums = [1,2,3]
const dobles = nums.map((numero) => {

    console.log(`Procesando : ${numero}`)
    return numero * 2

})

console.log(dobles)

////////////////////

const dobles2 = nums.map( n => n * 2)
console.log(dobles2)

// Los valores divisibles por dos, multiplicarlos por 100
const divisibles = nums.map((n) => {

    if (n%2 == 0) { 

        return n * 100 

    } else { 

        return n

    }

})

console.log(divisibles)

// CASO REAL
const usersDesdeServidor = [

    {id: 1, nombre: "Ana", edad: 28},
    {id: 2, nombre: "Hecprooll", edad: 18},
    {id: 3, nombre: "Remon", edad: 19},

]

// Necesitamos listar SOLO los NOMBRES en la UI
const nombres = usersDesdeServidor.map( u => u.nombre ) // Es como return u.nombre  
console.log(nombres)

// Puedo crear objetos tranformados
const usuariosFormateados = usersDesdeServidor.map(u => ({

    label: u.nombre,
    valor: u.id,
    esAdulto: u.edad >= 18

}))

usuariosFormateados.forEach(u => {
    console.log(u)
})