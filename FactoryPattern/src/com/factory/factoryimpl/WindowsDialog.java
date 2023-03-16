package com.factory.factoryimpl;

import com.factory.factory.Dialog;
import com.factory.product.Button;
import com.factory.productimpl.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
