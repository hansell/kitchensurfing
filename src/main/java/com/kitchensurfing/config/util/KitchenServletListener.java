package com.kitchensurfing.config.util;

import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;

/**
 * 容器监听器(主要在容器启动时执行一些定时任务,例如动态刷新待激活用户缓存)
 * 
 * @author lsj(李三杰)
 * 
 */
public class KitchenServletListener implements ServletContextListener {

	private Timer timer = new Timer();

	// 每隔30分钟检验一次
	public static final long PERIOD = 1000 * 60 * 30;

	public static final Log log = LogFactory
			.getLog(KitchenServletListener.class);

	private class CheckActiveTimeOver extends TimerTask {

		@Override
		public void run() {

			List<String> toBeActiveUser = SystemCache.toBeActiveUser;

			String[] items;

			long createTime;

			long distance;
			try {
				for (String key : toBeActiveUser) {
					key = new String(
							com.sun.org.apache.xml.internal.security.utils.Base64
									.decode(key.getBytes()));
					items = key.split("&");

					createTime = Long.parseLong(items[3]);

					distance = System.currentTimeMillis() - createTime;

					if (distance >= PERIOD) {
						toBeActiveUser.remove(key);
					}

				}

				log.debug("定时任务执行!!!!!");

			} catch (Base64DecodingException e) {
				e.printStackTrace();
				log.debug("异常=>" + e.getMessage());
			}

		}

	}

	public void contextDestroyed(ServletContextEvent arg0) {
		log.debug("容器销毁!!!");
	}

	public void contextInitialized(ServletContextEvent arg0) {

		log.debug("启动待激活用户定时缓存更新任务======!!");
		// 系统没三十分钟,清理一次待激活用户缓存
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, 30);
		timer.schedule(new CheckActiveTimeOver(), calendar.getTime(), PERIOD);

	}

}
