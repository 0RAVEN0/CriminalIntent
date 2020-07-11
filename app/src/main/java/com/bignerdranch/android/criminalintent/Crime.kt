package com.bignerdranch.android.criminalintent

import java.util.*

class Crime {

    var mId : UUID = TODO()
        get() {
            return mId
        }
    var mTitle : String
        get() {
            return mTitle
        }
        set(title : String) {
            mTitle = title
        }
    var mDate : Date
        get() {
            return mDate
        }
        set(date : Date) {
            mDate = date
        }
    var mSolved : Boolean
        get() {
            return mSolved
        }
        set(solved : Boolean) {
            mSolved = solved
        }

    init {
        mId = UUID.randomUUID()
        mDate = Date()
    }

}