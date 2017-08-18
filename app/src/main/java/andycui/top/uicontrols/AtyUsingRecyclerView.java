package andycui.top.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

/**
 * Created by colin on 2017/8/18.
 */


// 参考:http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2014/1118/2004.html;http://www.jianshu.com/p/4fc6164e4709

public class AtyUsingRecyclerView extends Activity {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_recyclerview);

        recyclerView = findViewById(R.id.recyclerView);

        // 创建默认线性LayoutManager
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(new String[]{"Andy","Ager","Jason","Angelo"});
        recyclerView.setAdapter(adapter);
        adapter.setItemClickListener(new MyRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(AtyUsingRecyclerView.this,"test",Toast.LENGTH_SHORT).show();
            }
        });







    }
}
