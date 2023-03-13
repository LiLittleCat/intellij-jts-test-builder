/*
 * Copyright (c) 2016 Vivid Solutions.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v20.html
 * and the Eclipse Distribution License is available at
 *
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */
package org.locationtech.jtstest.function;

import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.simplify.DouglasPeuckerSimplifier;
import org.locationtech.jts.simplify.PolygonHullSimplifier;
import org.locationtech.jts.simplify.TopologyPreservingSimplifier;
import org.locationtech.jts.simplify.VWSimplifier;
import org.locationtech.jtstest.geomfunction.Metadata;

public class SimplificationFunctions {
	public static Geometry simplifyDP(Geometry g, double distance)	
	{		return DouglasPeuckerSimplifier.simplify(g, distance);	}

  public static Geometry simplifyTP(Geometry g, double distance)  
  {   return TopologyPreservingSimplifier.simplify(g, distance);  }
  
  public static Geometry simplifyVW(Geometry g, 
      @Metadata(title="Sqrt Area Tolerance")
      double tolerance)  
  {   return VWSimplifier.simplify(g, tolerance);  }
  
  public static Geometry outerPolygonHullByVertexFrac(Geometry geom, 
      @Metadata(title="Vertex Fraction")
      double vertexFrac) {
    return PolygonHullSimplifier.hull(geom, true, vertexFrac);
  }
  
  public static Geometry outerPolygonHullByAreaDelta(Geometry geom, 
      @Metadata(title="Area Delta Ratio")
      double areaFrac) {
    return PolygonHullSimplifier.hullByAreaDelta(geom, true, areaFrac);
  }

  public static Geometry innerPolygonHullByVertexFrac(Geometry geom, 
      @Metadata(title="Vertex Fraction")
      double vertexFrac) {
    return PolygonHullSimplifier.hull(geom, false, vertexFrac);
  }
  
  public static Geometry innerPolygonHullByAreaDelta(Geometry geom, 
      @Metadata(title="Area Delta Ratio")
      double areaFrac) {
    return PolygonHullSimplifier.hullByAreaDelta(geom, false, areaFrac);
  }

}
