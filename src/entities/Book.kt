package entities

import java.util.*

class Book(randomUUID: UUID, var author: String, var title: String, var genre: String) {

    var id: UUID = randomUUID
}