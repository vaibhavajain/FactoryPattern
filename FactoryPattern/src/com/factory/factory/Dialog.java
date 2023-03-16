package com.factory.factory;

import com.factory.product.Button;

public abstract class Dialog {
	public void renderWindow() {
		Button okButton = createButton();
		okButton.render();
	}

	public abstract Button createButton();
}
