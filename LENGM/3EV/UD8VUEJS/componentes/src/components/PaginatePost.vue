<script setup>

    const emit = defineEmits(["next", "previous"])
    defineProps(["inicio", "fin", "tamanoPost"])

</script>

<template>

<div class="btn-group" role="group" aria-label="Basic example">
  <button type="button" class="btn btn-outline-primary" @click="emit('previous')"
  :disabled="inicio == 0"
  >Previo {{ inicio }}</button>

  <button type="button" class="btn btn-outline-primary" @click="emit('next')"
  :disabled="fin >= tamanoPost"
  >Siguiente {{ fin }}</button>
</div>

</template>