package box.sand.sfgdi.service

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Primary
@Service
class PrimaryGreetingService : GreetingService {
    override fun sayGreeting(): String = "Hello World - Primary"
}