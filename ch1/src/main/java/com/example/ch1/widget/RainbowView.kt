package com.example.ch1.widget

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class RainbowView : View{

    lateinit var mPaint : Paint
    var mPaintWidth : Int = 0
    var mPaintHeight: Int = 0

    constructor(context: Context) : super(context) {
        initParams()
    }

    constructor(context: Context, attrs : AttributeSet) : super(context, attrs) {
        initParams()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initParams()
    }

    fun initParams() {
        this.mPaint = Paint()
        this.mPaint.color = Color.RED
        this.mPaint.strokeWidth = 10f
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        var widthMode = MeasureSpec.getMode(widthMeasureSpec)
        var heightMode = MeasureSpec.getMode(heightMeasureSpec)

        if (widthMode == MeasureSpec.AT_MOST) {
            mPaintWidth = MeasureSpec.getSize(widthMeasureSpec)
        } else {
            mPaintWidth = MeasureSpec.getSize(widthMeasureSpec)
        }

        mPaintHeight = MeasureSpec.getSize(heightMeasureSpec)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas?.drawCircle(mPaintWidth / 2f, mPaintHeight / 2f, 100f, mPaint)
    }

}