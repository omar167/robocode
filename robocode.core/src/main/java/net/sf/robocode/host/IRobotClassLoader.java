/*******************************************************************************
 * Copyright (c) 2001, 2009 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/cpl-v10.html
 *
 * Contributors:
 *     Pavel Savara
 *     - Initial implementation
 *******************************************************************************/
package net.sf.robocode.host;


import java.util.Set;


/**
 * @author Pavel Savara (original)
 */
public interface IRobotClassLoader {
	Class<?> loadRobotMainClass(boolean resolve) throws ClassNotFoundException;
	Set<String> getReferencedClasses();
	void cleanup();
}