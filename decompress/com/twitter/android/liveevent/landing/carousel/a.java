// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.carousel;

import java.util.concurrent.TimeUnit;
import java.util.Objects;
import java.util.concurrent.ConcurrentSkipListSet;
import j$.util.concurrent.ConcurrentHashMap;
import android.graphics.Rect;

public final class a
{
    public static final e Companion;
    public final com.twitter.android.liveevent.landing.scribe.a a;
    public final sbu b;
    public final c5d c;
    public final Rect d;
    public final ConcurrentHashMap<v7x, d> e;
    public final ConcurrentHashMap<String, c> f;
    public final ConcurrentSkipListSet<String> g;
    
    static {
        Companion = new e();
    }
    
    public a(final com.twitter.android.liveevent.landing.scribe.a a, final sbu b, final c5d c, final f f, final xbm xbm) {
        czd.f((Object)a, "scribeClient");
        czd.f((Object)b, "clock");
        czd.f((Object)c, "visibilityCalculator");
        czd.f((Object)f, "periodicImpressionEmitter");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new Rect();
        final w19 w19 = new w19();
        this.e = (ConcurrentHashMap<v7x, d>)new ConcurrentHashMap();
        this.f = (ConcurrentHashMap<String, c>)new ConcurrentHashMap();
        this.g = new ConcurrentSkipListSet<String>();
        final r7j a2 = f.a;
        czd.e((Object)a2, "emitter");
        w19.c(((h5j)a2).subscribe((lj6)new sma((qsb)new a$a(this), 4), (lj6)new tma((qsb)a$b.D0, 4)));
        xbm.i((oj)new srf(w19, 0));
    }
    
    public final void a(final c c) {
        final com.twitter.android.liveevent.landing.scribe.a a = this.a;
        final int c2 = c.c;
        Objects.requireNonNull(a);
        final vba g = vba.g("live_event_timeline", "", "", "", "tile_impression");
        final fxf l = a.l(a.i);
        l.l = c2;
        a.o(g, (j0p)l.a());
        this.g.add(c.a);
        this.f.remove((Object)c.a);
    }
    
    public static final class c
    {
        public final String a;
        public final long b;
        public final int c;
        
        public c(final String a, final long b, final int c) {
            czd.f((Object)a, "carouselItemId");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return czd.a((Object)this.a, (Object)c.a) && this.b == c.b && this.c == c.c;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final long b = this.b;
            return (hashCode * 31 + (int)(b ^ b >>> 32)) * 31 + this.c;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final long b = this.b;
            final int c = this.c;
            final StringBuilder l = fu8.l("CarouselImpressionCandidate(carouselItemId=", a, ", startTime=", b);
            l.append(", position=");
            l.append(c);
            l.append(")");
            return l.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final int b;
        
        public d(final String a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return czd.a((Object)this.a, (Object)d.a) && this.b == d.b;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() * 31 + this.b;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final int b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("CarouselItemPositionHolder(carouselItemId=");
            sb.append(a);
            sb.append(", position=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
    }
    
    public static final class f
    {
        public final h5j<Long> a;
        
        public f() {
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            this.a = new r7j((pnl)new fab(e9b.c()));
        }
    }
}
