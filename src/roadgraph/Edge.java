package roadgraph;

import geography.GeographicPoint;

public class Edge {
	private String roadName;
	private String roadType;
	private double length;
	private GeographicPoint location;
	
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
	public GeographicPoint getLocation() {
		return location;
	}
	public void setLocation(GeographicPoint location) {
		this.location = location;
	}
	


}
