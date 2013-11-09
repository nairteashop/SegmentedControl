package org.nairteashop;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity
    extends Activity {
    /**
     * 
     */
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup segmentedCtrl = (RadioGroup)findViewById( R.id.segmented_control );

        segmentedCtrl.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged( RadioGroup group, int checkedId ) {
                RadioButton selected = (RadioButton)group.findViewById( checkedId );

                TextView label = (TextView)findViewById( R.id.label );
                label.setText( "Selected: " + selected.getText() );

            }
        } );
        
        segmentedCtrl.check( R.id.opt_1 );
    }
}
