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
package com.jaspersoft.jasperserver.api.common.properties;

import java.util.Iterator;
import java.util.Map;

import mondrian.olap.MondrianProperties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.jaspersoft.jasperserver.api.metadata.common.service.RepositoryService;
import com.jaspersoft.jasperserver.api.common.properties.PropertyChanger;
import com.jaspersoft.jasperserver.api.logging.audit.context.AuditContext;
import com.jaspersoft.jasperserver.api.logging.audit.domain.AuditEvent;


/**
 * Log4j changer manages log4j configuration.
 * it assumes a "log4j." prefix for all logger names.
 * @author udavidovich
 */
public class Log4jPropertyChanger extends PropertyChangerAdapter {
	final public static String PROPERTY_PREFIX = "log4j.";

    private static final Log log = LogFactory.getLog(Log4jPropertyChanger.class);

	@Override
	public void setProperty(String key, String value) {
        log.debug("setting log4j property: " + key + " - " + value);
        key=parseKey(key);
        Logger log = Logger.getLogger(key);
        log.setLevel(Level.toLevel(value));
	}

	@Override
	public String getProperty(String key) {
        key=parseKey(key);
        Logger log = Logger.getLogger(key);
        return log.getEffectiveLevel().toString(); 
        //effective level can be inherited from a parent
	}
	
	static public String parseKey(String key) {
		assert (key.startsWith(PROPERTY_PREFIX));
		return key.substring(PROPERTY_PREFIX.length());
	}
}

