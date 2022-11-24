import java.text.ParseException;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jt1
{
    public boolean a;
    public final Object b;
    
    public jt1(final cpk b) {
        e0e.f((Object)b, "playtimeProvider");
        this.b = b;
    }
    
    public final boolean a(final BigInteger bigInteger, final BigInteger bigInteger2) {
        if (bigInteger != null) {
            final BigInteger zero = BigInteger.ZERO;
            if (!e0e.a((Object)bigInteger, (Object)zero) && bigInteger2 != null && !e0e.a((Object)bigInteger2, (Object)zero)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean b() {
        return ((cpk)this.b).b() > 0L;
    }
    
    public final boolean c() {
        if (((cpk)this.b).z() == null) {
            return false;
        }
        try {
            final zqs a = zqs.a;
            zqs.b.parse(((cpk)this.b).z());
            return true;
        }
        catch (final ParseException ex) {
            return false;
        }
    }
    
    public final boolean d(final BigInteger bigInteger, final String s, final BigInteger bigInteger2, final boolean b) {
        final boolean a = this.a;
        final boolean b2 = true;
        if (a) {
            return true;
        }
        final boolean b3 = this.b();
        final boolean b4 = false;
        final boolean b5 = false;
        if (!b3 && !this.c()) {
            return false;
        }
        if (b) {
            return true;
        }
        if (this.a(bigInteger, bigInteger2)) {
            e0e.d((Object)bigInteger, "null cannot be cast to non-null type java.math.BigInteger");
            return this.e(bigInteger);
        }
        if (s != null) {
            if (this.b()) {
                final long b6 = ((cpk)this.b).b();
                final zqs a2 = zqs.a;
                if (zqs.b(s) <= b6) {
                    return b2;
                }
            }
            else {
                boolean b7 = b5;
                if (!this.c()) {
                    return b7;
                }
                final String z = ((cpk)this.b).z();
                e0e.d((Object)z, "null cannot be cast to non-null type kotlin.String");
                final zqs a3 = zqs.a;
                if (zqs.b(s) <= zqs.b(z)) {
                    b7 = b2;
                    return b7;
                }
            }
            return false;
        }
        int n = b4 ? 1 : 0;
        if (bigInteger2 != null) {
            n = (b4 ? 1 : 0);
            if (!e0e.a((Object)bigInteger2, (Object)BigInteger.ZERO)) {
                n = 1;
            }
        }
        if (n != 0) {
            e0e.d((Object)bigInteger2, "null cannot be cast to non-null type java.math.BigInteger");
            return this.e(bigInteger2);
        }
        return true;
    }
    
    public final boolean e(final BigInteger bigInteger) {
        final long j = v7q.j(bigInteger);
        final boolean b = this.b();
        final boolean b2 = true;
        boolean b3 = true;
        if (b) {
            final long b4 = ((cpk)this.b).b();
            final zqs a = zqs.a;
            if (j > b4) {
                b3 = false;
            }
            return b3;
        }
        if (this.c()) {
            final String z = ((cpk)this.b).z();
            e0e.d((Object)z, "null cannot be cast to non-null type kotlin.String");
            final zqs a2 = zqs.a;
            return j <= zqs.b(z) && b2;
        }
        return false;
    }
}
