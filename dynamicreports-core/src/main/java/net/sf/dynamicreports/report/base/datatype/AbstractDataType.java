/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 - 2012 Ricardo Mariaca
 * http://dynamicreports.sourceforge.net
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.dynamicreports.report.base.datatype;

import java.util.Locale;

import net.sf.dynamicreports.report.ReportUtils;
import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.definition.DRIValue;
import net.sf.dynamicreports.report.definition.ReportParameters;
import net.sf.dynamicreports.report.definition.datatype.DRIDataType;
import net.sf.dynamicreports.report.definition.expression.DRIValueFormatter;
import net.sf.dynamicreports.report.exception.DRException;

/**
 * @author Ricardo Mariaca (dynamicreports@gmail.com)
 */
public abstract class AbstractDataType<U, T extends U> implements DRIDataType<U, T> {
	private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;

	@Override
	public String getPattern() {
		return null;
	}

	@Override
	public DRIValueFormatter<?, ? extends U> getValueFormatter() {
		return null;
	}

	@Override
	public HorizontalAlignment getHorizontalAlignment() {
		return null;
	}

	@Override
	public String valueToString(U value, Locale locale) {
		if (value != null) {
			return value.toString();
		}
		return null;
	}

	@Override
	public String valueToString(DRIValue<? extends U> value, ReportParameters reportParameters) {
		return valueToString(reportParameters.getValue(value), reportParameters.getLocale());
	}

	@Override
	@SuppressWarnings("unchecked")
	public String valueToString(String name, ReportParameters reportParameters) {
		return valueToString((U) reportParameters.getValue(name), reportParameters.getLocale());
	}

	@Override
	public T stringToValue(String value, Locale locale) throws DRException {
		return null;
	}

	@Override
	public T stringToValue(DRIValue<String> value, ReportParameters reportParameters) throws DRException {
		return stringToValue(reportParameters.getValue(value), reportParameters.getLocale());
	}

	@Override
	public T stringToValue(String name, ReportParameters reportParameters) throws DRException {
		return stringToValue((String) reportParameters.getValue(name), reportParameters.getLocale());
	}

	@Override
	@SuppressWarnings("unchecked")
	public Class<T> getValueClass() {
		return (Class<T>) ReportUtils.getGenericClass(this, 1);
	}
}
