/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [05/06/2016, 22:45:05 (GMT)]
 */
package vazkii.quark.base.network.message;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import vazkii.quark.base.network.Message;
import vazkii.quark.management.feature.StoreToChests;

public class MessageDisableDropoffClient extends Message {

	@Override
	public IMessage handleMessage(MessageContext context) {
		StoreToChests.clientDisabled = true;
		return null;
	}
	
}
