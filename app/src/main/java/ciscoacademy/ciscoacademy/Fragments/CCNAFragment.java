package ciscoacademy.ciscoacademy.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ciscoacademy.ciscoacademy.NavLinkController;
import ciscoacademy.ciscoacademy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CCNAFragment extends Fragment {

    private NavLinkController navLinkController = null;

    public CCNAFragment() {
        navLinkController = new NavLinkController();
        navLinkController.setTempFragment(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentAcademy = inflater.inflate(R.layout.fragment_ccna, container, false);

        Button btnTemp = null;

        btnTemp = (Button) fragmentAcademy.findViewById(R.id.btnCCNABaseInformation);
        btnTemp.setOnClickListener(navLinkController);

        btnTemp = (Button) fragmentAcademy.findViewById(R.id.btnSemester1);
        btnTemp.setOnClickListener(navLinkController);

        btnTemp = (Button) fragmentAcademy.findViewById(R.id.btnSemester2);
        btnTemp.setOnClickListener(navLinkController);

        btnTemp = (Button) fragmentAcademy.findViewById(R.id.btnSemester3);
        btnTemp.setOnClickListener(navLinkController);

        btnTemp = (Button) fragmentAcademy.findViewById(R.id.btnSemester4);
        btnTemp.setOnClickListener(navLinkController);

        return fragmentAcademy;
    }

}
