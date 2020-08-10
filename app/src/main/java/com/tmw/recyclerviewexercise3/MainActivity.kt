package com.tmw.recyclerviewexercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.tmw.recyclerviewexercise3.adapter.FourAdapter
import com.tmw.recyclerviewexercise3.adapter.ThreeAdapter
import com.tmw.recyclerviewexercise3.adapter.TwoAdapter
import com.tmw.recyclerviewexercise3.model.FourBlock
import com.tmw.recyclerviewexercise3.model.OneBlock
import com.tmw.recyclerviewexercise3.model.ThreeBlock
import com.tmw.recyclerviewexercise3.model.TwoBlock
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var twoList=ArrayList<TwoBlock>()

        twoList.add(TwoBlock(R.drawable.louisvuitton,"Hyde Park N41015","LOUIS VUITTON",R.drawable.fourstar,"999,99999 KS"))
        twoList.add(TwoBlock(R.drawable.shirt,"horns pink long sleeve t-shirt","Lady Gaga",R.drawable.fivestar,"72,000 KS"))
        twoList.add(TwoBlock(R.drawable.iphone,"Iphone","Apple",R.drawable.fourstar,"1,000,000 KS"))

        recycler1.apply{
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter=TwoAdapter(twoList)
        }

        var threeList=ArrayList<ThreeBlock>()

        threeList.add(ThreeBlock(R.drawable.japan,"Japan"))
        threeList.add(ThreeBlock(R.drawable.korea,"Korea"))
        threeList.add(ThreeBlock(R.drawable.china,"China"))
        threeList.add(ThreeBlock(R.drawable.worldmap,"International"))

        recycler2.apply{
            layoutManager=GridLayoutManager(context,2)
            adapter= ThreeAdapter(threeList)
        }

        var fourList=ArrayList<FourBlock>()

        fourList.add(FourBlock("New","30% off","Iphone 8 Plus","","Apple",R.drawable.fourstar,"980,000 KS","110,000 KS",R.drawable.iphone8plus))
        fourList.add(FourBlock("New","34% off","Ghost Bed 11 Inch","Cooling Gel Memory Foam......","Ghost Bed",R.drawable.fourstar,"325,000 KS","495,000 KS",R.drawable.bed))
        fourList.add(FourBlock("","","Nintendo Switch:Neon Blue","and Red Joy-Con","Nintendo",R.drawable.fourstar,"359,000 KS","",R.drawable.game))
        fourList.add(FourBlock("New","","Belaroi Woman Comfy"," Swing Tunic Short","Belaroi",R.drawable.fourstar,"18,990 KS","",R.drawable.pajamas))


        recycler3.apply {
            layoutManager=LinearLayoutManager(context)
            adapter=FourAdapter(fourList)
        }

    }
}