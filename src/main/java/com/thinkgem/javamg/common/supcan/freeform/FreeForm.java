/**
 * 
 */
package com.thinkgem.javamg.common.supcan.freeform;

import com.thinkgem.javamg.common.supcan.common.Common;
import com.thinkgem.javamg.common.supcan.common.properties.Properties;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 硕正FreeForm
 * 
 * @version 2013-11-04
 */
@XStreamAlias("FreeForm")
public class FreeForm extends Common {

	public FreeForm() {
		super();
	}
	
	public FreeForm(Properties properties) {
		this();
		this.properties = properties;
	}
	
}
