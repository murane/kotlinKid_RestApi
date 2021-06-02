package jun.me.kotlinkid_restapi.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping(path = ["/"])
    fun index() = "Hello Spring!"
}