package com.dasudian.criminalintent;

import java.util.Date;
import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;

public class Crime {
	private static final String JSON_ID = "id";
	private static final String JSON_TITLE = "title";
	private static final String JSON_SOLVED = "solved";
	private static final String JSON_DATE = "date";
	
	private UUID mId;
	private String mTitle;
	private Date mDate;
	private boolean mSolved;

	public Crime() {
		mId = UUID.randomUUID();
		mDate = new Date();
	}
	
	public Crime(JSONObject json) throws JSONException {
		mId = UUID.fromString(json.getString(JSON_ID));
		if (json.has(JSON_TITLE)) {
			mTitle = json.getString(JSON_TITLE);
		}
		mSolved = json.getBoolean(JSON_SOLVED);
		mDate = new Date(json.getLong(JSON_DATE));
	}
	
	public JSONObject toJSON() throws JSONException {
		JSONObject json = new JSONObject();
		json.put(JSON_ID, mId.toString());
		json.put(JSON_TITLE, mTitle);
		json.put(JSON_SOLVED, mSolved);
		json.put(JSON_DATE, mDate.getTime());
		return json;
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
