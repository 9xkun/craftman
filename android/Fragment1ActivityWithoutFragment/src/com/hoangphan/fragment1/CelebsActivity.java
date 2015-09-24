package com.hoangphan.fragment1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CelebsActivity extends ListActivity {

  private String[] celebs;
  private String[] quotes;

  /**
   * Called when the activity is first created.
   */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    //init 2 array of string
    celebs = getResources().getStringArray(R.array.celebs);
    quotes = getResources().getStringArray(R.array.quotes);

    //build listview with this data
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, celebs);
    setListAdapter(adapter);
  }

  @Override
  protected void onListItemClick(ListView l, View v, int position, long id) {
    Intent quoteIntent = new Intent(this, QuotesActivity.class);
    quoteIntent.putExtra("index", quotes[position]); //pass quote to Quote Screen
    startActivity(quoteIntent);
  }
}
