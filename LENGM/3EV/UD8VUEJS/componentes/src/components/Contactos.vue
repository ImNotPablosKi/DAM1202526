<script setup>
import { ref } from 'vue';


const props = defineProps({

        nombre: String,
        email: String,
        tipo: {
            
            type: String,
            default: 'Sin Contacto'

        }

    })

</script>

<template>

    <div class="card  bg-warning bg-opacity-25">

        <div class="card-body bg-opacity-25">

            <p>{{ props.nombre }}</p>
            <p><b>Email: </b> {{ props.email }}</p>
            <p>
                <span class="badge rounded-pill text-bg-primary bg-opacity-100">{{tipo}}</span>
            </p>
            <button @click="$emit('cambiarContacto', nombre)" class="btn btn-outline-success">Contactar</button>

        </div>

    </div>

</template>