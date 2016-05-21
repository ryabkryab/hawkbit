/**
 * Copyright (c) 2015 Bosch Software Innovations GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.hawkbit.repository.model;

import java.io.Serializable;

/**
 * Meta data for entities, a (key/value) store.
 *
 */
public interface MetaData extends Serializable {

    /**
     * @return the key
     */
    String getKey();

    /**
     * @param key
     */
    void setKey(String key);

    /**
     * @return the value
     */
    String getValue();

    /**
     * @param value
     */
    void setValue(String value);

}