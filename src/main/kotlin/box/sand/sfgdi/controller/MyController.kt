package box.sand.sfgdi.controller

import box.sand.sfgdi.service.GreetingService
import org.springframework.stereotype.Controller

@Controller
class MyController(private val greetingService: GreetingService) {

    fun sayHello(): String {
        println("Hello World!!!")
        return greetingService.sayGreeting()
    }
}