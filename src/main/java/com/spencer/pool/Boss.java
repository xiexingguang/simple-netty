package com.spencer.pool;

import java.nio.channels.ServerSocketChannel;
/**
 * boss接口
 * @author spencer
 *
 */
public interface Boss {
	
	/**
	 * 加入一个新的ServerSocket
	 * @param serverChannel
	 */
	public void registerAcceptChannelTask(ServerSocketChannel serverChannel);
}
