package com.example.composedemo

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.time.format.TextStyle


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun lazyColumn(){
    data class Item(val id: Int, val text: String)
    val items = List(10) {Item (1, "sheshu")}

    LazyColumn {
        items(items){item->
           // Text(text =item.text)
            Text(text = "${item.id}")
        }
    }
//    val mylist= listOf<String>("megha","mohan","kasim","Ram","bhavaniii","kalyan")
//
//    LazyColumn{
//        item { Text(text = "Sheshu") }
//
//        items( 4){index->
//            Text(text = "Items are: $index")
//        }
//        items(mylist){list->
//            Text(text = "$list")
//
//        }
//    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview
fun preview(){
lazyColumn()
}