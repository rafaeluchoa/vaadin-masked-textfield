package org.vaadin.addons.maskedtextfield;

import java.util.Locale;

import com.vaadin.data.util.converter.AbstractStringToNumberConverter;

public class DefaultStringToNumberConverter extends AbstractStringToNumberConverter<Number> {
	
	private static final long serialVersionUID = 1L;

	@Override
    public Number convertToModel(String value, Class<? extends Number> targetType,
            Locale locale) throws ConversionException {
        return super.convertToNumber(value, targetType, locale);
    }
	
	@Override
    public Class<Number> getModelType() {
        return Number.class;
    }

}
