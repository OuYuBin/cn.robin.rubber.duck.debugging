package cn.robin.rubber.duck.debugging.views;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import cn.robin.rubber.duck.debugging.Activator;

/**
 * 
 * @author robin
 *
 */
public class RubberDuckDebuggingViewPart extends ViewPart {

	public static final String ID = "cn.robin.rubber.duck.debugging.views.RubberDuckDebuggingView";

	public RubberDuckDebuggingViewPart() {
	}

	public void createPartControl(Composite parent) {
		ImageDescriptor imageDescriptor = Activator.getImageDescriptor("/icons/duck.png");
		parent.setBackgroundImage(imageDescriptor.createImage());
	}

	public void setFocus() {
	}
}
