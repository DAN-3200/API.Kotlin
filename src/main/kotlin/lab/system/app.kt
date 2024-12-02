package lab.system

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// class herdando todas as configurações pré-definidas pelo Spring Boot
@SpringBootApplication
class AppAPI

fun main(args: Array<String>) {
	runApplication<AppAPI>(*args)
}
