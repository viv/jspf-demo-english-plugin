package uk.me.viv.test.talker.impl;

import net.xeoh.plugins.base.annotations.PluginImplementation;
import uk.me.viv.test.talker.Greeter;

@PluginImplementation
public class EnglishImpl implements Greeter {

	@Override
	public String sayHello() {
		return "Hello";
	}
}
