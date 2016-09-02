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
public class OrganizationFragment extends Fragment {


    public OrganizationFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View organizationView =  inflater.inflate(R.layout.fragment_organization, container, false);

        WebView webView = (WebView)organizationView.findViewById(R.id.webViewOrganization);
        webView.loadData(getString(R.string.academy_organization_part1), "text/html; charset=utf-8", "utf-8");

        return organizationView;
    }

}
