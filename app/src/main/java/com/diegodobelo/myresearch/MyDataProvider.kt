package com.diegodobelo.myresearch

import android.content.Context
import org.researchstack.backbone.result.TaskResult
import org.researchstack.backbone.task.Task
import org.researchstack.skin.DataProvider
import org.researchstack.skin.DataResponse
import org.researchstack.skin.model.SchedulesAndTasksModel
import org.researchstack.skin.model.User
import rx.Observable

class MyDataProvider: DataProvider() {
    override fun signOut(context: Context?): Observable<DataResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun signIn(context: Context?, username: String?, password: String?): Observable<DataResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveConsent(context: Context?, consentResult: TaskResult?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun uploadTaskResult(context: Context?, taskResult: TaskResult?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun processInitialTaskResult(context: Context?, taskResult: TaskResult?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun signUp(context: Context?, email: String?, username: String?, password: String?): Observable<DataResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun resendEmailVerification(context: Context?, email: String?): Observable<DataResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun uploadConsent(context: Context?, consentResult: TaskResult?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun withdrawConsent(context: Context?, reason: String?): Observable<DataResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setUserSharingScope(context: Context?, scope: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isSignedUp(context: Context?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUserSharingScope(context: Context?): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadTasksAndSchedules(context: Context?): SchedulesAndTasksModel {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isConsented(context: Context?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadTask(context: Context?, task: SchedulesAndTasksModel.TaskScheduleModel?): Task {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUser(context: Context?): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun forgotPassword(context: Context?, email: String?): Observable<DataResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initialize(context: Context?): Observable<DataResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUserEmail(context: Context?): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isSignedIn(context: Context?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}