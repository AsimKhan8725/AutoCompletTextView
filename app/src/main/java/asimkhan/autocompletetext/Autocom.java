package asimkhan.autocompletetext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Autocom extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocom);
        String[] language={"java","Android",".Net","C","C++","Php","Html"};

        ArrayAdapter<String> adapter =new ArrayAdapter <String> (this,android.R.layout.select_dialog_item,language);

        AutoCompleteTextView act=(AutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView);

        act.setThreshold(1);
        act.setTextColor(getResources().getColor(R.color.colorAccent));
        act.setAdapter(adapter);


    }
}
