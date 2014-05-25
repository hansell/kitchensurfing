package com.kitchensurfing.config.util;

import java.util.ArrayList;
import java.util.List;

public class SystemCache {

	public static List<String> toBeActiveUser = new ArrayList<String>();

	// 检测是否包含激活key
	public static boolean containUser(String key) {
		return toBeActiveUser.contains(key);
	}

	//删除激活key
	public static synchronized void removeKey(String key) {
		toBeActiveUser.remove(key);
	}
	//添加激活key
	public static void  addKey(String key)
	{
		toBeActiveUser.add(key);
	}

}
