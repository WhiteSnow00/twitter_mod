// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public interface h
{
    public static final class a
    {
        public final int a;
        public final int b;
        
        public a(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public final boolean a(final int n) {
            boolean b = true;
            if (n != 1) {
                if (this.a - this.b > 1) {
                    return b;
                }
            }
            b = false;
            return b;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        
        public b(final int a, final long b) {
            omy.g(b >= 0L);
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c
    {
        public final IOException a;
        public final int b;
        
        public c(final IOException a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}
