package com.ie23s.android.app.helpcoder.project.ui.taskslist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ie23s.android.app.helpcoder.R;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.TasksViewHolder>{

    private TasksListFragment fragment;

    RVAdapter(TasksListFragment fragment){
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public TasksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.frarment_tasks_list_cv, parent, false);
        return new TasksViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TasksViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return fragment.getTasks().size();
    }

    public static class TasksViewHolder extends RecyclerView.ViewHolder {
        CardView cv;

        TasksViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.fragment_tasks_list_cv);
        }
    }
}
