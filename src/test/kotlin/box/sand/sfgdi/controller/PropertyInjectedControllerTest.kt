package box.sand.sfgdi.controller

import box.sand.sfgdi.service.PrimaryGreetingService
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeEach

internal class PropertyInjectedControllerTest {

    lateinit var controller: PropertyInjectedController

    @BeforeEach
    fun setUp() {
        controller = PropertyInjectedController()
        controller.greetingService = PrimaryGreetingService()
    }

    @Test
    fun getGreeting() {
        println(controller.getGreeting())
    }
}