/*
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 *
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License  as
 * published by the Free Software Foundation, either version 3 of  the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero  General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public  License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * @author: Dima Gorbenko <dgorbenko@jaspersoft.com>
 * @version: $Id$
 */

define(function(){
	"use strict";

	var addDataSource = {};
	addDataSource.initOptions = {
		isEditMode: false,
		parentFolderUri: "",
		resourceIdNotSupportedSymbols: "[~!#\\$%^|\\s`@&*()\\-+={}\\[\\]:;\"\'\\<\\>,?\/\\|\\\\]",
		dependentResources: []
	};
	addDataSource.initOptions.resourceUri = "";

	return addDataSource;
});
