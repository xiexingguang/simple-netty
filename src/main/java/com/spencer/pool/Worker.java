package com.spencer.pool;

import java.nio.channels.SocketChannel;
/**
 * worker接口
 * @author spencer
 *
 */
public interface Worker {
	
	/**
	 * 加入一个新的客户端会话
	 * @param channel
	 */
	public void registerNewChannelTask(SocketChannel channel);

}
