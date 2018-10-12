package com.diegodobelo.myresearch

import android.content.Context
import org.researchstack.backbone.storage.database.AppDatabase
import org.researchstack.backbone.storage.database.sqlite.SqlCipherDatabaseHelper
import org.researchstack.backbone.storage.database.sqlite.UpdatablePassphraseProvider
import org.researchstack.backbone.storage.file.EncryptionProvider
import org.researchstack.backbone.storage.file.FileAccess
import org.researchstack.backbone.storage.file.PinCodeConfig
import org.researchstack.backbone.storage.file.SimpleFileAccess
import org.researchstack.backbone.storage.file.aes.AesProvider
import org.researchstack.skin.*
import org.researchstack.skin.notification.NotificationConfig

class MyResearchStack : ResearchStack() {
    override fun createDataProviderImplementation(context: Context?): DataProvider {
        return MyDataProvider()
    }

    override fun createUiManagerImplementation(context: Context?): UiManager {
        return MyUiManager()
    }

    override fun createNotificationConfigImplementation(context: Context?): NotificationConfig {
        return MyNotificationConfig()
    }

    override fun getEncryptionProvider(context: Context?): EncryptionProvider {
        return AesProvider()
    }

    override fun createResourceManagerImplementation(context: Context?): ResourceManager {
        return MyResourceManager()
    }

    override fun getPinCodeConfig(context: Context?): PinCodeConfig {
        val autoLockTime = (5 * 60 * 1000).toLong();
        return PinCodeConfig(autoLockTime)
    }

    override fun createPermissionRequestManagerImplementation(context: Context?): PermissionRequestManager {
        return MyPermissionRequestManager()
    }

    override fun createFileAccessImplementation(context: Context?): FileAccess {
        return SimpleFileAccess()
    }

    override fun createTaskProviderImplementation(context: Context?): TaskProvider {
        return MyTaskProvider()
    }

    override fun createAppDatabaseImplementation(context: Context?): AppDatabase {
        return MyEncryptedDatabase(context,
                SqlCipherDatabaseHelper.DEFAULT_NAME,
                null,
                SqlCipherDatabaseHelper.DEFAULT_VERSION,
                UpdatablePassphraseProvider())
    }

}