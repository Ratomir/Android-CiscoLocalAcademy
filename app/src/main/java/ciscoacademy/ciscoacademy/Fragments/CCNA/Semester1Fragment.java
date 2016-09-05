package ciscoacademy.ciscoacademy.Fragments.CCNA;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ciscoacademy.ciscoacademy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Semester1Fragment extends Fragment {


    public Semester1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_semester1, container, false);
    }

}
