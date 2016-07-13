package robsonsouza.app.workingwithexpandablelist;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageViewThreatMonitor;
    private ImageView imageViewComplianceRules;
    private LinearLayout linearLayoutThreatMonitor;
    private LinearLayout linearLayoutComplianceRules;
    private RelativeLayout relativeLbl;
    private RelativeLayout relativeLbl2;
    private Switch switchSettingsAdbEnabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewThreatMonitor = (ImageView) findViewById(R.id.imageViewThreatMonitor);
        imageViewComplianceRules = (ImageView) findViewById(R.id.imageViewComplianceRules);

        linearLayoutThreatMonitor = (LinearLayout) findViewById(R.id.linearLayoutThreatMonitor);
        linearLayoutComplianceRules = (LinearLayout) findViewById(R.id.linearLayoutComplianceRules);

        switchSettingsAdbEnabled = (Switch) findViewById(R.id.switchSettingsAdbEnabled);;

        relativeLbl = (RelativeLayout) findViewById(R.id.relativeLbl);
        relativeLbl2 = (RelativeLayout) findViewById(R.id.relativeLbl2);

        relativeLbl.setOnClickListener(this);
        relativeLbl2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        try{
            switch (view.getId()){
                case R.id.relativeLbl:
                    if (linearLayoutThreatMonitor.getVisibility()== LinearLayout.VISIBLE){
                        linearLayoutThreatMonitor.setVisibility(LinearLayout.GONE);
                        imageViewThreatMonitor.setImageResource(R.drawable.ic_expand_more_black_24dp);
                    }
                    else{
                        linearLayoutThreatMonitor.setVisibility(LinearLayout.VISIBLE);
                        imageViewThreatMonitor.setImageResource(R.drawable.ic_expand_less_black_24dp);
                    }
                    break;

                case R.id.relativeLbl2:
                    if (linearLayoutComplianceRules.getVisibility()== LinearLayout.VISIBLE){
                        linearLayoutComplianceRules.setVisibility(LinearLayout.GONE);
                        imageViewComplianceRules.setImageResource(R.drawable.ic_expand_more_black_24dp);
                    }
                    else{
                        linearLayoutComplianceRules.setVisibility(LinearLayout.VISIBLE);
                        imageViewComplianceRules.setImageResource(R.drawable.ic_expand_less_black_24dp);
                        linearLayoutComplianceRules.setFocusable(false);
                        linearLayoutComplianceRules.setFocusableInTouchMode(false);
                        linearLayoutComplianceRules.setFocusable(true);
                        linearLayoutComplianceRules.setFocusableInTouchMode(true);
                        linearLayoutComplianceRules.requestFocus();
                    }
                    break;
            }
        }
        catch (Exception e){}
    }
}
