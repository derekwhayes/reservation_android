package dev.derekhayes.reservations;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ConfirmSubmitFragment extends DialogFragment {

    private ConfirmSubmitListener listener;

    public interface ConfirmSubmitListener {
        void onConfirmSubmit(boolean confirmed);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (ConfirmSubmitListener) context;
        }
        catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement ConfirmSubmitListener");
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity(), R.style.CustomAlertDialog);
        builder.setTitle("Confirm");
        builder.setMessage("Please confirm your selection.");
        builder.setPositiveButton("OK", (dialog, which) -> {
            listener.onConfirmSubmit(true);
        });
        builder.setNegativeButton("CANCEL", (dialog, which) -> {
            listener.onConfirmSubmit(false);
        });
        return builder.create();
    }
}