package com.diegodobelo.myresearch

import android.app.Activity
import android.content.Context
import android.content.Intent
import org.researchstack.skin.PermissionRequestManager

class MyPermissionRequestManager: PermissionRequestManager() {
    override fun onNonSystemPermissionResult(activity: Activity?, requestCode: Int, resultCode: Int, data: Intent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hasPermission(context: Context?, permissionId: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRequestNonSystemPermission(activity: Activity?, id: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}