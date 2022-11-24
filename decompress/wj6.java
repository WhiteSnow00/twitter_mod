import android.net.Uri;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wj6
{
    public static final a Companion;
    public static final wj6 i;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set<b> h;
    
    static {
        Companion = new a();
        i = new wj6(0, false, false, false, false, 0L, 0L, null, 255, null);
    }
    
    public wj6() {
        this(0, false, false, false, false, 0L, 0L, null, 255, null);
    }
    
    public wj6(final Object a, final boolean b, final boolean c, final boolean d, final boolean e, final long f, final long g, final Set<b> h) {
        mqb.n((int)a, "requiredNetworkType");
        e0e.f((Object)h, "contentUriTriggers");
        this.a = (int)a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public wj6(final int n, final boolean b, final boolean b2, final boolean b3, final boolean b4, final long n2, final long n3, final Set set, final int n4, final wg8 wg8) {
        this(1, false, false, false, false, -1L, -1L, (Set)r3a.F0);
    }
    
    public final boolean a() {
        return this.h.isEmpty() ^ true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        boolean a;
        final boolean b = a = false;
        if (o != null) {
            if (!e0e.a((Object)wj6.class, (Object)o.getClass())) {
                a = b;
            }
            else {
                final wj6 wj6 = (wj6)o;
                if (this.b != wj6.b) {
                    return false;
                }
                if (this.c != wj6.c) {
                    return false;
                }
                if (this.d != wj6.d) {
                    return false;
                }
                if (this.e != wj6.e) {
                    return false;
                }
                if (this.f != wj6.f) {
                    return false;
                }
                if (this.g != wj6.g) {
                    return false;
                }
                if (this.a != wj6.a) {
                    a = b;
                }
                else {
                    a = e0e.a((Object)this.h, (Object)wj6.h);
                }
            }
        }
        return a;
    }
    
    @Override
    public final int hashCode() {
        final int g = lb0.G(this.a);
        final int b = this.b ? 1 : 0;
        final int c = this.c ? 1 : 0;
        final int d = this.d ? 1 : 0;
        final int e = this.e ? 1 : 0;
        final long f = this.f;
        final int n = (int)(f ^ f >>> 32);
        final long g2 = this.g;
        return this.h.hashCode() + ((((((g * 31 + b) * 31 + c) * 31 + d) * 31 + e) * 31 + n) * 31 + (int)(g2 ^ g2 >>> 32)) * 31;
    }
    
    public static final class a
    {
    }
    
    public static final class b
    {
        public final Uri a;
        public final boolean b;
        
        public b(final Uri a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            Class<?> class1;
            if (o != null) {
                class1 = o.getClass();
            }
            else {
                class1 = null;
            }
            if (!e0e.a((Object)b.class, (Object)class1)) {
                return false;
            }
            e0e.d(o, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            final b b = (b)o;
            return e0e.a((Object)this.a, (Object)b.a) && this.b == b.b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            int n;
            if (this.b) {
                n = 1231;
            }
            else {
                n = 1237;
            }
            return hashCode * 31 + n;
        }
    }
}
