/*fetch('https://jsonplaceholder.typicode.com/users').then(

    result => result.json()

).then(

    data => {

        data.forEach(element => {
            
            console.log(element.name)

        });

    }

)*/

const obtenerUsuarios = async () => {

    try {

        const res = await fetch('https://jsonplaceholder.typicode.com/users')
        const data = await res.json()
        data.forEach( user => {

            console.log(user.name)

        })

    } catch (error) {

        console.log("Se ha producido un error")

    }

}

obtenerUsuarios()