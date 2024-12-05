package lab.system

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController // Definindo a class como gerenciador de Requisições Web
class ToDoController {

    @PostMapping("/ToDo")
    fun CreateT(@RequestBody info : ToDo) = createToDo(info)

    @GetMapping("/ToDo")
    fun ReadT() = readToDo()

    @PutMapping("/ToDo")
    fun UpdateT(
        @RequestParam("id") id: Int,
        @RequestBody  info : ToDo // Body Request JSON
    ) {
        updateToDo(info, id)
    }

    @DeleteMapping("/ToDo")
    fun DeleteT(@RequestParam("id") id: Int) : Int = deleteToDo(id)
}