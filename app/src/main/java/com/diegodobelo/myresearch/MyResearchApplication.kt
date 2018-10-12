package com.diegodobelo.myresearch

import android.app.Application
import org.researchstack.skin.ResearchStack

class MyResearchApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        ResearchStack.init(this, MyResearchStack())
    }
}
