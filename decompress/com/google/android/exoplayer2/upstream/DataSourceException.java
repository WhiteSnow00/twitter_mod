// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public class DataSourceException extends IOException
{
    public static final int E0 = 0;
    public final int D0;
    
    public DataSourceException(final int d0) {
        this.D0 = d0;
    }
    
    public DataSourceException(final String s, final int d0) {
        super(s);
        this.D0 = d0;
    }
    
    public DataSourceException(final String s, final Throwable t, final int d0) {
        super(s, t);
        this.D0 = d0;
    }
    
    public DataSourceException(final Throwable t, final int d0) {
        super(t);
        this.D0 = d0;
    }
}
