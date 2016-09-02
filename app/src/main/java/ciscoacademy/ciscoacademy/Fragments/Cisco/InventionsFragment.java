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
public class InventionsFragment extends Fragment {

    public InventionsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inventionsView =  inflater.inflate(R.layout.fragment_inventions, container, false);

        WebView webView = (WebView)inventionsView.findViewById(R.id.webViewInventions);
        webView.loadData(getString(R.string.nav_inventions_text), "text/html; charset=utf-8", "utf-8");

        return inventionsView;
    }

}
