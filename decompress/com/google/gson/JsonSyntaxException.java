// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson;

public final class JsonSyntaxException extends JsonParseException
{
    public JsonSyntaxException(final String s) {
        super(s);
    }
    
    public JsonSyntaxException(final String s, final Throwable t) {
        super(s, t);
    }
    
    public JsonSyntaxException(final Throwable t) {
        super(t);
    }
}
