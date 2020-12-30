package box.sand.sfgdi.service

import org.springframework.stereotype.Service

@Service
class ConstructorGreetingService: GreetingService {
    override fun sayGreeting(): String = "Hello World - Constructor"
}