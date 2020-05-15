package entities

import java.util.*

class Library {
    val books = arrayListOf<Book>()

    fun findBookById(id: String): Book? {
        var book: Book? = null
        val idBook : UUID = UUID.fromString(id)
        for(a_book in books){
            if(a_book.id == idBook){
                book = a_book
            }
        }
        return book
    }
}