package org.json;

/*
Public Domain.
*/

/**
 * The JSONPointerException is thrown by {@link JSONPointer} if an error occurs
 * during evaluating a pointer.
 * 
 * @author JSON.org
 * @version 2016-05-13
 */
public class JSONPointerException extends JSONException {
    private static final long serialVersionUID = 8872944667561856751L;

    /**
     * 
     * @param message Message
     */
    public JSONPointerException(String message) {
        super(message);
    }

    /**
     * 
     * @param message Message
     * @param cause Cause
     */
    public JSONPointerException(String message, Throwable cause) {
        super(message, cause);
    }

}
