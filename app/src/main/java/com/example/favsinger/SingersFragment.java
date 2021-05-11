package com.example.favsinger;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SingersFragment extends Fragment {
    private RecyclerView rcv;
    private MyAdapter adapter;

    public SingersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcv = (RecyclerView) getView().findViewById(R.id.recview);
//        rcv.setHasFixedSize(true);
        rcv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(listData(),getActivity());
        rcv.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_singers, container, false);
    }

    public ArrayList<DataModel> listData()
    {
        ArrayList<DataModel> holder=new ArrayList<>();

        DataModel ob1=new DataModel();
        ob1.setHeader("Alec Benjamin");
        ob1.setDesc("My favorite song : Water Fountain ");
        ob1.setImgname(R.drawable.alecben);
        holder.add(ob1);

        DataModel ob2=new DataModel();
        ob2.setHeader("Neoni");
        ob2.setDesc("My favorite song : Champion");
        ob2.setImgname(R.drawable.neoni);
        holder.add(ob2);

        DataModel ob3=new DataModel();
        ob3.setHeader("Nico Collins");
        ob3.setDesc("My favorite song : It Is My Bad");
        ob3.setImgname(R.drawable.nico);
        holder.add(ob3);

        DataModel ob4=new DataModel();
        ob4.setHeader("Jack Daniels");
        ob4.setDesc("My favorite song : The Show");
        ob4.setImgname(R.drawable.jack);
        holder.add(ob4);

        DataModel ob5=new DataModel();
        ob5.setHeader("Neffex");
        ob5.setDesc("My favorite song : Space.");
        ob5.setImgname(R.drawable.neffex);
        holder.add(ob5);

        DataModel ob6=new DataModel();
        ob6.setHeader("Ilira");
        ob6.setDesc("My favorite song : Pay Me Back");
        ob6.setImgname(R.drawable.ilira);
        holder.add(ob6);

        DataModel ob7=new DataModel();
        ob7.setHeader("Sasha Sloan");
        ob7.setDesc("My favorite song : Is It Just Me");
        ob7.setImgname(R.drawable.sasha);
        holder.add(ob7);

        DataModel ob8=new DataModel();
        ob8.setHeader("Arcando");
        ob8.setDesc("My favorite song : End of The World (Arcando and That Behavior feat Neoni)");
        ob8.setImgname(R.drawable.arcando);
        holder.add(ob8);

        DataModel ob9=new DataModel();
        ob9.setHeader("Kina");
        ob9.setDesc("My favorite song : Wish I Was Better");
        ob9.setImgname(R.drawable.kina);
        holder.add(ob9);

        DataModel ob10=new DataModel();
        ob10.setHeader("Besomorph");
        ob10.setDesc("My favorite song :");
        ob10.setImgname(R.drawable.besomorph);
        holder.add(ob10);

        return holder;
    }

}