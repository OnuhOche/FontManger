package ir.rainday.fontexample.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import ir.rainday.fontexample.FontManager


abstract class BaseActivity : AppCompatActivity(){

    override fun attachBaseContext(newBase: Context) {
      super.attachBaseContext(FontManager.wrapContext(newBase))
    }

}
