package com.edu.utng.modernlogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorBooks
        extends RecyclerView.Adapter<AdaptadorBooks.ViewHolderBooks>
        implements View.OnClickListener {

    ArrayList<Book>listaBooks;
    private View.OnClickListener listener;

    public AdaptadorBooks(ArrayList<Book> listaBooks) {
        this.listaBooks = listaBooks;
    }


    @Override
    public ViewHolderBooks onCreateViewHolder(ViewGroup parent, int viewType) {
        int layout=0;
        if (UtilidadesBook.visualizacion==UtilidadesBook.LIST){
            layout=R.layout.activity_item;
        }else {
            layout=R.layout.activity_item;
           // layout=R.layout.item_grid_personajes;
        }


        View view= LayoutInflater.from(parent.getContext()).inflate(layout,null,false);

        view.setOnClickListener(this);

        return new ViewHolderBooks(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderBooks holder, int position) {
        holder.etiTitulo.setText(listaBooks.get(position).getTitulo());
        if (UtilidadesBook.visualizacion==UtilidadesBook.LIST){
            holder.etiInformacion.setText(listaBooks.get(position).getInfo());
        }

        holder.foto.setImageResource(listaBooks.get(position).getFoto());


    }

    @Override
    public int getItemCount() {
        return listaBooks.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }
    }


    public class ViewHolderBooks extends RecyclerView.ViewHolder{

        TextView etiTitulo;
        TextView etiInformacion;
        ImageView foto;

        public ViewHolderBooks(View itemView) {
            super(itemView);
            etiTitulo = (TextView)itemView.findViewById(R.id.idTitulo);
            if (UtilidadesBook.visualizacion==UtilidadesBook.LIST){
                etiInformacion= (TextView) itemView.findViewById(R.id.idInfo);
            }
            foto= (ImageView) itemView.findViewById(R.id.idImagen);

        }
    }



}//end
