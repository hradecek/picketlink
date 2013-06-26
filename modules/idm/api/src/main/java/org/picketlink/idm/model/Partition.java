/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.picketlink.idm.model;

/**
 * An abstract container representing a grouping of identity objects.  Realm and Tier are examples
 * of Partitions.
 *
 * @author Shane Bryzak
 */
public interface Partition extends AttributedType {

    /**
     * Returns the unique identifier for the partition
     *
     * @return String value representing the unique identifier
     */
    String getId();

    /**
     * Returns the name of the partition.  The partition name is unique for the
     * type of partition.
     *
     * @return String value representing the partition name
     */
    String getName();

}
