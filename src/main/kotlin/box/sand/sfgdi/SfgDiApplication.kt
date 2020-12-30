package box.sand.sfgdi

import box.sand.sfgdi.controller.ConstructorInjectedController
import box.sand.sfgdi.controller.SetterInjectedController
import box.sand.sfgdi.controller.PropertyInjectedController
import box.sand.sfgdi.controller.MyController
import box.sand.sfgdi.controller.I18nController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SfgDiApplication

fun main(args: Array<String>) {
	val ctx = runApplication<SfgDiApplication>(*args)

	println("-------------- I18nController")
	val i18nController: I18nController = ctx.getBean("i18nController") as I18nController
	println(i18nController.sayHello())

	println("-------------- Primary")
	val myController: MyController = ctx.getBean("myController") as MyController
	println(myController.sayHello())

	println("--------------- Property")
	val propertyInjectedController: PropertyInjectedController = ctx.getBean("propertyInjectedController") as PropertyInjectedController
	println(propertyInjectedController.getGreeting())

	println("--------------- Setter")
	val setterInjectedController: SetterInjectedController = ctx.getBean("setterInjectedController") as SetterInjectedController
	println(setterInjectedController.getGreeting())

	println("-------------- Constructor")
	val constructorInjectedController: ConstructorInjectedController = ctx.getBean("constructorInjectedController") as ConstructorInjectedController
	println(constructorInjectedController.getGreeting())
}
