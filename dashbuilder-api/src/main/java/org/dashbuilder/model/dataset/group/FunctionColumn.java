/**
 * Copyright (C) 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.model.dataset.group;

import org.jboss.errai.common.client.api.annotations.Portable;

/**
 * A data range definition.
 */
@Portable
public class FunctionColumn {

    protected String sourceId;
    protected String columnId;
    protected ScalarFunctionType function;

    public FunctionColumn() {
    }

    public FunctionColumn(String sourceId, String columnId, ScalarFunctionType function) {
        this.sourceId = sourceId;
        this.columnId = columnId;
        this.function = function;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public ScalarFunctionType getFunction() {
        return function;
    }

    public void setFunctionCode(ScalarFunctionType function) {
        this.function = function;
    }

    public boolean equals(Object obj) {
        try {
            FunctionColumn other = (FunctionColumn) obj;
            if (sourceId != null && !sourceId.equals(other.sourceId)) return false;
            if (columnId != null && !columnId.equals(other.columnId)) return false;
            if (function != null && !function.equals(other.function)) return false;
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }
}