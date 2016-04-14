package com.example.nasif.fragmentexample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener{

    MainActivity myactivity_;
    Button myButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myView = inflater.inflate(R.layout.fragment_main, container, false);
        myButton = (Button) myView.findViewById(R.id.button);
        myButton.setOnClickListener(this);
        return myView;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button:
                myactivity_.sendData("Msg");
                break;
        }
    }

    public interface sendDataInterface{
        public void sendData(String msg_);
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        myactivity_ = (MainActivity) context;
    }
}
