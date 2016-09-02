package ciscoacademy.ciscoacademy.Fragments.Academy;


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
public class BaseInformationFragment extends Fragment {


    public BaseInformationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View baseInformationView =  inflater.inflate(R.layout.fragment_base_information, container, false);

        WebView webView = (WebView)baseInformationView.findViewById(R.id.webViewBaseInformation);
        webView.loadData(getString(R.string.nav_base_info_text), "text/html; charset=utf-8", "utf-8");

        return baseInformationView;
    }

}
