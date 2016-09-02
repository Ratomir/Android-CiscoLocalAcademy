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
public class GoalsFragment extends Fragment {

    public GoalsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View goalsView =  inflater.inflate(R.layout.fragment_goals, container, false);

        WebView webView = (WebView)goalsView.findViewById(R.id.webViewGoals);
        webView.loadData(getString(R.string.nav_golas_text), "text/html; charset=utf-8", "utf-8");

        return goalsView;
    }
}
