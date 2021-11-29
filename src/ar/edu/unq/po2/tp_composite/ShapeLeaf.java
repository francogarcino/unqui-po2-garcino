package ar.edu.unq.po2.tp_composite;

import java.util.ArrayList;
import java.util.List;

public class ShapeLeaf implements IShapeShifter {

	private int value;
	
	public ShapeLeaf(int explicitValue) {
		this.value = explicitValue;
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter ss) {
		ShapeComposite newSS = new ShapeComposite();
		newSS.addShape(this);
		newSS.addShape(ss);
		
		return newSS;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(this.value);
		
		return list;
	}

}
