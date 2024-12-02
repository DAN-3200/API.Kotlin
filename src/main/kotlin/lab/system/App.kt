package lab.system

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppAPI

fun main(args: Array<String>) {
	runApplication<AppAPI>(*args)
}
