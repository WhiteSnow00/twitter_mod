// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase;

public class FirebaseException extends Exception
{
    @Deprecated
    public FirebaseException() {
    }
    
    public FirebaseException(final String s) {
        xd.r(s, (Object)"Detail message must not be empty");
        super(s);
    }
}
