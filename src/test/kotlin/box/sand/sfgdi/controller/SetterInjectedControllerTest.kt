package box.sand.sfgdi.controller

import box.sand.sfgdi.service.PrimaryGreetingService
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Test

internal class SetterInjectedControllerTest {

    lateinit var controller: SetterInjectedController

    @BeforeEach
    fun setUp() {
        controller = SetterInjectedController()
        controller.greetingService = PrimaryGreetingService()
    }

    @Test
    fun getGreeting() {
        println(controller.getGreeting())
    }
}