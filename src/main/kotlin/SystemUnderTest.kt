class SystemUnderTest(val depedency1: Depedency1, val depedency2: Depedency2) {
    fun calculate(): Int {
        return depedency1.value1 + depedency2.value2.toInt()
    }
}
