/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.fragment1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 *
 * @author hoangpt
 */
public class QuotesActivity extends ListActivity {

  /**
   * Called when the activity is first created.
   */
  @Override
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    
    //get Intent fromCelebs
    Intent i = getIntent();
    String quote = i.getStringExtra("index");
    
    //display quote
    //should check quote (because if we do not pass, app will not crash)
    if(null != quote){
      //(chaining statement code)
      //setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, new String[]{quote}));
      setListAdapter(new ArrayAdapter(this, R.layout.list_item, new String[]{quote}));
    }
  }
}
