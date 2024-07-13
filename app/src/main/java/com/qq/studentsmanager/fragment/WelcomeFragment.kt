package com.qq.studentsmanager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.navigation.NavOptions
import androidx.navigation.Navigator
import androidx.navigation.fragment.NavHostFragment
import com.qq.studentsmanager.R
import com.qq.studentsmanager.base.BaseFragment
import com.qq.studentsmanager.utils.BitmapUtils

/**
 * Author: kideng
 * Date: 2024/7/13
 * Description: 欢迎界面
 */
class WelcomeFragment : BaseFragment() {

    private lateinit var loginButton: Button
    private lateinit var welcomeFl: FrameLayout

    override fun getLayoutId(): Int {
        return R.layout.fragment_welcome
    }

    override fun initView(view: View?) {
        if (view != null) {
            loginButton = view.findViewById(R.id.btn_login)
            welcomeFl = view.findViewById(R.id.fl_welcome)
        }
        BitmapUtils.readBitmap(mContext, R.drawable.background_image);
        loginButton.setOnClickListener {
            val navOptions = NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_left)
                .setExitAnim(R.anim.slide_out_right)
                .setPopEnterAnim(R.anim.slide_in_right)
                .setPopExitAnim(R.anim.slide_out_left)
                .build()
            val bundle = Bundle()
            bundle.putString("name", "Kid")
            NavHostFragment.findNavController(this).navigate(R.id.loginFragment, bundle, navOptions)
        }
    }

    override fun initData() {

    }

    override fun getSelf(): Fragment {
        return WelcomeFragment()
    }
}