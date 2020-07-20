package com.bignerdranch.android.criminalintent

import android.content.Context
import java.util.*
import kotlin.collections.ArrayList

class CrimeLab {

    companion object{
        private lateinit var sCrimeLab : CrimeLab
        private lateinit var mCrimes : MutableList<Crime>

        fun get(context: Context):CrimeLab{
            if (sCrimeLab == null){
                sCrimeLab = CrimeLab(context)
            }

            return sCrimeLab
        }

        private fun CrimeLab(context: Context) : CrimeLab {
            mCrimes = ArrayList<Crime>()
            for (i in 0..100){
                val crime : Crime = Crime()
                crime.mTitle = "Crime# $i"
                crime.mSolved = i.rem(2) == 0
                mCrimes.add(crime)
            }

            return sCrimeLab //that is wrong
        }

        fun getCrimes():List<Crime>{
            return mCrimes
        }

        fun getCrime(id : UUID): Crime? {
            for (crime in mCrimes){
                if(crime.mId == id){
                    return crime
                }
            }
            return null
        }
    }

}