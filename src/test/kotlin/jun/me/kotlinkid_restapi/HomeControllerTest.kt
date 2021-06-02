package jun.me.kotlinkid_restapi

import io.kotest.core.listeners.TestListener
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.spring.SpringListener
import jun.me.kotlinkid_restapi.web.HelloController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTest : FunSpec() {

    override fun listeners(): List<TestListener> {
        return listOf(SpringListener)
    }

    @Autowired
    private lateinit var helloController: HelloController

    init {
        test("home controller test"){
            helloController.index() shouldBe "Hello Spring!"
        }
    }
}