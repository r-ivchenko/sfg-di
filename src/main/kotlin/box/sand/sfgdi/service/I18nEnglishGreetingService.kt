package box.sand.sfgdi.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("EN")
@Service("i18nService")
class I18nEnglishGreetingService: GreetingService {
    override fun sayGreeting(): String = "Hello World - EN"
}