package jp.suntech.c21006.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMenu=findViewById(R.id.lv_Menu);
        lvMenu.setOnItemClickListener(new ListItemClickListener());
    }

   private class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            String item=(String) parent.getItemAtPosition(position);

            TextView output=findViewById(R.id.textView);
            output.setText(item);
        }
    }
}