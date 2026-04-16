<script setup>

  const nombre = "La clase de DAM1"
  const styleColor = "color: blue;"
  const active = false
  const colores = ["blue", "red", "green"]

</script>

<template>

  <h1>Hola a {{ nombre }}</h1>
  <hr>
  <h2 v-bind:style="styleColor">Hola a {{ nombre }}</h2>
  <h2 :style="styleColor">Hola a {{ nombre.toUpperCase }} </h2>
  <hr>
  <p>{{ active ? 'Estoy activo' : 'Estoy Inactivo'}}</p>
  <p>{{ colores }}</p>
  <h3 :style="`color: ${colores[2]}`">Color con interpolacion</h3>
  <hr>
  <!-- Directiva v-if -->
   <h3>Directiva v-if:</h3>
   <h2 v-if="active === true">Active vale true</h2>
   <h2 v-else-if="active === false">Active vale false</h2>
   <h2 v-else>No se sabe que vale active</h2>
   <hr>

   <!-- Directiva v-show -->
    <h3>Directiva v-show:</h3>
    <h2 v-show="active">Active vale true</h2>

</template>

<style>

  h1 {

    color: red;

  }

</style>