package com.rwtema.tinkertailor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public interface ICallableClient {
	@SideOnly(Side.CLIENT)
	public void run();
}
