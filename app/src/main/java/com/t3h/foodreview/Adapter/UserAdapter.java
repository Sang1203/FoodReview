package com.t3h.foodreview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.t3h.foodreview.Models.User;
import com.t3h.foodreview.R;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    private ArrayList<User> data;
    private LayoutInflater inflater;

    public ArrayList<User> getData() {
        return data;
    }

    public void setData(ArrayList<User> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public LayoutInflater getInflater() {
        return inflater;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.user_detail,parent,false);

        return new UserHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        holder.bindView(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data == null ? 0: data.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        private ImageView imUser;
        private TextView tvName;
        private Button btnFollow;
        private Button btnShare;
        private TextView tvNguoitheodoi;
        private TextView tvBaiviet;
        private TextView tvDangtheodoi;
        public UserHolder(@NonNull View itemView) {
            super(itemView);
            imUser = itemView.findViewById(R.id.im_user);
            tvName =itemView.findViewById(R.id.tv_nameuser);
            btnFollow = itemView.findViewById(R.id.btn_theodoi);
            btnShare = itemView.findViewById(R.id.btn_chiase);
            tvNguoitheodoi = itemView.findViewById(R.id.tv_nguoitheodoi);
            tvBaiviet = itemView.findViewById(R.id.tv_baiviet);
            tvDangtheodoi = itemView.findViewById(R.id.tv_dangtheodoi);
        }

        public void bindView(User user) {
            imUser.setImageResource(getItemCount());
            tvName.setText(user.getName());
            tvBaiviet.setText(user.getSobaiviet());
            tvNguoitheodoi.setText(user.getSonguoitheodoi());
            tvDangtheodoi.setText(user.getDangtheodoi());

        }
    }
}
