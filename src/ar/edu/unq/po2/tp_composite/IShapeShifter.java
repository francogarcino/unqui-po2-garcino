package ar.edu.unq.po2.tp_composite;

import java.util.List;

public interface IShapeShifter {

	public IShapeShifter compose(IShapeShifter ss);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
	
}
