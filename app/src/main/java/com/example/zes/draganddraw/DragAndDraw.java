package com.example.zes.draganddraw;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DragAndDraw extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
