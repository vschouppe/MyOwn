<!-- src/components/TaskItem.vue -->
<template>
  <li :class="{ completed: task.completed }">
    <input type="checkbox" v-model="task.completed" @change="$emit('toggle', task.id)" />
    {{ task.text }}
    <button @click="$emit('remove', task.id)">❌</button>
  </li>
</template>

<script>
export default {
  props: ["task"]
};
</script>

<style>
.completed {
  text-decoration: line-through;
}
</style>
