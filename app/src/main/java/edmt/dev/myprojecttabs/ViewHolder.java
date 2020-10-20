package edmt.dev.myprojecttabs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
    ImageView itemImage;
    TextView programTitle;
    ViewHolder(View v)
    {
        itemImage = v.findViewById(R.id.imageView);
        programTitle= v.findViewById(R.id.textView1);
    }
}
