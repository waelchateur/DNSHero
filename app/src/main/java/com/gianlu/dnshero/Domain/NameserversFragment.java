package com.gianlu.dnshero.Domain;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gianlu.dnshero.NetIO.Domain;
import com.gianlu.dnshero.R;

import java.util.ArrayList;

public class NameserversFragment extends Fragment {

    public static NameserversFragment getInstance(Context context, Domain domain) {
        NameserversFragment fragment = new NameserversFragment();
        Bundle args = new Bundle();
        args.putString("title", context.getString(R.string.nameservers));
        args.putSerializable("authoritative", domain.authoritative.ns);
        args.putSerializable("resolver", domain.resolver.ns);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    @SuppressWarnings("unchecked")
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Bundle args = getArguments();
        ArrayList<Domain.NS> authoritative;
        ArrayList<Domain.NS> resolver;
        if (getContext() == null || args == null
                || (authoritative = (ArrayList<Domain.NS>) args.getSerializable("authoritative")) == null
                || (resolver = (ArrayList<Domain.NS>) args.getSerializable("resolver")) == null)
            return null;

        // TODO

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}