package com.vs.jtomtomclient.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Place {
	
	private String id;
	private String type;
	private Double score;
	private Double dist;
	private String info;
	private Address address;
	private LatLng position;
	private MapCode[] mapCodes;
	private Viewport viewport;
	private EntryPoint[] entryPoints;
	private DataSources dataSources;
	
	@JsonInclude(value = Include.NON_NULL)
	private POI poi;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Double getDist() {
		return dist;
	}
	public void setDist(Double dist) {
		this.dist = dist;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LatLng getPosition() {
		return position;
	}
	public void setPosition(LatLng position) {
		this.position = position;
	}
	public MapCode[] getMapCodes() {
		return mapCodes;
	}
	public void setMapCodes(MapCode[] mapCodes) {
		this.mapCodes = mapCodes;
	}
	public Viewport getViewport() {
		return viewport;
	}
	public void setViewport(Viewport viewport) {
		this.viewport = viewport;
	}
	public EntryPoint[] getEntryPoints() {
		return entryPoints;
	}
	public void setEntryPoints(EntryPoint[] entryPoints) {
		this.entryPoints = entryPoints;
	}
	public DataSources getDataSources() {
		return dataSources;
	}
	public void setDataSources(DataSources dataSources) {
		this.dataSources = dataSources;
	}
	public POI getPoi() {
		return poi;
	}
	public void setPoi(POI poi) {
		this.poi = poi;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Place other = (Place) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
	
	
}
