package usecases

import entities.Book
import entities.Library
import java.util.*

class Management {
    fun addBookToLibrary(library: Library){

        print("Auteur : ")
        val author = readLine().toString()

        print("Titre : ")
        val title = readLine().toString()

        print("Genre : ")
        val genre = readLine().toString()

        val book = Book(UUID.randomUUID(), author, title, genre)

        library.books.add(book)

    }

    fun getListOfBooks(library: Library){

        println("La bibliothèque contient à présent les livres suivants : ")

        for(a_book in library.books){
            println("Id : "+a_book+ ", Titre : " +a_book.title+ ", Auteur : " +a_book.author+ ", Genre : "+a_book.genre)
        }
    }

    fun deleteBookById(library: Library) {
        getListOfBooks(library)

        print("Veuillez entrer l'id du livre que vous voulez supprimer : ")

        val id = readLine().toString()

        val removeBook : Book? = library.findBookById(id)
        library.books.remove(removeBook)
    }

    fun countBooks(library: Library){
        val nbBook : Int = library.books.count()
        println("Nombre de livres actuellement disponibles : "+nbBook)
    }
}