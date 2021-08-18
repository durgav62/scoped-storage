package com.storage.sample.helper.callback

import android.content.Intent
import androidx.documentfile.provider.DocumentFile
import com.storage.sample.helper.file.DocumentFileCompat
import com.storage.sample.helper.file.StorageType

/**
 * Created on 17/08/20
 * @author Anggrayudi H
 */
interface FolderPickerCallback {

    fun onCanceledByUser(requestCode: Int) {
        // default implementation
    }

    fun onActivityHandlerNotFound(requestCode: Int, intent: Intent) {
        // default implementation
    }

    fun onStoragePermissionDenied(requestCode: Int)

    /**
     * Called when storage permissions are granted, but [DocumentFileCompat.isStorageUriPermissionGranted] returns `false`
     *
     * @param folder selected folder that has no read and write permission
     * @param storageType `null` if `folder`'s authority is not [DocumentFileCompat.EXTERNAL_STORAGE_AUTHORITY]
     */
    fun onStorageAccessDenied(requestCode: Int, folder: DocumentFile?, storageType: StorageType)

    fun onFolderSelected(requestCode: Int, folder: DocumentFile)
}