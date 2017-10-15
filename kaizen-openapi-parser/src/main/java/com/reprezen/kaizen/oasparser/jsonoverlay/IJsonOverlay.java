/*******************************************************************************
 *  Copyright (c) 2017 ModelSolv, Inc. and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     ModelSolv, Inc. - initial API and implementation and/or initial documentation
 *******************************************************************************/
package com.reprezen.kaizen.oasparser.jsonoverlay;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.JsonNode;
import com.reprezen.kaizen.oasparser.jsonoverlay.JsonOverlay.JsonOption;
import com.reprezen.kaizen.oasparser.jsonoverlay.JsonOverlay.JsonOptions;

public interface IJsonOverlay<V> {

	V get();
	
	V get(boolean elaborate);

	void set(V value);

	IJsonOverlay<?> find(JsonPointer path);

	IJsonOverlay<?> find(String path);

	JsonNode toJson();
	
	JsonNode toJson(JsonOptions options);
	
	JsonNode toJson(JsonOption... options);

	boolean isPresent();
	
	boolean isElaborated();
	
	IJsonOverlay<?> getParent();
	
	String getPathInParent();
	
	IJsonOverlay<?> getRoot();
}