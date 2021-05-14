class Depedency1(val value1: Int)
class Depedency2(val value2: String)

class SystemUnderTest(val depedency1: Depedency1, val depedency2: Depedency2) {
    fun calculate(): Int {
        return depedency1.value1 + depedency2.value2.toInt()
    }
}
