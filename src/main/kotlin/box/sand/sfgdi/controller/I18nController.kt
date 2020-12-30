package box.sand.sfgdi.controller

import box.sand.sfgdi.service.GreetingService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class I18nController(@Qualifier("i18nService") private val greetingService: GreetingService) {

    public fun sayHello(): String = greetingService.sayGreeting()

}