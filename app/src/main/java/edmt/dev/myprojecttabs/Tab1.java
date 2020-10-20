package edmt.dev.myprojecttabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tab1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab1 extends Fragment {

    ListView listView;
    String[] name = {"Deccan Chronicle","Times of India","Newyork Times","Eenadu","Hindustan Times","Indian Express"};
    int[] images = {R.drawable.deccan,R.drawable.timesofindia,R.drawable.newyorktimes,R.drawable.eenadu,R.drawable.hindustan,R.drawable.indianexpress};
    String[] urls = {"https://www.deccanchronicle.com/","https://timesofindia.indiatimes.com/","https://www.nytimes.com/","https://www.eenadu.net/","https://www.hindustantimes.com/","https://indianexpress.com/"};


    public Tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_tab1, container, false);
        listView = v.findViewById(R.id.listViewFragment1);
        ProgramAdapter programAdapter = new ProgramAdapter(this.getContext(),name,images,urls);
        listView.setAdapter(programAdapter);
        return v;
    }
}