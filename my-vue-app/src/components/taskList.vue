<!-- src/components/TaskList.vue -->
<template>
  <div>
    <h2>Task List</h2>
    <ul>
      <TaskItem v-for="task in tasks" :key="task.id" :task="task" @toggle="toggleTask" @remove="removeTask" />
    </ul>
  </div>
</template>

<script>
import { defineComponent } from "vue";
import { useTaskStore } from "../stores/taskStore";
import TaskItem from "./TaskItem.vue";

export default defineComponent({
  components: { TaskItem },
  setup() {
    const store = useTaskStore();
    return { tasks: store.tasks, toggleTask: store.toggleTask, removeTask: store.removeTask };
  }
});
</script>
