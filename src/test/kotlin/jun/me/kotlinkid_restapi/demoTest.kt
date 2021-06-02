package jun.me.kotlinkid_restapi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldHaveLength

class demoTest : FunSpec() {
    init {
        test("this is my first test"){
            val name = "sam"
            name.shouldHaveLength(3)
        }
    }
}