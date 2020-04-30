package edu.bo.examenmobile304

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View.GONE
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        save_user_button.setOnClickListener {
            progress_bar.visibility = VISIBLE;
            var r = Runnable {
                progress_bar.visibility = GONE;
            }
            Handler().postDelayed(r, 2000)
        }
    }
}
