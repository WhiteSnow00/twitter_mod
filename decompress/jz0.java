import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jz0
{
    public final Context a;
    public final nnl<x1> b;
    public final zbr c;
    public final q1o d;
    public final i4 e;
    public final vjo f;
    public final xrn g;
    public a h;
    public boolean i;
    public final xkp j;
    
    public jz0(final Context a, final nnl<x1> b, final xbm xbm, final zbr c, final o1o o1o, final q1o d, final i4 e, final vjo f, final xrn g) {
        czd.f((Object)a, "context");
        czd.f((Object)b, "avEventSubject");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)c, "stationsPlaybackEventDispatcher");
        czd.f((Object)o1o, "replayPlaybackEventDispatcher");
        czd.f((Object)d, "replayViewEventDispatcher");
        czd.f((Object)e, "avPlaybackManager");
        czd.f((Object)f, "roomsScribeReporter");
        czd.f((Object)g, "roomNotificationController");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final xkp j = new xkp();
        this.j = j;
        final nnl a2 = o1o.a;
        final w19 w19 = new w19();
        ((sy5)xbm.E0).q((oj)new jz0$b(w19));
        w19.c(((h5j)a2).subscribe((lj6)new f$l((qsb)new jz0$c(this))));
        xbm.i((oj)new tm(j, 1));
    }
    
    public static final void a(final jz0 jz0, final w4 w4) {
        final a h = jz0.h;
        if (h != null) {
            final c6 c = h.c;
            if (c != null) {
                final long n = c.a + 15000L;
                final long b = c.b;
                long n2 = n;
                if (n > b) {
                    n2 = b;
                }
                w4.m(n2);
            }
        }
    }
    
    public static final class a
    {
        public final w4 a;
        public final Set<f2> b;
        public final c6 c;
        
        public a(final w4 a, final Set b) {
            this.a = a;
            this.b = b;
            this.c = null;
        }
        
        public a(final w4 a, final Set<? extends f2> b, final c6 c) {
            this.a = a;
            this.b = (Set<f2>)b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return czd.a((Object)this.a, (Object)a.a) && czd.a((Object)this.b, (Object)a.b) && czd.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            final int b = zip.b((Set)this.b, this.a.hashCode() * 31, 31);
            final c6 c = this.c;
            int hashCode;
            if (c == null) {
                hashCode = 0;
            }
            else {
                hashCode = c.hashCode();
            }
            return b + hashCode;
        }
        
        @Override
        public final String toString() {
            final w4 a = this.a;
            final Set<f2> b = this.b;
            final c6 c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("PlaybackState(avPlayerAttachment=");
            sb.append(a);
            sb.append(", listeners=");
            sb.append(b);
            sb.append(", lastProgressEvent=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
}
