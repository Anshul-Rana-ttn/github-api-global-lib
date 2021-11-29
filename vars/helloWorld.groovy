def call(String name, String day) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
   
}
