package lab.system

data class ToDo(
    var title : String,
    var content : String,
){
    var id : Int? = null
        private set
    var status : Boolean = false

    fun fixID(nID : Int){
        if (id == null){
            id = nID
        } else {
            throw IllegalArgumentException("ID já definido")
        }
    }
}
