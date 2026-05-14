<script setup>
import BotonContador from './components/BotonContador.vue';
import BlogPost from './components/BlogPost.vue';
import { computed, ref } from 'vue';
import Contactos from './components/Contactos.vue';
import PaginatePost from './components/PaginatePost.vue';
import LoadingSpinner from './components/LoadingSpinner.vue';

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

const loading = ref(true)

// Vamos a usar fetch para cargar datos de una api pública
fetch('https://jsonplaceholder.typicode.com/posts')
.then(response => response.json())
//.then(data => console.log(data))
.then(data => posts.value = data)
.finally(

  setTimeout(() => {

      loading.value = false

  }, 3000)


)

// Paginación
const postsXPagina = 10;
const inicio = ref(0);
const fin = ref(postsXPagina)
const tamanoPost = computed( () => posts.value.length)

// Métodos para la paginación
const next = () => {

  inicio.value = inicio.value + postsXPagina
  fin.value = fin.value + postsXPagina

}

const previous = () => {

  inicio.value = inicio.value - postsXPagina
  fin.value = fin.value - postsXPagina

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
    <LoadingSpinner v-if="loading"></LoadingSpinner>
    <div class="container" v-else>
      
      <!-- Grupo de Botones -->
      <PaginatePost class="mb-2"
      @next="next"
      @previous="previous"
      :inicio="inicio"
      :fin="fin"
      :tamanoPost="tamanoPost"
      ></PaginatePost>

      <BlogPost 
      v-for="post in posts.slice(inicio, fin)" :key="post.id"
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
