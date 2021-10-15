class SimpleAgent : Actor{
    override var name: String = ""



    override fun act(): Action {
        TODO("Not yet implemented")
        return ForageAction()
    }

    override fun perceive(vararg facts: Percept) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        name = "Peter"
        return "SimpleAgent(name='$name')"
    }
}