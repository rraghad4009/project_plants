package com.example.myapplication

fun main() {

    var r = ToDo()
    var task1 = Task("raghad",1 ,"Buy a Car")
    var task2 = Task("renad",2 ,"Travel to Amsterdam")
    var task3 = Task("leen",3 ,"Sell my dog")

    r.addTask(task1)
    r.addTask(task2)
    r.addTask(task3)
    r.PrintSpecificTask(2)
    r.removeTask(task2)
    r.changeTask(task3)
    r.showTask()
}

data class Task (val name : String , var id :Int , var note: String , var  isCompleted : Boolean = false )

class ToDo {

    val TaskOfType = arrayListOf<Task>()

    fun showTask(){
        println("All Tasks:")
        for (task in TaskOfType) {
            println("Task: ${task.note}")
        }
    }

    fun PrintSpecificTask(id : Int) {
        print("Task Details:")
        for (SId in TaskOfType) {
            if (id == SId.id)
                println(" ID (${SId.id}), name (${SId.name}), Task (${SId.note}), Completed (${SId.isCompleted}) ")
        }

    }

    fun addTask(task :Task){
        println("Add Task: "+ task.note)
        TaskOfType.add( task)

    }

    fun removeTask(task :Task){
        println("Remove Task:"+ task.note)
        TaskOfType.remove(task)

    }
    fun changeTask (isComplete: Task ){
        println("Task: ${isComplete.note}, Complete: ${!isComplete.isCompleted}")

    }


}