package org.xtext.example.xpt.converter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

//TODO inutile!

public class XptValueConverter extends DefaultTerminalConverters{
	@ValueConverter(rule = "Values")
    public IValueConverter<List<Object>> Values() {
        return new IValueConverter<List<Object>>() {
        	
			@Override
			public List<Object> toValue(String string, INode node) throws ValueConverterException {
				List<Object> list = new ArrayList<>();
				String text = string.replace('[', ' ');
				text.replace(']', ' ');
				text.trim();
				List<String> segments = Strings.split(text, ',');
				for(String elem : segments){
					try {
						list.add(Double.parseDouble(elem));
					} catch (ClassCastException e) {
						list.add(elem);
					} catch (Exception e) {
						throw new ValueConverterException("Couldn't convert string", node, e);
					}
				}
				return list;
			}

			@Override
			public String toString(List<Object> value) throws ValueConverterException {
				return value.toString();
			}
        };
	}
}