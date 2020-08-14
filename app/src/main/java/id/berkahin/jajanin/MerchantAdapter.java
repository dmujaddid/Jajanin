package id.berkahin.jajanin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class MerchantAdapter extends RecyclerView.Adapter<MerchantAdapter.MyViewHolder> {

    Context context;
    ArrayList<Merchant> merchants;

    public MerchantAdapter(Context c , ArrayList<Merchant> m)
    {
        context = c;
        merchants = m;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nama.setText(merchants.get(position).getNama());
        holder.harga.setText(merchants.get(position).getHarga());
        holder.alamat.setText(merchants.get(position).getAlamat());
        Picasso.get().load(merchants.get(position).getFoto()).into(holder.foto);
    }

    @Override
    public int getItemCount() {
        return merchants.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView nama, alamat, harga;
        ImageView foto;
        public MyViewHolder(View itemView) {
            super(itemView);
            nama = (TextView) itemView.findViewById(R.id.nama);
            harga = (TextView) itemView.findViewById(R.id.harga);
            alamat = (TextView) itemView.findViewById(R.id.alamat);
            foto = (ImageView) itemView.findViewById(R.id.foto);
        }
    }

}
