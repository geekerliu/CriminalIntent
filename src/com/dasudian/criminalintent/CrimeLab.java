package com.dasudian.criminalintent;

import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;

public class CrimeLab {
	private ArrayList<Crime> mCrimes;
	// 前缀s表示是一个静态变量
	private static CrimeLab sCrimeLab;
	private Context mAppContext;
	
	private CrimeLab(Context appContext) {
		mAppContext = appContext;
		mCrimes = new ArrayList<Crime>();
	}

	public static CrimeLab get(Context c) {
		if (sCrimeLab == null) {
			// 为保证单例总是有Context可以使用,可调用getApplicationContext()方法,将
			// 不确定是否存在的Context替换成application context。
			sCrimeLab = new CrimeLab(c.getApplicationContext());
		}
		return sCrimeLab;
	}
	
	public void addCrime(Crime c) {
		mCrimes.add(c);
	}

	public ArrayList<Crime> getCrimes() {
		return mCrimes;
	}
	
	public Crime getCrime(UUID id) {
		for (Crime c : mCrimes) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
}
