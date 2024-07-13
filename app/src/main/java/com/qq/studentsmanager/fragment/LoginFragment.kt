package com.qq.studentsmanager.fragment

import android.view.View
import androidx.fragment.app.Fragment
import com.qq.studentsmanager.R
import com.qq.studentsmanager.base.BaseFragment


/**
 * Author: kideng
 * Date: 2024/7/13
 * Description: 注册界面
 */
class LoginFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_login
    }

    override fun initView(view: View?) {

    }

    override fun initData() {
    }

    override fun getSelf(): Fragment {
        return LoginFragment()
    }



}