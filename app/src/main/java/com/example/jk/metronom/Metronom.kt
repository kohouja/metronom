package com.example.jk.metronom

import android.graphics.drawable.LayerDrawable
import android.graphics.drawable.LevelListDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.View.GONE
import android.widget.EditText
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_metronom.*
import kotlin.math.absoluteValue




class Metronom : AppCompatActivity() {

    private var started = false
    private var viewController: ViewController = ViewController()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metronom)

        while(started === true){
//            do metronome action
        }
        initListeners()


    }
    /**
     * listeners
     */
    fun initListeners(){
        time1Input.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
               if(!time1Input.text.isEmpty()){
                   val time1Value: Int? = time1Input.text.toString().toIntOrNull()
//                    Log.d("time1Value",time1Value?.toString()?:"")
                   Log.d("time1Value", ""+time1Value)
                   if (time1Value == 1){
                       noVisibility()
                   }
               }
            }
        })
    }
    fun noVisibility(){
        bl0.visibility = GONE
        bl1.visibility = GONE
    }

    fun increment(view: View){
        bpmInput.apply {
            setText(plus(bpmInput.text, 1))
        }

//        (imageView.drawable as LevelListDrawable).level = 0


    }

    fun decrement(view: View){
        bpmInput.apply {
            setText(plus(bpmInput.text, -1))
        }
//        (imageView.drawable as LevelListDrawable).level = 1
    }

    fun plus(text: Editable, number: Int) : String  {
        val bpmInputData : Int = text.toString().toInt() + number
        return bpmInputData.toString()

    }

    private fun initStarted(){
        this.started = started === false
    }

    fun buttonStartStop(view: View){
        initStarted()
        if(started === true){
              startButton.apply {
                setText("Stop")
              }
        }else{
            startButton.apply {
                setText("Start")
            }

        }
    }



}
