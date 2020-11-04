package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.coffeekind.R
import model.Coffee

class ListCoffeeAdapter(val listCoffee : ArrayList<Coffee>) : RecyclerView.Adapter<ListCoffeeAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Coffee)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_card_coffee, viewGroup, false)
        return ListViewHolder(view)
    }
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_name)
        val tvDesc: TextView = itemView.findViewById(R.id.tv_desc)
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun getItemCount(): Int {
        return listCoffee.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name,desc,photo) = listCoffee[position]

        Glide.with((holder.itemView.context))
            .load(photo)
            .apply(RequestOptions().override(60,60))
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvDesc.text = desc
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listCoffee[holder.adapterPosition])
        }
    }


}
