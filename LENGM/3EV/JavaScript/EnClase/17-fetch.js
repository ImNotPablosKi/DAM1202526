fetch('https://pokeapi.co/api/v2/pokemon/').then(

    res => res.json()

).then(

    data => {

        data.results.array.forEach(element => {
            
            console.log(element.name)

        });

    }

)