package edmt.dev.myprojecttabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tab2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab2 extends Fragment {

    ListView listView;
    String[] name = {"Rose","Sunflower","Taj Mahal"};
    int[] images = {R.drawable.rose,R.drawable.sunflower,R.drawable.tajmahal};
    String[] urls ={"https://en.wikipedia.org/wiki/Rose","https://en.wikipedia.org/wiki/Helianthus","https://en.wikipedia.org/wiki/Taj_Mahal"};

    public Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_tab2, container, false);
        listView = v.findViewById(R.id.listViewFragment2);
        NewAdapter newAdapter = new NewAdapter(this.getContext(),name,images,urls);
        listView.setAdapter(newAdapter);
        return v;
    }
}