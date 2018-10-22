package afinal.thesis.com.wired.HR.Data;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

import afinal.thesis.com.wired.HR.ObjectOrModel.ScorecardCategoryObject;
import afinal.thesis.com.wired.R;

public class ScorecardCategory {

    public static ArrayList<ScorecardCategoryObject> getCategories(Context context){
        final ArrayList<ScorecardCategoryObject> scorecardCategoryObjects = new ArrayList<>();
        final Resources resources = context.getResources();

//TODO: PSI
        ScorecardCategoryObject categoryObject = new ScorecardCategoryObject();
        categoryObject.setCategoryTitle(resources.getString(R.string.psi));
        categoryObject.setItem1(resources.getString(R.string.psi1));
        categoryObject.setItem2(resources.getString(R.string.psi2));
        categoryObject.setItem3(resources.getString(R.string.psi3));
        categoryObject.setItem4(resources.getString(R.string.psi4));
        scorecardCategoryObjects.add(categoryObject);


//TODO: LAVR
        categoryObject = new ScorecardCategoryObject();
        categoryObject.setCategoryTitle(resources.getString(R.string.lavr));
        categoryObject.setItem1(resources.getString(R.string.lavr1));
        categoryObject.setItem2(resources.getString(R.string.lavr2));
        categoryObject.setItem3(resources.getString(R.string.lavr3));
        categoryObject.setItem4(resources.getString(R.string.lavr4));
        scorecardCategoryObjects.add(categoryObject);

//TODO: DSC
        categoryObject = new ScorecardCategoryObject();
        categoryObject.setCategoryTitle(resources.getString(R.string.dsc));
        categoryObject.setItem1(resources.getString(R.string.dsc1));
        categoryObject.setItem2(resources.getString(R.string.dsc2));
        categoryObject.setItem3(resources.getString(R.string.dsc3));
        categoryObject.setItem4(resources.getString(R.string.dsc4));
        scorecardCategoryObjects.add(categoryObject);

//TODO: IFSC
        categoryObject = new ScorecardCategoryObject();
        categoryObject.setCategoryTitle(resources.getString(R.string.ifsc));
        categoryObject.setItem1(resources.getString(R.string.ifsc1));
        categoryObject.setItem2(resources.getString(R.string.ifsc2));
        categoryObject.setItem3(resources.getString(R.string.ifsc3));
        categoryObject.setItem4(resources.getString(R.string.ifsc4));
        scorecardCategoryObjects.add(categoryObject);

        return scorecardCategoryObjects;
    }
}
