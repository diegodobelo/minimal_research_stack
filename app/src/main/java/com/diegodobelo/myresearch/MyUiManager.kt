package com.diegodobelo.myresearch

import android.content.Context
import org.researchstack.backbone.result.StepResult
import org.researchstack.backbone.step.Step
import org.researchstack.skin.ActionItem
import org.researchstack.skin.UiManager

class MyUiManager : UiManager() {
    override fun getMainActionBarItems(): MutableList<ActionItem> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMainTabBarItems(): MutableList<ActionItem> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isInclusionCriteriaValid(result: StepResult<*>?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInclusionCriteriaStep(context: Context?): Step {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}