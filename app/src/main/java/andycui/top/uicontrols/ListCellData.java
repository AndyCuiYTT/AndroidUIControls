package andycui.top.uicontrols;

import android.content.Context;
import android.content.Intent;

/**
 * Created by colin on 2017/8/16.
 */

public class ListCellData {


    public ListCellData(Context context, String controlName, Intent relatedIntent){
        this.controlName = controlName;
        this.context = context;
        this.relatedIntent = relatedIntent;
    }


    private String controlName = "";
    private Context context = null;
    private  Intent relatedIntent = null;

    public String getControlName() {
        return controlName;
    }

    public Context getContext() {
        return context;
    }

    public Intent getRelatedIntent() {
        return relatedIntent;
    }

    public  void startActivity(){
        getContext().startActivity(getRelatedIntent());
    }

    @Override
    public String toString() {
        return getControlName();
    }
}
