package userinterface

import entities.Book
import entities.Library
import usecases.Management
import java.util.*
import kotlin.system.exitProcess

fun main(){

    val library = Library()
    val management = Management()

    println("Bienvenue dans votre bibliothèque, veuillez appuyer sur entrée, puis entrez l'action que vous voulez effectuer, vous avez le choix entre 'Ajouter', 'Lister', 'Supprimer', 'Compter' ou 'Quitter' ")

    readLine()

    while(true) {

        var action: String = readLine().toString()

        if (action == "Ajouter") {
            management.addBookToLibrary(library)
            println("Le livre a bien été ajouté, veuillez entrer la prochaine action a efectuer")
        }

        else if(action == "Lister") {
            management.getListOfBooks(library)
            println("Veuillez entrer la prochaine action a efectuer")
        }

        else if(action == "Supprimer"){
            management.deleteBookById(library)
        }

        else if(action == "Compter"){
            management.countBooks(library)
            println("Veuillez entrer la prochaine action a efectuer")
        }

        else if(action == "Quitter"){
            exitProcess(status = 0)
        }

        else{
            println("L'action n'a pas été comprise veuillez réessayer")
        }
    }

}