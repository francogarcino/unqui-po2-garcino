package ar.edu.unq.po2.tp_composite;

import java.util.ArrayList;
import java.util.List;

public class ShapeComposite implements IShapeShifter{

	private List<IShapeShifter> components;
	
	public ShapeComposite() {
		this.components = new ArrayList<IShapeShifter>();
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
		int deep = 1;
		for (IShapeShifter iShapeShifter : components) {
			deep += iShapeShifter.deepest();
		}
		return deep;
	}

	@Override
	public IShapeShifter flat() {
		ShapeComposite newSS = new ShapeComposite();
		for (int value : this.values()) {
			newSS.compose(new ShapeLeaf(value));
		}
		
		return newSS;
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		for (IShapeShifter iShapeShifter : components) {
			values.addAll(iShapeShifter.values());
		}
		
		return values;
	}
	
	public void addShape(IShapeShifter ss) {
		this.components.add(ss);
	}

}
