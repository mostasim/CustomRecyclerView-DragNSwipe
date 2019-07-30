package tech.mbsoft.customrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

import tech.mbsoft.customrecyclerview.adapter.CustomRecyclerViewAdapter;
import tech.mbsoft.customrecyclerview.adapter.DragNDropItemCallBackListener;

public class MainActivity extends AppCompatActivity {


   private RecyclerView recyclerView;
   private CustomRecyclerViewAdapter customRecyclerViewAdapter;
   private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        recyclerView = findViewById(R.id.rv_main);
        arrayList = new ArrayList<>();
        for(int i=0;i<10;i++){
            arrayList.add("Hello DS "+i);
        }
        customRecyclerViewAdapter = new CustomRecyclerViewAdapter(arrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        ItemTouchHelper.Callback callback = new DragNDropItemCallBackListener(customRecyclerViewAdapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(customRecyclerViewAdapter);


    }
}
