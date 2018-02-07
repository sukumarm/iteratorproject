package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PositiveIteratorInteger implements Iterator<Integer>{
	private Iterator<Integer> iter;
	private List<Integer> list = new ArrayList<>();
	private List<Integer> nextList = new ArrayList<>();
	private Integer lastRead;
	public PositiveIteratorInteger (Iterator<Integer> i) {
			this.iter = i;
			this.iter.forEachRemaining(this.list::add);
			
	}
	@Override
	public boolean hasNext () {
		boolean isValue = false;
		for(Integer value : list) {
			if(value !=null && value > 0) {
				isValue = true;
			}
			
		}
		return isValue;
	}
	@Override
	public Integer next () { 
		for(Integer value : this.list) {
			if(value !=null && value > 0) {	
				if(!nextList.contains(value)){
					nextList.add(value);
					return value;
				}
			}
		}
		return 0;
	}
	
	
//private Iterator<Integer> i;
//	
//	private Integer lastRead = null;
//
//	public PositiveIteratorInteger(Iterator<Integer> c) {
//		this.i = c;
//	}
//		
//	@Override
//	public boolean hasNext() {
//		while (i.hasNext()) {
//			Integer x = i.next();
//			if (x != null && x > 0) {
//				lastRead = x;
//				return true;
//			}
//		}
//		return false;
//	}
//
//	@Override
//	public Integer next() {
//		if (lastRead != null) {
//			//lastRead = null;
//			return lastRead;
//		}
//		while (true) {
//			Integer x = i.next();
//			if (x != null && x > 0) {
//				return x;
//			}
//		}
//	}
//
//	@Override
//	public void remove() {
//		throw new UnsupportedOperationException();
//	}
	
}
