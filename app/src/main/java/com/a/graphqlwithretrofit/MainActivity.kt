package com.a.graphqlwithretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        post("Madrid")
    }

    private fun post(city: String){
        val retrofit = GraphQLInstance.graphQLService
        val paramObject = JSONObject()
        paramObject.put("query", "query {getCityByName(name: \"$city\") {id,name,country,coord {lon,lat}}}")
        GlobalScope.launch {
            try {
                val response = retrofit.postDynamicQuery(paramObject.toString())
                Log.e("response", response.body().toString())
            }catch (e: java.lang.Exception){
                e.printStackTrace()
            }
        }
    }
}
