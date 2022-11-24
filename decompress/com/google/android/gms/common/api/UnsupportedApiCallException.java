// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

public final class UnsupportedApiCallException extends UnsupportedOperationException
{
    public final gta F0;
    
    public UnsupportedApiCallException(final gta f0) {
        this.F0 = f0;
    }
    
    @Override
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.F0));
    }
}
