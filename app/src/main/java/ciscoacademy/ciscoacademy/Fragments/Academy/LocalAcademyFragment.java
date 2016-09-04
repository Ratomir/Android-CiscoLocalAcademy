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
public class LocalAcademyFragment extends Fragment {

    public LocalAcademyFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View localAcademyView =  inflater.inflate(R.layout.fragment_local_academy, container, false);

        WebView webView = null;

        webView = (WebView)localAcademyView.findViewById(R.id.webViewLocalAcademy);
        webView.loadData(getString(R.string.academy_local), "text/html; charset=utf-8", "utf-8");

        webView = (WebView)localAcademyView.findViewById(R.id.webViewApply);
        webView.loadData(getString(R.string.academy_apply_4), "text/html; charset=utf-8", "utf-8");

        return localAcademyView;
    }

}
