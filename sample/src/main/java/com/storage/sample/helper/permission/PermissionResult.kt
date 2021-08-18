package com.storage.sample.helper.permission

/**
 * Created on 12/13/20
 * @author Anggrayudi H
 */
class PermissionResult(val permissions: List<PermissionReport>) {

    val areAllPermissionsGranted: Boolean
        get() = permissions.all { it.isGranted }
}