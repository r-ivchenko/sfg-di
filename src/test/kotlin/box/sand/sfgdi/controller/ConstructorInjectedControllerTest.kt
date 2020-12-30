package box.sand.sfgdi.controller

import box.sand.sfgdi.service.PrimaryGreetingService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ConstructorInjectedControllerTest {

    lateinit var controller: ConstructorInjectedController

    @BeforeEach
    fun setUp() {
        controller = ConstructorInjectedController(PrimaryGreetingService())
    }

    @Test
    fun getGreeting() {
        controller.getGreeting()
    }
}