<script setup>
import { computed, ref } from 'vue'


  // Métodos
  const manejarClick = ( mensaje ) => {

    console.log( mensaje )

  }

  const menejarClick2 = () => {

    console.log("Hola")

  }

  const contador = ref(0)

  const incrementar = () => {

    contador.value++

  }

   const restar = () => {

    contador.value--

  }

   const reset = () => {

    contador.value = 0

  }

  // Propiedades Computaoas
  const claseContador = computed( () => {
    if (contador.value === 0) {

      return 'zero'

    }

    return contador.value > 0 ? 'verde' : 'rojo'

  } )

  const arrayFavoritos = ref([])

  const almacenar = () => {

    arrayFavoritos.value.push(contador.value)

  }

</script>

<template>

  <div class="container">

    <div class="text-center">

        <h1>Contador</h1>
        <h1 :class="claseContador">{{ contador }}</h1>

        <!--<template v-if="contador > 0">

        <h1 style="color: green;">{{ contador }}</h1>

        </template>
        <template v-if="contador < 0">

        <h1 style="color: red;">{{ contador }}</h1>

        </template>
        <template v-if="contador == 0">

        <h1>{{ contador }}</h1>

        </template>
      -->

      <div class="btn-group">

        <button @click="incrementar" class="btn btn-success">Aumentar</button>
        <button @click="restar" class="btn btn-danger">Restar</button>
        <button @click="reset" class="btn btn-primary">Reiniciar</button>
        <button @click="almacenar" class="btn btn-info">Favorito</button>

      </div>

      <p>Favoritos:</p>

      <ul>

        <li v-for="num in arrayFavoritos">{{ num }}</li>

      </ul>

    </div>

    

  </div>

</template>

<style>

  .rojo {
    color: red;
  }

  .verde {
    color: green;
  }

  .zero {
    color: yellow;
  }
</style>