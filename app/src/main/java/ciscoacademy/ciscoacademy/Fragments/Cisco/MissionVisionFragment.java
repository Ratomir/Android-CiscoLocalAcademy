package ciscoacademy.ciscoacademy.Fragments.Cisco;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import ciscoacademy.ciscoacademy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MissionVisionFragment extends Fragment {

    public MissionVisionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View missionVisionView =  inflater.inflate(R.layout.fragment_mission_vision, container, false);

        WebView webView = (WebView)missionVisionView.findViewById(R.id.webViewMission);
        webView.loadData(getString(R.string.nav_mission_text), "text/html; charset=utf-8", "utf-8");

        return missionVisionView;
    }

}
