package realtalk.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.realtalk.R;

public class SelectRoomActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_room);
		
		ListView listView = (ListView) findViewById(R.id.list);
		
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                    long id) {
                
            	
        		Intent viewRs = new Intent(SelectRoomActivity.this, ChatRoomActivity.class);
        		SelectRoomActivity.this.startActivity(viewRs);
            }
        });
		
		String[] list1 = {"Room 001"};
		// Binding resources Array to ListAdapter
        listView.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, list1));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_room, menu);
		return true;
	}

}
