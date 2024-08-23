const { addDynamicIconSelectors } = require('@iconify/tailwind');
/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/main/resources/templates/**/*.{html,css}", "./src/main/kotlin/**/*.kt"],
  theme: {
    extend: {},
  },
  plugins: [
    addDynamicIconSelectors(),
  ],
}
