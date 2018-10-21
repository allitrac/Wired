package afinal.thesis.com.wired.HR.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import afinal.thesis.com.wired.HR.ObjectHolder.ScorecardCategoryHolder;
import afinal.thesis.com.wired.HR.ObjectOrModel.ScorecardCategoryObject;
import afinal.thesis.com.wired.R;

public class ScorecardCategoryAdapter extends RecyclerView.Adapter<ScorecardCategoryHolder> {

    private ArrayList<ScorecardCategoryObject> scorecardCategoryObjects;
    ScorecardCategoryObject scorecardCategoryObject;
    private Context mContext;

    public ScorecardCategoryAdapter() {

    }

    public ScorecardCategoryAdapter(Context c, ArrayList<ScorecardCategoryObject> scorecardCategoryObjects) {
        this.mContext = c;
        this.scorecardCategoryObjects = scorecardCategoryObjects;

    }

    @NonNull
    @Override
    public ScorecardCategoryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_scorecardattribs_layout, viewGroup, false);
        ScorecardCategoryHolder scorecardCategoryHolder = new ScorecardCategoryHolder(view, mContext, scorecardCategoryObjects);

        return scorecardCategoryHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ScorecardCategoryHolder scorecardCategoryHolder, int i) {

        scorecardCategoryObject = scorecardCategoryObjects.get(i);


        scorecardCategoryHolder.tvCategoryTitle.setText(scorecardCategoryObject.getCategoryTitle());
        scorecardCategoryHolder.tvItem1.setText(scorecardCategoryObject.getItem1());
        scorecardCategoryHolder.tvItem2.setText(scorecardCategoryObject.getItem2());
        scorecardCategoryHolder.tvItem3.setText(scorecardCategoryObject.getItem3());
        scorecardCategoryHolder.tvItem4.setText(scorecardCategoryObject.getItem4());
    }

    @Override
    public int getItemCount() {
        return scorecardCategoryObjects.size();
    }
}
