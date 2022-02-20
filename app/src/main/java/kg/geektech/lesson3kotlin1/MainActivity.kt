package kg.geektech.lesson3kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kg.geektech.lesson3kotlin1.base.BaseActivity
import kg.geektech.lesson3kotlin1.base.BaseViewModel
import kg.geektech.lesson3kotlin1.databinding.ActivityMainBinding

class MainActivity : BaseActivity<BaseViewModel,ActivityMainBinding>() {

    override fun inflateViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }


}