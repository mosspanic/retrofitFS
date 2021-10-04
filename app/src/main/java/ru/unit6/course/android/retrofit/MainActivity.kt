package ru.unit6.course.android.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit
import ru.unit6.course.android.retrofit.data.model.User
import ru.unit6.course.android.retrofit.ui.main.MainFragment
import ru.unit6.course.android.retrofit.data.api.ApiService
import ru.unit6.course.android.retrofit.data.database.AppDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
        AppDatabase.invoke(applicationContext)
    }
}