package ir.rainday.fontexample.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.fontmanager.R
import ir.rainday.fontexample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnWeight.setOnClickListener {
            startActivity(Intent(this, FontWeightActivity::class.java))
        }

        btnTypography.setOnClickListener {
            startActivity(Intent(this, TypographyActivity::class.java))
        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item?.itemId== R.id.action_settings)
            startActivity(Intent(this, SettingActivity::class.java))

        return super.onOptionsItemSelected(item)
    }
}
