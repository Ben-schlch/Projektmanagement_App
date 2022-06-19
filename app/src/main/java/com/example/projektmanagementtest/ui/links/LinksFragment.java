package com.example.projektmanagementtest.ui.links;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.projektmanagementtest.R;

public class LinksFragment extends Fragment {

    private LinksViewModel linksViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        linksViewModel =
                new ViewModelProvider(this).get(LinksViewModel.class);
        View root = inflater.inflate(R.layout.fragment_links, container, false);
        final TextView textView = root.findViewById(R.id.text_links);
        linksViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        TextView link1 = (TextView) root.findViewById(R.id.txthomepage);
        TextView link2 = (TextView) root.findViewById(R.id.txtdualis);
        TextView link3 = (TextView) root.findViewById(R.id.txtkontakt);
        TextView link4 = (TextView) root.findViewById(R.id.txtmail);
        TextView link5 = (TextView) root.findViewById(R.id.txtmoodle);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        link3.setMovementMethod(LinkMovementMethod.getInstance());
        link4.setMovementMethod(LinkMovementMethod.getInstance());
        link5.setMovementMethod(LinkMovementMethod.getInstance());

        return root;
    }


}