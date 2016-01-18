package roadgraph;

import geography.GeographicPoint;

public class Edge {						//This class will store the information regarding the edge.
	private String roadName;			//Although its not useful in BFS but will be used in Dijkstra
	private String roadType;			// and A* probably to figure out the length.
	private double length;
	private GeographicPoint from;
	private GeographicPoint to;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getRoadType() {
		return roadType;
	}
	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public GeographicPoint getFrom() {
		return from;
	}
	public void setFrom(GeographicPoint from) {
		this.from = from;
	}
	public GeographicPoint getTo() {
		return to;
	}
	public void setTo(GeographicPoint to) {
		this.to = to;
	}
	


}
