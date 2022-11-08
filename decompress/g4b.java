import java.util.concurrent.TimeUnit;
import java.util.concurrent.ConcurrentSkipListSet;
import j$.util.concurrent.ConcurrentHashMap;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g4b
{
    public static final d Companion;
    public final g4b.g4b$e a;
    public final saw b;
    public final Rect c;
    public final ConcurrentHashMap<c7x, c> d;
    public final ConcurrentHashMap<String, f> e;
    public final ConcurrentSkipListSet<String> f;
    
    static {
        Companion = new d();
    }
    
    public g4b(final g g, final g4b.g4b$e a, final saw b, final ibm ibm) {
        zzd.f((Object)g, "periodicImpressionEmitter");
        zzd.f((Object)a, "visibilityCalculator");
        zzd.f((Object)b, "userEventReporter");
        zzd.f((Object)ibm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = new Rect();
        final m29 m29 = new m29();
        this.d = (ConcurrentHashMap<c7x, c>)new ConcurrentHashMap();
        this.e = (ConcurrentHashMap<String, f>)new ConcurrentHashMap();
        this.f = new ConcurrentSkipListSet<String>();
        final l7j a2 = g.a;
        zzd.e((Object)a2, "emitter");
        m29.c(((b5j)a2).subscribe((fk6)new cwt((rtb)new g4b$a(this), 27), (fk6)new nol((rtb)g4b$b.C0, 26)));
        ibm.i((rj)new ap0(m29, 1));
    }
    
    public static final class c
    {
        public final int a;
        public final String b;
        public final boolean c;
        
        public c(final int a, final String b, final boolean c) {
            zzd.f((Object)b, "spaceId");
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
            return this.a == c.a && zzd.a((Object)this.b, (Object)c.b) && this.c == c.c;
        }
        
        @Override
        public final int hashCode() {
            final int a = l7k.a(this.b, this.a * 31, 31);
            int c;
            if ((c = (this.c ? 1 : 0)) != 0) {
                c = 1;
            }
            return a + c;
        }
        
        @Override
        public final String toString() {
            return bd.y(t4a.k("AudiospaceViewHolder(position=", this.a, ", spaceId=", this.b, ", isCommunitySpace="), this.c, ")");
        }
    }
    
    public static final class d
    {
    }
    
    public static final class f
    {
        public final String a;
        public final int b;
        
        public f(final String a, final int b) {
            zzd.f((Object)a, "spaceId");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return zzd.a((Object)this.a, (Object)f.a) && this.b == f.b;
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
            sb.append("ImpressionCandidate(spaceId=");
            sb.append(a);
            sb.append(", position=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class g
    {
        public final b5j<Long> a;
        
        public g() {
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            this.a = new l7j((bnl)new ibb(hab.c()));
        }
    }
}
