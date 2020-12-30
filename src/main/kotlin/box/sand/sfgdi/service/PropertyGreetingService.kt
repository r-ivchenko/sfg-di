package box.sand.sfgdi.service

import org.springframework.stereotype.Service

@Service
class PropertyGreetingService: GreetingService {
    override fun sayGreeting(): String = "Hello World - Property"
}