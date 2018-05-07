package com.civitas.core;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.storage.MapStorage;

public class CivitasWorldSaveData extends WorldSavedData 
{

	public CivitasWorldSaveData() {
		super("Civitas_World_Data");
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		// TODO Auto-generated method stub
		NBTTagCompound test = new NBTTagCompound();
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		
		return null;
	}
	
	public static CivitasWorldSaveData get(World world)
	{
		MapStorage storage = world.getMapStorage();
		CivitasWorldSaveData instance = (CivitasWorldSaveData) storage.getOrLoadData(CivitasWorldSaveData.class, "Civitas_World_Data");
		
		if (instance == null)
		{
			instance = new CivitasWorldSaveData();
			storage.setData("Civitas_World_Data", instance);
		}
		
		
		return instance;
	}
}
