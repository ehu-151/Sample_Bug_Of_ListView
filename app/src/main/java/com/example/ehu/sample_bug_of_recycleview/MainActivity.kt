package com.example.ehu.sample_bug_of_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.ehu.sample_bug_of_recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        //fragmentの表示
        val manager=supportFragmentManager
        val transition=manager.beginTransaction()
        transition.replace(binding.container.id,ListViewFragment())
        transition.commit()
    }
}
