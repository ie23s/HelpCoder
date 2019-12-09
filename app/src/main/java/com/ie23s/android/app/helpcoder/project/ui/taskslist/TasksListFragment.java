package com.ie23s.android.app.helpcoder.project.ui.taskslist;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ie23s.android.app.helpcoder.R;
import com.ie23s.android.app.helpcoder.project.task.Task;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class TasksListFragment extends Fragment {

    private View view;
    private ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_tasks_list, container, false);

        loadTasks();
        createRV();

        return view;
    }

    /**
     * This method loads RecyclerView and fulls it with content.
     */
    private void createRV() {
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.frarment_tasks_list_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        RVAdapter rvAdapter = new RVAdapter(this);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(rvAdapter);

    }

    ArrayList<Task> getTasks() {
        return tasks;
    }

    protected void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    protected abstract void loadTasks();
}
