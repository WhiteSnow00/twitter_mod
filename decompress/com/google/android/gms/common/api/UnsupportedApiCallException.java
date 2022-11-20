// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

public final class UnsupportedApiCallException extends UnsupportedOperationException
{
    public final yra D0;
    
    public UnsupportedApiCallException(final yra d0) {
        this.D0 = d0;
    }
    
    @Override
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.D0));
    }
}
