package box.sand.sfgdi.controller

import box.sand.sfgdi.service.GreetingService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class ConstructorInjectedController(@Qualifier("constructorGreetingService") greetingService: GreetingService) {

    private var greetingService: GreetingService = greetingService

    fun getGreeting(): String = greetingService.sayGreeting()
}