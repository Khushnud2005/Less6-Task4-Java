package uz.exemple.less6_task4_java.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.exemple.less6_task4_java.MainActivity;
import uz.exemple.less6_task4_java.ProfileActivity;
import uz.exemple.less6_task4_java.R;
import uz.exemple.less6_task4_java.model.MemberModel;

public class Adapter extends RecyclerView.Adapter<Adapter.MainViewHolder>{

    ArrayList<String> arrayList;
    private Context context;

    public Adapter(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(arrayList.get(position));
        context = holder.itemView.getContext();
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MemberModel model = new MemberModel("Xushnud",27,"Surgery");
                Intent intent = new Intent(v.getContext(), ProfileActivity.class);
                intent.putExtra("member",model);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        LinearLayout linearLayout;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.linear_layout);
            textView = itemView.findViewById(R.id.itemTv);
        }
    }




}
