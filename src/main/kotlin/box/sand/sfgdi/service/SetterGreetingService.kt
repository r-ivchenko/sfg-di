package box.sand.sfgdi.service

import org.springframework.stereotype.Service

@Service
class SetterGreetingService: GreetingService {
    override fun sayGreeting(): String = "Hello World - Setter"
}