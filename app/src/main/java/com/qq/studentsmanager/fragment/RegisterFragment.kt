package com.qq.studentsmanager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qq.studentsmanager.R
import com.qq.studentsmanager.base.BaseFragment


/**
 * Author: kideng
 * Date: 2024/7/13
 * Description: 注册界面
 */
class RegisterFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_register
    }

    override fun initView(view: View?) {

    }

    override fun initData() {
    }

    override fun getSelf(): Fragment {
        return RegisterFragment()
    }

}