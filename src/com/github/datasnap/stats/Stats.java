package com.github.datasnap.stats;

import java.util.concurrent.ConcurrentHashMap;

public class Stats extends ConcurrentHashMap<String, Stat> {

	private static final long serialVersionUID = -8837006750327885446L;
	
	public Stat ensure(String key) {
		if (this.containsKey(key)) return this.get(key);

		Stat stat = new Stat();
		this.put(key, stat);
		return stat;
	}
	
	public void update(String operation, double val) {
		if (!this.containsKey(operation)) {
			this.putIfAbsent(operation, new Stat());
		}
		
		this.get(operation).update(val);
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("\n-------- Safe Client Stats --------\n");
		
		for (Entry<String, Stat> entry : entrySet()) {
			
			String operation = entry.getKey();
			Stat stat = entry.getValue();
			
			builder.append(String.format("%s : %s\n", operation, stat.toString()));
		}
		
		builder.append("----------------------------------------\n");
		
		return builder.toString();
	}
	
}
