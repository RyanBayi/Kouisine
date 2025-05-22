package com.kouisine

import android.os.Bundle
import com.facebook.react.ReactActivity
import android.os.Build
import android.view.WindowManager

class MainActivity : ReactActivity() {
    override fun getMainComponentName(): String {
        return "Kouisine" // ← vérifie que ce nom correspond exactement à celui dans AppRegistry.registerComponent
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(null) // ← requis pour React Navigation (surtout les gestions de transitions modales)
    }
}
