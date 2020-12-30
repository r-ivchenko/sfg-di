package box.sand.sfgdi.controller

import box.sand.sfgdi.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class SetterInjectedController {


    var greetingService: GreetingService? = null
        @Qualifier("setterGreetingService")
        @Autowired
        set(value) {
            field = value
        }

    fun getGreeting(): String = greetingService?.sayGreeting()!!

}