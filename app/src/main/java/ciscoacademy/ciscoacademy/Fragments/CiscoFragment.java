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
public class CiscoFragment extends Fragment {

    private NavLinkController clickClickController = null;

    public CiscoFragment() {
        clickClickController = new NavLinkController();
        clickClickController.setTempFragment(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentCisco = inflater.inflate(R.layout.fragment_cisco, container, false);

        Button btnTemp = null;

        btnTemp = (Button) fragmentCisco.findViewById(R.id.btnGoals);
        btnTemp.setOnClickListener(clickClickController);

        btnTemp = (Button) fragmentCisco.findViewById(R.id.btnInventions);
        btnTemp.setOnClickListener(clickClickController);

        btnTemp = (Button) fragmentCisco.findViewById(R.id.btnConnection);
        btnTemp.setOnClickListener(clickClickController);

        btnTemp = (Button) fragmentCisco.findViewById(R.id.btnMission);
        btnTemp.setOnClickListener(clickClickController);

        return fragmentCisco;
    }

}
