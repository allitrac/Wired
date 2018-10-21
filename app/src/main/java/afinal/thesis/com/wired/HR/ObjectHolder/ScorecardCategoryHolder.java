package afinal.thesis.com.wired.HR.ObjectHolder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import afinal.thesis.com.wired.HR.ObjectOrModel.ScorecardCategoryObject;
import afinal.thesis.com.wired.R;

public class ScorecardCategoryHolder extends RecyclerView.ViewHolder {

    public TextView tvCategoryTitle, tvItem1, tvItem2, tvItem3, tvItem4;
    ArrayList<ScorecardCategoryObject> scorecardCategoryObjectArrayList;
    Context context;

    public ScorecardCategoryHolder(@NonNull View itemView, Context context, ArrayList<ScorecardCategoryObject> scCatObject) {
        super(itemView);

        this.scorecardCategoryObjectArrayList = scCatObject;
        this.context = context;

        tvCategoryTitle = itemView.findViewById(R.id.tvCategoryTitle);
        tvItem1 = itemView.findViewById(R.id.tvItem1Title);
        tvItem2 = itemView.findViewById(R.id.tvItem2Title);
        tvItem3 = itemView.findViewById(R.id.tvItem3Title);
        tvItem4 = itemView.findViewById(R.id.tvItem4Title);
    }

}
