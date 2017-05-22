package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by Laurie on 5/21/2017.
 */
//this extension is how android knows to treat this class's
//lifecycle event and creations as fragment
public class BodyPartFragment extends Fragment {

    //mandatory empty constructor for instantiating the fragment
    public BodyPartFragment(){

    }

    //onCreateView inflates the fragment layout and sets any image resources for display
    //like onCreate for an activity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflate the ImageView fragment layout xml
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        //get reference to the ImageView in the fragment layout xml
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        //set the image to display on the ImageView fragment layout xml
        //currently only displays the first head image
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;
    }
}
