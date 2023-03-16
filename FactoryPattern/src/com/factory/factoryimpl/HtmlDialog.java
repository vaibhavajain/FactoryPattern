package com.factory.factoryimpl;

import com.factory.factory.Dialog;
import com.factory.product.Button;
import com.factory.productimpl.HtmlButton;

public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
