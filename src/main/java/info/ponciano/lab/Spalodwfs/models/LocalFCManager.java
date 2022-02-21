/*
 * Copyright (C) 2021 Dr. Jean-Jacques Ponciano.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package info.ponciano.lab.Spalodwfs.models;

import java.util.ArrayList;
import java.util.List;

import info.ponciano.lab.Spalodwfs.models.semantic.OntoManagementException;

public abstract class LocalFCManager implements FeatureCollectionManager{
	
	
	
	public List<String[]> getVersion() throws OntoManagementException {
		List<String[]> info = new ArrayList<String[]>();

		// initialize the query to retrieve all instances of previous asset
		/*String query = "SELECT ?a "
				+ "WHERE{ ?a rdf:type <http://www.w3.org/ns/adms#Asset>. ?a <http://www.w3.org/ns/adms#last> <"
				+ this.prevAsset + ">. " + "}";
		System.out.println(query);
		System.out.println(KB.get().getSPARQL(query));
		// create the table of variables
		String[] var = { "a" };
		// query the ontology
		info = KB.get().queryAsArray(query, var, true, false);*/
		return info;
	}

}
