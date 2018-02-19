package com.example.macbook.androidapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.macbook.androidapp.fragments.ContactsInfo;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private List<Contacts> contactsList;



    public MyAdapter(Context context, List<Contacts> contactsList) {
        this.context = context;
        this.contactsList = contactsList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent,false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contacts contacts = contactsList.get(position);
        holder.name.setText(contacts.getName());
        holder.userCategory.setText(contacts.getUserCategory());
        holder.products = contacts.getProducts();
        holder.country = contacts.getCountry();
        holder.email = contacts.getEmail();
        holder.image = contacts.getUserImage();
        holder.socImage = contacts.getSocialImage();


        Glide.with(context)
                .load(contacts.getUserImage())
                .into(holder.userImage);


        Glide.with(context)
                .load(contacts.getSocialImage())
                .into(holder.socialImage);

    }


    @Override
    public int getItemCount() {
        {
            return contactsList.isEmpty()?0:contactsList.size();
        }
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView name;
        private TextView userCategoryTitle;
        private TextView userCategory;
        private CircleImageView userImage;
        private ImageView socialImage;
        String products;
        String country;
        String email;
        int image;
        int socImage;


        public ViewHolder(View itemView) {

            super(itemView);

            itemView.setOnClickListener(this);

            name = itemView.findViewById(R.id.name);
            userCategoryTitle = itemView.findViewById(R.id.category_of_user);
            userCategory = itemView.findViewById(R.id.user_category);
            userImage = itemView.findViewById(R.id.user_image);
            socialImage = itemView.findViewById(R.id.social_image);

        }


        @Override
        public void onClick(View v) {

            //data pass by bundle

//            Intent intent = new Intent(context, ContactsInfo.class);
//            Bundle bundle = new Bundle();
//            bundle.putString("key", "adafaf");
//            intent.putExtras(bundle);
//            context.startActivity(intent);

            Intent intent = new Intent(context, ContactsInfo.class);
            intent.putExtra("name", name.getText().toString());
            intent.putExtra("email", email);
            intent.putExtra("country", country);
            intent.putExtra("products", products);
            intent.putExtra("image",image);
            intent.putExtra("socImage", socImage);
            context.startActivity(intent);

        }
    }



}
