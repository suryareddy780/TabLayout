package edmt.dev.myprojecttabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import static edmt.dev.myprojecttabs.R.layout.single_item;

public class ProgramAdapter extends ArrayAdapter<String> {

    int[] images;
    String[] name;
    String[] urls;
    Context context;

    public ProgramAdapter(Context context, String[] name, int[] images, String[] urls) {
        super(context, R.layout.single_item, R.id.textView1, name);
        this.context=context;
        this.images=images;
        this.name= name;
        this.urls = urls;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View singleItem = convertView;
        ProgramViewHolder holder = null;
        if(singleItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(single_item,parent,false);
            holder = new ProgramViewHolder(singleItem);
            singleItem.setTag(holder);
        }
        else {
            holder = (ProgramViewHolder) singleItem.getTag();
        }
        holder.itemImage.setImageResource(images[position]);
        holder.programTitle.setText(name[position]);
        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                context.startActivity(open);
            }
        });
        return singleItem;
    }
}

