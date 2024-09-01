package com.mhdarslan.contactapp.Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserData(var contactsProfile: Int, var contactName: String, val contactNumber: String) : Parcelable
