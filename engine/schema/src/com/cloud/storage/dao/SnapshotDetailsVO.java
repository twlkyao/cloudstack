/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.cloud.storage.dao;

import org.apache.cloudstack.api.ResourceDetail;

import javax.persistence.*;

@Entity
@Table(name = "snapshot_details")
public class SnapshotDetailsVO implements ResourceDetail {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "snapshot_id")
    private long resourceId;

    @Column(name = "name")
    String name;

    @Column(name = "value")
    String value;

    public SnapshotDetailsVO(Long resourceId, String name, String value) {
        this.resourceId = resourceId;
        this.name = name;
        this.value = value;
    }

    @Override
    public long getResourceId() {
        return resourceId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean isDisplay() {
        return false;
    }

    @Override
    public long getId() {
        return id;
    }
}