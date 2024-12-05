package lab.system

var DB = mutableListOf<ToDo>()
var count_id = 1

fun createToDo(item : ToDo){
    item.fixID(count_id++)
    DB.add(item)
}

fun readToDo() : MutableList<ToDo> {
    return DB
}

fun updateToDo(item : ToDo, id : Int) {
    for (target in DB) {
        if (target.id == id){
            target.title = item.title
            target.content = item.content
            target.status = item.status
        }
    }
}

fun deleteToDo(id : Int) : Int {
    for ((index, target) in DB.withIndex()){
        if (target.id == id){
            DB.removeAt(index)
            return 200
        }
    }
    return 404
}