package com.diegodobelo.myresearch

import android.content.Context
import net.sqlcipher.database.SQLiteDatabase
import org.researchstack.backbone.storage.database.sqlite.SqlCipherDatabaseHelper
import org.researchstack.backbone.storage.database.sqlite.UpdatablePassphraseProvider

class MyEncryptedDatabase(context: Context?,
                          name: String,
                          cursorFactory: SQLiteDatabase.CursorFactory?,
                          version: Int,
                          passphraseProvider: UpdatablePassphraseProvider):
        SqlCipherDatabaseHelper(context, name, cursorFactory, version, passphraseProvider) {
    var context: Context = context!!
}