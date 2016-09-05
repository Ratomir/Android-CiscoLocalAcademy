package ciscoacademy.ciscoacademy.Fragments.CCNA;


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
public class CCNABaseFragment extends Fragment {


    public CCNABaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View ccnaBaseInformationView =  inflater.inflate(R.layout.fragment_ccnabase, container, false);

        WebView webView = (WebView)ccnaBaseInformationView.findViewById(R.id.webViewCCNABase);
        webView.loadData(getString(R.string.ccna_text), "text/html; charset=utf-8", "utf-8");

        return ccnaBaseInformationView;
    }

}
