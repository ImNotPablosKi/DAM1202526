// Crear una promesa
const miPromesa = new Promise((resolve, reject) => {

    // Código asíncrono
    setTimeout(() => {

        const exito = true

        if (exito) {

            resolve("Éxito! Aquí están los datos...")

        } else {

            reject("ERROR! Algo salió mal.")

        }

    }, 2000)

})

// Usar una promesa
console.log("Inicio")
miPromesa.then( resultado => {

        console.log(resultado)

    }).catch( error => {

        console.log(error)

    })