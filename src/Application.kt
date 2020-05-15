import entities.Book
import entities.Library
import java.util.*

fun main(){

    val library = Library()

    println("Bienvenue dans votre bibliothèque, pour ajouter un livre, appuyez sur une touche pour continuer")

    readLine()

    while(true) {
        print("Auteur :")
        val author = readLine().toString()

        print("Titre : ")
        val title = readLine().toString()

        print("Genre : ")
        val genre = readLine().toString()

        val book = Book(UUID.randomUUID(), author, title, genre)

        library.books.add(book)

        println("La bibliothèque contient à présent les livres suivants : ")

        for(a_book in library.books){
            println("Titre : " +a_book.title+ ", Auteur : " +a_book.author+ ", Genre : "+a_book.genre)
        }
    }

}