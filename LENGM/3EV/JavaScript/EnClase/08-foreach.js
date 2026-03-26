const alumnos = ["Hector", "Javi", "Maria", "Dylan"]

// Forma moderna
alumnos.forEach((a) => {

    console.log(a)

})

// Forma moderna CON ÍNDICE
alumnos.forEach((a, indice) => {

    console.log(`${indice+1} - ${a}`)

})
