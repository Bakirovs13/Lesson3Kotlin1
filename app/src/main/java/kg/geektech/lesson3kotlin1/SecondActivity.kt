package kg.geektech.lesson3kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.inputmethod.EditorInfo
import kg.geektech.lesson3kotlin1.base.BaseActivity
import kg.geektech.lesson3kotlin1.base.BaseViewModel
import kg.geektech.lesson3kotlin1.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity<BaseViewModel,ActivitySecondBinding>() {

    private val list = arrayListOf<String>()


    override fun initListener() {
        super.initListener()

        binding.textEt.setOnEditorActionListener { textView, i, keyEvent ->
            if (i == EditorInfo.IME_ACTION_SEND){
                list.add(binding.textEt.text.toString())
                return@setOnEditorActionListener true
            }
            return@setOnEditorActionListener false
        }


        binding.doneBtn.setOnClickListener {
            binding.textTv.text =list.toString()
        }
    }

    override fun inflateViewBinding(inflater: LayoutInflater): ActivitySecondBinding {
        return  ActivitySecondBinding.inflate(inflater)
    }

}