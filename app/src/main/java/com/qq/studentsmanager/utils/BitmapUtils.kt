package com.qq.studentsmanager.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Rect

object BitmapUtils {


    fun readBitmap(context: Context, resId: Int): Bitmap? {

        val opt = BitmapFactory.Options()
        opt.inPreferredConfig = Bitmap.Config.RGB_565
        opt.inPurgeable = true
        opt.inInputShareable = true
        //获取资源图片
        val inputStream = context.resources.openRawResource(resId)
        return BitmapFactory.decodeStream(inputStream, Rect(), opt)

    }


}