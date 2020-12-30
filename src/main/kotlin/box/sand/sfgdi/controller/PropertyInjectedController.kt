package box.sand.sfgdi.controller

import box.sand.sfgdi.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class PropertyInjectedController {
    /*Could be next declaration called Injection by Property?*/
    /*Probably Kotlin syntax does not support PURE Injection by Property*/
    /*Keep in mind that Field Injection by @Value annotation works fine*/
    @Qualifier("propertyGreetingService")
    @Autowired
    lateinit var greetingService: GreetingService

    fun getGreeting(): String = greetingService.sayGreeting()

}