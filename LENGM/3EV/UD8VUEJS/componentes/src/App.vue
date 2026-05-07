<script setup>
import BotonContador from './components/BotonContador.vue';
import BlogPost from './components/BlogPost.vue';
import { ref } from 'vue';
import Contactos from './components/Contactos.vue';

const posts = ref([

  {id: 1, title: "Post 01", content: "Contenido del post 01"},
  {id: 2, title: "Post 02", content: "Contenido del post 02"},
  {id: 3, title: "Post 03", content: "Contenido del post 03"},
  {id: 4, title: "Post 04"},
  {id: 5, title: "Post 05", content: "Contenido del post 05"},

])

const miFavorito = ref("")

const cambiarFavorito = (titulo) => {

  miFavorito.value = titulo

}

const personas = ref([

  {nombre: "Juan Pérez", email: "jperez@gmail.com", tipo: "Desarrollador"},
  {nombre: "María Maríez", email: "mmariez@gmail.com", tipo: "Diseñadora"},
  {nombre: "Usuario Usuariez", email: "uusuariez@gmail.com", tipo: "Usuario"},

])

const contacto = ref("")

const cambiarContacto = (nombre) => {

    contacto.value = nombre

}


</script>

<template>

  <div class="container">

    <h1>DAM1 - 2026</h1>
    <BotonContador></BotonContador>
    <hr>

    <h2>Contactar Con: {{ contacto }}</h2>
    <div class="container">

      <Contactos
      v-for="persona in personas"
      :nombre="persona.nombre"
      :email="persona.email"
      :tipo="persona.tipo"
      @cambiarContacto = "cambiarContacto">

      </Contactos>

    </div>

    <hr>
    <h2>Mi Post favorito: {{miFavorito}}</h2>
    <div class="container">

      <BlogPost 
      v-for="post in posts" :key="post.id"
      :title="post.title" 
      :content="post.title" 
      :id="post.id" 
      @cambiarFavorito = "cambiarFavorito"
      class="mb-2"
      ></BlogPost>

    </div>

  </div>



</template>

<style scoped></style>
