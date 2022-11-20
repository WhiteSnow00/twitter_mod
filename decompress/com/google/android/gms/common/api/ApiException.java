// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

public class ApiException extends Exception
{
    @Deprecated
    public final Status D0;
    
    public ApiException(final Status d0) {
        final int e0 = d0.E0;
        String f0 = d0.F0;
        if (f0 == null) {
            f0 = "";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(f0).length() + 13);
        sb.append(e0);
        sb.append(": ");
        sb.append(f0);
        super(sb.toString());
        this.D0 = d0;
    }
}
