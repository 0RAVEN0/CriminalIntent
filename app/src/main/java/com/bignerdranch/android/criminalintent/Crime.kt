package com.bignerdranch.android.criminalintent

import java.util.*

class Crime {

    var mId : UUID = UUID.randomUUID()

    var mTitle : String
        get() {
            return mTitle
        }
        set(title) {
            mTitle = title
        }

    var mDate : Date = Date()

    var mSolved : Boolean
        get() {
            return mSolved
        }
        set(solved) {
            mSolved = solved
        }

}