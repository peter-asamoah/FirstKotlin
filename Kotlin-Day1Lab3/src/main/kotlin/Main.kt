fun main() {
    SimpleAgent()
    val env = FoodEnvironment(SimpleAgent("Charlie"))
    env.step()
    println(env.scores)
}