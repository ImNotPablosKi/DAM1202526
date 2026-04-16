<script setup>
import { setBlockTracking } from 'vue';

  const nombre = "Vue 3"
  const arrayFrutas = ["🍎", "🍌", "🍉", "🍓", "🍒"]
  const descargarFrutas = [

      {

        name: "Manzana",
        price: "1.00€",
        description: "Manzana Golden",
        stock: 0

      },
      {

        name: "Pera",
        price: "2.00€",
        description: "Pera Conferencia",
        stock: 10

      },
      {

        name: "Naranja",
        price: "3.00€",
        description: "Naranjas de Valencia",
        stock: 67

      },

  ]

  const fruta = {

    name: "Fresa",
    price: "4.00€",
    description: "Fresón de Palos"

  }

</script>

<template>

  <h1>{{ nombre }}</h1>
  <hr>
  <h3>Directiva v-for</h3>
  <p>{{ arrayFrutas }}</p>
  <ul>

    <li v-for="(fruta, index) in arrayFrutas" :key="index">

      {{ index }} - {{ fruta }}

    </li>

  </ul>
  <hr>

  <p>Recorremos un Array de objetos:</p>

  <ul>

    <li v-for="fruta in descargarFrutas">

      {{ fruta.name }}, {{ fruta.price }}, {{ fruta.description }}

    </li>

  </ul>
  <hr>

  <p>Recorremos un SOLO objeto:</p>

  <ul>

    <li v-for="(valor, atributo) in fruta">

      {{ atributo }} - {{ valor }}

    </li>

  </ul>
  <hr>

  <p>Lista de productos con 10 o más unidades.</p>

</template>