package ciscoacademy.ciscoacademy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import ciscoacademy.ciscoacademy.Fragments.Academy.BaseInformationFragment;
import ciscoacademy.ciscoacademy.Fragments.Cisco.ConnectionFragment;
import ciscoacademy.ciscoacademy.Fragments.Cisco.GoalsFragment;
import ciscoacademy.ciscoacademy.Fragments.Cisco.InventionsFragment;
import ciscoacademy.ciscoacademy.Fragments.Cisco.MissionVisionFragment;

/**
 * Created by Ratomir on 1.9.2016..
 */
public class NavLinkController implements View.OnClickListener {

    private Fragment tempFragment = null;

    @Override
    public void onClick(View v) {
        int id = v.getId();

        FragmentTransaction fragmentTransaction = getTempFragment().getFragmentManager().beginTransaction();

        if (id == R.id.btnGoals) {
            fragmentTransaction.replace(R.id.FragmentContainer, new GoalsFragment());
        } else if (id == R.id.btnInventions) {
            fragmentTransaction.replace(R.id.FragmentContainer, new InventionsFragment());
        }else if (id == R.id.btnConnection){
            fragmentTransaction.replace(R.id.FragmentContainer, new ConnectionFragment());
        }else if(id == R.id.btnMission){
            fragmentTransaction.replace(R.id.FragmentContainer, new MissionVisionFragment());
        }
        else if(id == R.id.btnBaseInformation){
            fragmentTransaction.replace(R.id.FragmentContainer, new BaseInformationFragment());
        }

        //new comment test

        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public Fragment getTempFragment() {
        return tempFragment;
    }

    public void setTempFragment(Fragment tempFragment) {
        this.tempFragment = tempFragment;
    }
}
