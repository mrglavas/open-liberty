/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.http2.test.exceptions;

/**
 *
 */
public class ConnectionNotClosedAfterGoAwayException extends Exception {

    /**  */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public ConnectionNotClosedAfterGoAwayException() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public ConnectionNotClosedAfterGoAwayException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public ConnectionNotClosedAfterGoAwayException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public ConnectionNotClosedAfterGoAwayException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public ConnectionNotClosedAfterGoAwayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

}
