<!-- src/views/Home.vue -->
<template>
  <div>
    <h1>Todo App</h1>
    <input v-model="newTask" placeholder="Add new task" />
    <button @click="addTask">Add Task</button>
    <TaskList />
  </div>
</template>

<script>
import { ref } from "vue";
import { useTaskStore } from "../stores/taskStore";
import TaskList from "../components/TaskList.vue";

export default {
  components: { TaskList },
  setup() {
    const store = useTaskStore();
    const newTask = ref("");

    const addTask = () => {
      if (newTask.value.trim()) {
        store.addTask(newTask.value);
        newTask.value = "";
      }
    };

    return { newTask, addTask };
  }
};
</script>
