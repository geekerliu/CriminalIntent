package com.dasudian.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

	private UUID mId;
	private String mTitle;
	private Date mDate;
	private boolean mSolved;

	public Crime() {
		mId = UUID.randomUUID();
		mDate = new Date();
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String pTitle) {
		mTitle = pTitle;
	}

	public UUID getId() {
		return mId;
	}

	public Date getDate() {
		return mDate;
	}

	public void setDate(Date pDate) {
		mDate = pDate;
	}

	public boolean isSolved() {
		return mSolved;
	}

	public void setSolved(boolean pSolved) {
		mSolved = pSolved;
	}

	@Override
	public String toString() {
		return mTitle;
	}
}
