package com.kitchensurfing.exception;

import java.io.Serializable;

public class InvalidVersionException extends RuntimeException 
implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2783182960137663605L;
    private  final short _version;
    public InvalidVersionException( final String msg, final short version ) {
        super( msg );
        _version = version;
    }
    public short getVersion() {
        return _version;
    }
}
