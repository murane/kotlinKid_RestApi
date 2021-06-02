package jun.me.kotlinkid_restapi

import io.kotest.core.listeners.TestListener
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.TestCase.Companion.test
import io.kotest.matchers.shouldBe
import io.kotest.spring.SpringListener
import jun.me.kotlinkid_restapi.web.HomeController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTest : FunSpec() {

    override fun listeners(): List<TestListener> {
        return listOf(SpringListener)
    }

    @Autowired
    private lateinit var homeControllerTest: HomeController

    init {
        test("home controller test"){
            homeControllerTest.index() shouldBe "Hello Spring"
        }
    }
}