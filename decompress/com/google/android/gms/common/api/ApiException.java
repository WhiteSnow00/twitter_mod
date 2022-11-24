// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

public class ApiException extends Exception
{
    @Deprecated
    public final Status F0;
    
    public ApiException(final Status f0) {
        final int g0 = f0.G0;
        String h0 = f0.H0;
        if (h0 == null) {
            h0 = "";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(h0).length() + 13);
        sb.append(g0);
        sb.append(": ");
        sb.append(h0);
        super(sb.toString());
        this.F0 = f0;
    }
}
