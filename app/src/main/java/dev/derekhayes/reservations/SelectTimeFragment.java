package dev.derekhayes.reservations;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SelectTimeFragment extends Fragment {

    String[] timeSlots;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        timeSlots = getResources().getStringArray(R.array.time_slot_string_array);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_select_time, container, false);

        RecyclerView recyclerView = viewRoot.findViewById(R.id.time_slot_scroller);

        if (recyclerView != null) {
            RecyclerAdapter adapter = new RecyclerAdapter(timeSlots);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        }

        return viewRoot;
    }


}