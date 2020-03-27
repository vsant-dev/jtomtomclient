package com.vs.jtomtomclient.model;

public class MapCode {
	/**
	 * Type of mapcode: Local: the shortest possible (and easiest to remember)
	 * mapcode. Local mapcodes are especially useful when the user knows what
	 * territory the mapcode is in (for example, when an application is designed to
	 * be used inside just one European country or US state). Note that the code
	 * element of a Local mapcode is ambiguous when used without the territory
	 * element e.g., the "4J.P2" mapcode can mean the Eiffel Tower location
	 * (48.858380, 2.294440) with the territory set to FRA, but also some place in
	 * Amsterdam-Noord, Netherlands (52.382184, 4.911021) with the territory set to
	 * NLD. International: this mapcode is unambiguous. It is also the longest.
	 * Alternative: alternatives to Local mapcodes. Each Alternative mapcode points
	 * to slightly different coordinates due to the way mapcodes are computed (see
	 * the mapcode documentation). For example: the position from a response can be
	 * encoded as "5DM.WC" (51.759244, 19.448316) and the "VHJ.036" (51.759245,
	 * 19.448264), which are close to each other, but not exactly the same place.
	 */
	private String type;

	/**
	 * The full form of a mapcode (territory + code). It is always unambiguous. The
	 * territory element is always in the Latin alphabet. In an International
	 * mapcode, the territory part is empty.
	 */
	private String fullMapcode;

	/**
	 * The territory element of the mapcode. The territory element is always in the
	 * Latin alphabet. Usually, the territory is the ISO 3166-1 alpha 3 abbreviation
	 * for the country name. However in these eight very large countries: The USA,
	 * Canada, Mexico, Brazil, India, Australia, Russia, China. An address has
	 * little meaning unless the user also knows what state it's in (just as,
	 * elsewhere, an address has little meaning if the user doesn’t know what
	 * country it’s in). More information about territory codes is available at
	 * Territories for mapcodes. This field is not returned for an International
	 * mapcode.
	 */
	private String territory;

	/**
	 * The mapcode without the territory element. It consists of two groups of
	 * letters and digits separated by a dot. The code is using the same language
	 * and alphabet as the Response. The language parameter may be used to modify
	 * the language and alphabet of both the Response and the code (for example:
	 * Cyrillic for the language 'ru-RU'). This field is not returned for the
	 * International mapcodes - use fullMapcode instead.
	 */
	private String code;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFullMapcode() {
		return fullMapcode;
	}

	public void setFullMapcode(String fullMapcode) {
		this.fullMapcode = fullMapcode;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
