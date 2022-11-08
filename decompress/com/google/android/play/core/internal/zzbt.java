// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.internal;

public final class zzbt extends RuntimeException
{
    public zzbt(final String s) {
        super(s);
    }
    
    public zzbt(final Throwable t) {
        super("Failed to initialize FileStorage", t);
    }
}
