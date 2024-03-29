package geovista.matrix.map;

/**
 * <p>Title: MapAndScatterplotMatrixBeanInfo</p>
 * <p>Description: Bean Info for BiPlotMatrix</p>
 * <p>Copyright: Copyright (c) 2001</p>
 * <p>Company: GeoVISTA Center</p>
 * @author Xiping Dai
 * 
 */

import java.beans.BeanInfo;
import java.beans.SimpleBeanInfo;

public class MoranMapBeanInfo extends SimpleBeanInfo {
	Class beanClass = MoranMap.class;
	String iconColor16x16Filename = "resources/moranmap16.gif";
	String iconColor32x32Filename = "resources/moranmap32.gif";
	String iconMono16x16Filename;
	String iconMono32x32Filename;

	@Override
	public java.awt.Image getIcon(int iconKind) {
		switch (iconKind) {
		case BeanInfo.ICON_COLOR_16x16:
			return iconColor16x16Filename != null
					? loadImage(iconColor16x16Filename) : null;
		case BeanInfo.ICON_COLOR_32x32:
			return iconColor32x32Filename != null
					? loadImage(iconColor32x32Filename) : null;
		case BeanInfo.ICON_MONO_16x16:
			return iconMono16x16Filename != null
					? loadImage(iconMono16x16Filename) : null;
		case BeanInfo.ICON_MONO_32x32:
			return iconMono32x32Filename != null
					? loadImage(iconMono32x32Filename) : null;
		}
		return null;
	}

}