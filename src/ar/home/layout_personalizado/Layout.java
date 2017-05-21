package ar.home.layout_personalizado;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

public class Layout implements LayoutManager {

	public void addLayoutComponent(String arg0, Component arg1) {
		
	}

	public void layoutContainer(Container l) {
		
		int x=10,y=10,contador=0,n=l.getComponentCount();
		
		for (int i=0;i<n;i++){
			
			contador++;
			
			l.getComponent(i).setBounds(x, y, 100, 20);
			
			x+=75;
			
			if (contador%2==0){
			
				x=10;
				y+=30;
				
			}
		}
		
		
	}

	public Dimension minimumLayoutSize(Container arg0) {
		return null;
	}

	public Dimension preferredLayoutSize(Container arg0) {
		return null;
	}

	public void removeLayoutComponent(Component arg0) {
		
	}

}
