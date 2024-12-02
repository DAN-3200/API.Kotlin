package lab.system

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController // Definindo a class como gerenciador de Requisições Web
class ToDoController {
    @GetMapping("/ToDo")
    fun GET(@RequestParam("title") title: String) = "ToDo - Title: $title"

}