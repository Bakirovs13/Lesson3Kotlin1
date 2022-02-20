package kg.geektech.lesson3kotlin1.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract  class BaseActivity<VM:BaseViewModel,VB: ViewBinding> : AppCompatActivity() {

    protected lateinit var binding:VB

    protected lateinit var viewModel:VM

    protected abstract fun inflateViewBinding(inflater: LayoutInflater):VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBinding(layoutInflater)
        setContentView(binding.root)

        checkInternet()
        initViewModel()
        initView()
        initListener()
    }

    open fun initView(){}
    open fun initListener(){}
    open fun initViewModel(){}
    open fun checkInternet(){}

}