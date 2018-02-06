package com.example.soksan.webviewof3button;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

/**
 * Created by Soksan on 03-Oct-17.
 */

public class RightFragment extends Fragment {
    WebView website;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.right_fragment,container,false);
        website=(WebView)view.findViewById(R.id.rightFrag);
        return view;
    }

    public void getURL() {

    }
}
