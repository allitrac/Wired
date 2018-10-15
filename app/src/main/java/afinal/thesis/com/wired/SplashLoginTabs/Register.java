package afinal.thesis.com.wired.SplashLoginTabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

import afinal.thesis.com.wired.MainDashboard;
import afinal.thesis.com.wired.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Register.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Register extends Fragment {

    private OnFragmentInteractionListener mListener;

    Button btnUserRegister;
    public Register() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View registerView = inflater.inflate(R.layout.fragment_register, container, false);

        btnUserRegister = registerView.findViewById(R.id.btnUserRegister);
        btnUserRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnUserRegister.setBackgroundResource(R.drawable.background_button_pink);

                Intent toMainDashboardActivity = new Intent(getContext(), MainDashboard.class);
                startActivity(toMainDashboardActivity);
            }
        });
        return registerView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
