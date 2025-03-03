// src/store/taskStore.js
import { defineStore } from "pinia";

export const useTaskStore = defineStore("taskStore", {
  state: () => ({
    tasks: []
  }),
  actions: {
    addTask(task) {
      this.tasks.push({ id: Date.now(), text: task, completed: false });
    },
    removeTask(id) {
      this.tasks = this.tasks.filter(task => task.id !== id);
    },
    toggleTask(id) {
      const task = this.tasks.find(task => task.id === id);
      if (task) task.completed = !task.completed;
    }
  }
});
