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

package net.sf.dynamicreports.design.base.chart.plot;

import net.sf.dynamicreports.design.definition.chart.plot.DRIDesignBarPlot;

/**
 * @author Ricardo Mariaca (dynamicreports@gmail.com)
 */
public class DRDesignBarPlot extends DRDesignAxisPlot implements DRIDesignBarPlot {
	private Boolean showTickMarks;
	private Boolean showTickLabels;
	private Boolean showLabels;

	public void setShowLabels(Boolean showLabels) {
		this.showLabels = showLabels;
	}

	@Override
	public Boolean getShowLabels() {
		return showLabels;
	}

	public void setShowTickLabels(Boolean showTickLabels) {
		this.showTickLabels = showTickLabels;
	}

	@Override
	public Boolean getShowTickLabels() {
		return showTickLabels;
	}

	public void setShowTickMarks(Boolean showTickMarks) {
		this.showTickMarks = showTickMarks;
	}

	@Override
	public Boolean getShowTickMarks() {
		return showTickMarks;
	}
}
