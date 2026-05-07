<script setup>

    // defineProps(["title", "content", "id", "colorText"])
    const props = defineProps({

        title: String,
        id: Number,
        content: {

            type: String, 
            default: 'Sin Descripción'

        }

    })

</script>
<template>

    <div class="card">
        <div class="card-body">
            <h4 class="card-title"  :class="`text-${colorText}`">
                {{ props.title }}
            </h4>
            <p>
                {{ props.id }} - {{ props.content }}
            </p>
            <button @click="$emit('cambiarFavorito', title)" class="btn btn-outline-primary">Mi Favorito</button>
        </div>
    </div>

</template>