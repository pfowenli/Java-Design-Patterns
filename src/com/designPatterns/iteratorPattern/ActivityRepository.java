package com.designPatterns.iteratorPattern;

public class ActivityRepository implements Container {
	
	private String[] activities = new String[]{"rock climbing", "bungee jumping", "dancing", "surfing"};
	
	@Override
	public Iterator getIterator() {
		return new ActivityIterator();
	}
	
	private class ActivityIterator implements Iterator {
		
		private int index;
		
		@Override
		public boolean hasNext() {
			if(index < activities.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(hasNext()) {
				return activities[index++];
			}
			return null;
		}
		
		
	}

}
