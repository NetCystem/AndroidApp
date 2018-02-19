package com.example.macbook.androidapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.macbook.androidapp.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class FragmentDetails extends Fragment {

    private Button edit;
    private Button delete;
    private TextView product;
    private TextView fullName;
    private TextView country;
    private TextView associatemEmail;
    private TextView lifeTimeValue;
    private TextView firstSeen;
    private TextView userInfoName;
    private CircleImageView userInfoImage;
    private ImageView userInfoSocialImage;



    public FragmentDetails() {

    }

               //data pass by Bundle by newInstane method

//    public static FragmentDetails newInstance (Bundle bundle){
//
//        FragmentDetails  fragmentDetails = new FragmentDetails();
//
//        fragmentDetails.setArguments(bundle);
//
//        return fragmentDetails;
//    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.details_fragment, container, false);

        edit = view.findViewById(R.id.contact_info_edit_button);
        delete = view.findViewById(R.id.contact_info_delete_button);
        product = view.findViewById(R.id.products);
        fullName = view.findViewById(R.id.full_name);
        country = view.findViewById(R.id.country);
        associatemEmail = view.findViewById(R.id.associated_email);
        lifeTimeValue = view.findViewById(R.id.life_time_value);
        firstSeen = view.findViewById(R.id.first_seen);
        userInfoName = view.findViewById(R.id.user_info_name);
        userInfoImage = view.findViewById(R.id.user_info_image);
        userInfoSocialImage = view.findViewById(R.id.user_info_social_image);

        //data pass by bundle
//        if (getArguments() != null){
//            fullName.setText(getArguments().getString("key"));
//
//        }

        fullName.setText(getActivity().getIntent().getStringExtra("name"));
        userInfoName.setText(getActivity().getIntent().getStringExtra("name"));
        product.setText(getActivity().getIntent().getStringExtra("products"));
        country.setText(getActivity().getIntent().getStringExtra("country"));
        associatemEmail.setText(getActivity().getIntent().getStringExtra("email"));


        Glide.with(this)
                .load(getActivity().getIntent().getIntExtra("image", 0))
                .into(userInfoImage);

        Glide.with(this)
                .load(getActivity().getIntent().getIntExtra("socImage", 0))
                .into(userInfoSocialImage);


        return view;
    }



}
