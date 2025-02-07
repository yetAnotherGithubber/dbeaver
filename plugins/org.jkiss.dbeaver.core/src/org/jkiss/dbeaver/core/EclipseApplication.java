/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
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
package org.jkiss.dbeaver.core;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.app.DBASecureStorage;
import org.jkiss.dbeaver.model.impl.app.DefaultSecureStorage;
import org.jkiss.dbeaver.registry.BaseApplicationImpl;

/**
 * EclipseApplication
 */
class EclipseApplication extends BaseApplicationImpl {

    @Override
    public boolean isStandalone() {
        return false;
    }

    @NotNull
    @Override
    public DBASecureStorage getSecureStorage() {
        return DefaultSecureStorage.INSTANCE;
    }

    @Override
    public String getInfoDetails() {
        return null;
    }

    @Override
    public String getDefaultProjectName() {
        return "DBeaver";
    }

}
