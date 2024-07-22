package dev.derekhayes.reservations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    String[] timeSlotArray;

    public RecyclerAdapter(String[] timeSlotArray) {
        this.timeSlotArray = timeSlotArray;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_time_slot, parent, false);
        return new RecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

        holder.timeTextView.setText(timeSlotArray[position]);
    }

    @Override
    public int getItemCount() {
        return timeSlotArray.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView timeTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            timeTextView = itemView.findViewById(R.id.time_slot);
        }
    }
}
