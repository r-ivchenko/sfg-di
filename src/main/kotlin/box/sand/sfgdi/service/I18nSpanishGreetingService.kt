package box.sand.sfgdi.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("ES", "default")
@Service("i18nService")
class I18nSpanishGreetingService: GreetingService {
    override fun sayGreeting(): String = "Hola Mundo - ES"
}