import java.security.MessageDigest;
import java.math.BigInteger;
import java.util.Locale;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Objects;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class klz extends zmz
{
    public final HashMap G0;
    public String H0;
    public boolean I0;
    public long J0;
    public final f4z K0;
    public final f4z L0;
    public final f4z M0;
    public final f4z N0;
    public final f4z O0;
    
    public klz(final poz poz) {
        super(poz);
        this.G0 = new HashMap();
        final u4z u = ((pbz)this).D0.u();
        Objects.requireNonNull(u);
        this.K0 = new f4z(u, "last_delete_stale", 0L);
        final u4z u2 = ((pbz)this).D0.u();
        Objects.requireNonNull(u2);
        this.L0 = new f4z(u2, "backoff", 0L);
        final u4z u3 = ((pbz)this).D0.u();
        Objects.requireNonNull(u3);
        this.M0 = new f4z(u3, "last_upload", 0L);
        final u4z u4 = ((pbz)this).D0.u();
        Objects.requireNonNull(u4);
        this.N0 = new f4z(u4, "last_upload_attempt", 0L);
        final u4z u5 = ((pbz)this).D0.u();
        Objects.requireNonNull(u5);
        this.O0 = new f4z(u5, "midnight_offset", 0L);
    }
    
    public final void j() {
    }
    
    @Deprecated
    public final Pair k(String a) {
        ((pbz)this).g();
        Objects.requireNonNull(((pbz)this).D0.Q0);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        hsz.c();
        if (((pbz)this).D0.J0.t(null, uzy.p0)) {
            final ilz ilz = this.G0.get(a);
            if (ilz != null && elapsedRealtime < ilz.c) {
                return new Pair((Object)ilz.a, (Object)ilz.b);
            }
            final long n = ((pbz)this).D0.J0.q(a, uzy.c) + elapsedRealtime;
            ilz ilz2;
            try {
                final yv$a a2 = yv.a(((pbz)this).D0.D0);
                final String a3 = a2.a;
                if (a3 != null) {
                    ilz2 = new ilz(a3, a2.b, n);
                }
                else {
                    ilz2 = new ilz("", a2.b, n);
                }
            }
            catch (final Exception ex) {
                ((pbz)this).D0.b().P0.b("Unable to get advertising id", (Object)ex);
                ilz2 = new ilz("", false, n);
            }
            this.G0.put(a, ilz2);
            return new Pair((Object)ilz2.a, (Object)ilz2.b);
        }
        else {
            final String h0 = this.H0;
            if (h0 != null && elapsedRealtime < this.J0) {
                return new Pair((Object)h0, (Object)this.I0);
            }
            this.J0 = ((pbz)this).D0.J0.q(a, uzy.c) + elapsedRealtime;
            try {
                final yv$a a4 = yv.a(((pbz)this).D0.D0);
                this.H0 = "";
                a = a4.a;
                if (a != null) {
                    this.H0 = a;
                }
                this.I0 = a4.b;
            }
            catch (final Exception ex2) {
                ((pbz)this).D0.b().P0.b("Unable to get advertising id", (Object)ex2);
                this.H0 = "";
            }
            return new Pair((Object)this.H0, (Object)this.I0);
        }
    }
    
    public final Pair l(final String s, final pcy pcy) {
        if (pcy.f(gcy.E0)) {
            return this.k(s);
        }
        return new Pair((Object)"", (Object)Boolean.FALSE);
    }
    
    @Deprecated
    public final String m(final String s) {
        ((pbz)this).g();
        final String s2 = (String)this.k(s).first;
        final MessageDigest r = lpz.r();
        if (r == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, r.digest(s2.getBytes())));
    }
}
