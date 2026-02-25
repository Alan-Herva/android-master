package id.ac.pnm.myheroes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.ac.pnm.myheroes.model.Books

class BooksAdapter(
    val books: List<Books>
) : RecyclerView.Adapter<BooksAdapter.BookViewHolder>()  {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_books, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: BookViewHolder,
        position: Int
    ) {
        val book = books.get(position)

        Glide.with(holder.bookImage.context)
            .load(book.cover)
            .into(holder.bookImage)

        holder.bookTitle.text = book.originalTitle
        holder.bookRelease.text = book.releaseDate
    }

    override fun getItemCount(): Int {
        return books.size
    }

    class BookViewHolder(view : View): RecyclerView.ViewHolder(view){
        val bookImage = view.findViewById<ImageView>(R.id.booksImage)
        val bookTitle = view.findViewById<TextView>(R.id.booksTitle)
        val bookRelease = view.findViewById<TextView>(R.id.bookRelease)

    }

}