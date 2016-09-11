package karanbatra.com.ckconnect.Services;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import karanbatra.com.ckconnect.Models.*;
import karanbatra.com.ckconnect.R;
import karanbatra.com.ckconnect.Services.Codekamp.Callback;
import karanbatra.com.ckconnect.Services.Codekamp.CodekampService;

public class MainActivity extends AppCompatActivity {

    List<Contact> contacts;
    RecyclerView.Adapter mAdapter;
    RecyclerView mRecyclerView;
    List<Contact> empty=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        mAdapter = new MyAdapter(this, empty);
        mRecyclerView.setAdapter(mAdapter);

       //Utils.isNetwork(getApplicationContext());


        CodekampService service = new CodekampService("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjIsImlzcyI6Imh0dHA6XC9cL2FwaS5jb2Rla2FtcC5pblwvYXV0aGVudGljYXRlIiwiaWF0IjoxNDYzMDc1ODI5LCJleHAiOjE0NjQyODU0MjksIm5iZiI6MTQ2MzA3NTgyOSwianRpIjoiNjQxZWRhYWIyYmIwYTM1ZThiYjBkZmUxZWViNWQ1ZmYifQ.h4M1QKuD3VMpCgwH8O4t_qkuAge3F1TSH9xVbDCa6Pg");
        service.listContacts(1, new Callback<ListResponse<Contact>>() {
            @Override
            public void onSuccess(ListResponse<Contact> response) {
                contacts = response.getData();
                mAdapter = new MyAdapter(getApplicationContext(), contacts);
                mRecyclerView.setAdapter(mAdapter);

//                Log.d("codekamp", contacts.get(1).getFirstName());
                response.getMeta();
            }

            @Override
            public void onFailure(karanbatra.com.ckconnect.Models.Error error) {
                Log.d("codekamp", error.getMessage());
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_menu, menu);

//        SearchManager searchManager=(SearchManager)getSystemService(Context.SEARCH_SERVICE);
//        SearchView searchView=(SearchView)menu.findItem(R.id.action_search).getActionView();
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return true;
//            }

//            @Override
//            public boolean onQueryTextChange(String newText) {
//                return false;
//            }
//        });

        return true;
    }

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener {

        TextView textView;
        List<Contact> myContactList;

        public MyAdapter(Context context, List<Contact> myList) {
            myContactList=myList;

        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder,parent,false);

            ViewHolder vh = new ViewHolder(v);

            return vh;
        }
        public showDialogue

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            holder.textView.setText(myContactList.get(position).getFirstName());

        }

        @Override
        public int getItemCount() {

            return myContactList.size();
        }

        @Override
        public void onClick(View v) {


        }

        public class ViewHolder extends RecyclerView.ViewHolder {


            public TextView textView;

            public ViewHolder(View view) {
                super(view);
                textView = (TextView)view.findViewById(R.id.text_view_adapter);


            }


        }
    }
    public void FloatAction(View view)
    {
        Intent i=new Intent(this,SignUp.class);
        startActivity(i);
    }
}

