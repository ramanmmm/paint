package com.example.paint
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paint.PaintView.Companion.colorList
import com.example.paint.PaintView.Companion.currentBrush
import com.example.paint.PaintView.Companion.pathList

//ye bala asli paint h
class MainActivity : AppCompatActivity() {
    companion object{
        var path= Path()
        var paintBrush= Paint()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val redBtn=findViewById<ImageButton>(R.id.redColor)
        val blueBtn=findViewById<ImageButton>(R.id.blueColor)
        val blackBtn=findViewById<ImageButton>(R.id.blackColor)
        val whiteBtn=findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener {
            Toast.makeText(this,"Red Picked", Toast.LENGTH_LONG).show()
            paintBrush.color=android.graphics.Color.RED
            currentColor(paintBrush.color)

        }
        blueBtn.setOnClickListener {
            Toast.makeText(this,"Blue Picked", Toast.LENGTH_LONG).show()
            paintBrush.color=android.graphics.Color.BLUE
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener {
            Toast.makeText(this,"Black Picked", Toast.LENGTH_LONG).show()
            paintBrush.color=android.graphics.Color.BLACK
            currentColor(paintBrush.color)
        }
        whiteBtn.setOnClickListener {
            Toast.makeText(this,"Eraser", Toast.LENGTH_LONG).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
    private fun currentColor(color:Int){
        currentBrush=color
        path= Path()
    }
}