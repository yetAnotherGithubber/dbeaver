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

package org.jkiss.dbeaver.model.app;

import org.jkiss.code.NotNull;

/**
 * DB application.
 * Application implementors may redefine core app behavior and/or settings.
 */
public interface DBPApplication
{
    boolean isStandalone();

    @NotNull
    DBASecureStorage getSecureStorage();

    @NotNull
    DBASecureStorage getProjectSecureStorage(DBPProject project);

    /**
     * Application information details.
     * Like license info or some custom produce info
     */
    String getInfoDetails();

    /**
     * Default project name, e.g. 'General'.
     */
    String getDefaultProjectName();

}
