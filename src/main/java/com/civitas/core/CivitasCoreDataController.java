package com.civitas.core;

public class CivitasCoreDataController 
{
	private static CivitasCoreDataController mInstance;
	
	private CivitasCoreDataController()
	{
		
	}
	
	public static CivitasCoreDataController getInstance()
	{
		if (mInstance == null)
		{
			mInstance = new CivitasCoreDataController();
		}
		return mInstance;
	}
}
