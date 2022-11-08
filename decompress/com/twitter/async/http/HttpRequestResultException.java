// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.async.http;

public class HttpRequestResultException extends RuntimeException
{
    public final Object C0;
    public final int D0;
    public final boolean E0;
    
    public HttpRequestResultException(final String s, final tsc<?, ?> tsc) {
        super(s, tsc.d);
        this.C0 = tsc.h;
        this.D0 = tsc.c;
        this.E0 = zi8.F(tsc);
    }
    
    public static <ERROR> HttpRequestResultException a(final tsc<?, ERROR> tsc) {
        if (pjr.g((CharSequence)tsc.e)) {
            final StringBuilder g = w48.g("[");
            g.append(tsc.c);
            g.append("] ");
            g.append(tsc.e);
            return new HttpRequestResultException(g.toString(), tsc);
        }
        final Object h = tsc.h;
        if (h instanceof usc) {
            return new HttpRequestResultException(((usc)h).e(), tsc);
        }
        if (tsc.c != 0) {
            return new HttpRequestResultException(gd.y(w48.g("["), tsc.c, "]"), tsc);
        }
        return new HttpRequestResultException(null, tsc);
    }
}
