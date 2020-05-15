package External

import entities.Library
import java.io.File


class Export {
    fun exportLibrary(library: Library){
        val libraryFile = File("Archive")
        for (a_book in library.books){
            libraryFile.writeText("Auteur : " +a_book.author+", Titre : "+a_book.title+", Genre :"+a_book.genre)
        }
    }
}