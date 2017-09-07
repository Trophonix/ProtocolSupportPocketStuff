package protocolsupportpocketstuff.api.modals.elements.complex;

import protocolsupportpocketstuff.api.modals.elements.ComplexElementType;

import java.util.ArrayList;
import java.util.List;

public class ModalDropdown extends ModalComplexUIElement {
	private List<String> options = new ArrayList<String>();
	private int defaultOptionIndex;

	public ModalDropdown() {
		super(ComplexElementType.DROPDOWN);
	}

	public ModalDropdown setText(String text) {
		super.setText(text);
		return this;
	}

	public ModalDropdown addOption(String optionText) {
		return addOption(optionText, false);
	}

	public ModalDropdown addOption(String optionText, boolean isDefault) {
		if (isDefault) {
			defaultOptionIndex = options.size();
		}
		options.add(optionText);
		return this;
	}

	public ModalDropdown setDefaultOptionIndex(int defaultOptionIndex) {
		this.defaultOptionIndex = defaultOptionIndex;
		return this;
	}

	public List<String> getOptions() {
		return options;
	}

	public ModalDropdown setOptions(List<String> options) {
		this.options = options;
		return this;
	}
}
