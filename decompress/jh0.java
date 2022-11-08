import java.util.Collection;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jh0<OBJECT, ERROR> extends kmm<OBJECT, ERROR>
{
    public boolean V0;
    public boolean W0;
    public isc X0;
    public isc Y0;
    public sfa Z0;
    public qrc a1;
    public int b1;
    public xrc c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public vrc g1;
    public bsc$a h1;
    
    public jh0(final UserIdentifier userIdentifier, final int n) {
        super(userIdentifier);
        boolean e1 = false;
        this.V0 = false;
        this.b1 = 0;
        this.d1 = true;
        this.e1 = true;
        this.f1 = false;
        this.g1 = qbv.a();
        this.h1 = bsc$a.C0;
        ((cw0)this).f();
        if (n == 0) {
            e1 = true;
        }
        this.e1 = e1;
    }
    
    public tsc<OBJECT, ERROR> b() {
        final qrc h0 = this.h0();
        final String a = h0.a(this.g1);
        ((wwo)e9a.b().a).f((Object)"api_request_uri", (Object)a);
        final wsc<?, ?> g0 = this.g0();
        final yrc a2 = this.a0((CharSequence)a);
        Objects.requireNonNull(a2);
        a2.h = h0.b;
        a2.i = h0.c;
        a2.r = h0.d;
        final int a3 = w4j.a;
        a2.l = this.e1;
        a2.j = (hsc)g0;
        a2.w = this.d1;
        a2.s = this.h1;
        a2.m = this.f1;
        if (this.W0) {
            if (this.X0 == null) {
                final z9c b = aac.a().b();
                if (b == null) {
                    return (tsc<OBJECT, ERROR>)tsc.c(0, "Failed to obtain any auth for this request");
                }
                this.X0 = (isc)new y9c(b);
            }
            a2.q = this.X0;
        }
        else {
            final isc y0 = this.Y0;
            if (y0 != null) {
                a2.q = y0;
            }
            else if (!this.V0) {
                a2.q = (isc)ldv.c();
            }
        }
        final int b2 = this.b1;
        if (b2 > 0) {
            a2.k = b2;
        }
        final sfa z0 = this.Z0;
        if (z0 != null) {
            a2.a(z0);
        }
        final xrc e = a2.e();
        try {
            synchronized (this) {
                this.c1 = e;
                if (((cw0)this).N()) {
                    final tsc tsc = new tsc();
                    monitorexit(this);
                    synchronized (this) {
                        this.c1 = null;
                        return (tsc<OBJECT, ERROR>)tsc;
                    }
                }
                monitorexit(this);
                e.d();
                final tsc a4 = tsc.a(e, (wsc)g0);
                synchronized (this) {
                    this.c1 = null;
                    monitorexit(this);
                    final tsc<OBJECT, ERROR> i0 = this.i0((tsc<OBJECT, ERROR>)a4);
                    final Exception d = i0.d;
                    if (d != null) {
                        cag.l("APIRequest", "Error", (Throwable)d);
                        if (ffa.q("scribe_error_sample_size", cro.e).b()) {
                            final xca a5 = xca.a();
                            final UserIdentifier p0 = super.P0;
                            final zf4 zf4 = new zf4();
                            zf4.z = "client_watch_error";
                            zf4.E = 2;
                            zf4.D = d.getClass().getSimpleName();
                            zf4.F = cag.f((Throwable)d).getBytes();
                            zf4.c = null;
                            a5.b(p0, (okm)zf4);
                        }
                    }
                    return i0;
                }
            }
        }
        finally {
            synchronized (this) {
                this.c1 = null;
            }
        }
    }
    
    public final void e0() {
        synchronized (this) {
            ((cw0)this).H(true);
            final xrc c1 = this.c1;
            monitorexit(this);
            if (c1 != null) {
                c1.b();
            }
        }
    }
    
    public abstract qrc f0();
    
    public abstract wsc<OBJECT, ERROR> g0();
    
    public final qrc h0() {
        if (this.a1 == null) {
            this.a1 = this.f0();
        }
        return this.a1;
    }
    
    public tsc<OBJECT, ERROR> i0(final tsc<OBJECT, ERROR> tsc) {
        return tsc;
    }
    
    public final <T extends jh0<OBJECT, ERROR>> T j0() {
        this.W0 = true;
        ((cw0)this).I();
        ((cw0)this).G((ysm)new jh0.jh0$a(this, (Collection)ijf.w((Object)401, (Object[])new Integer[] { 403 })));
        ((cw0)this).G((ysm)new uj8());
        final int a = w4j.a;
        return (T)this;
    }
    
    public final <T extends jh0<OBJECT, ERROR>> T k0() {
        if (super.P0.isLoggedOutUser()) {
            this.j0();
        }
        final int a = w4j.a;
        return (T)this;
    }
    
    public final String l() {
        return this.g1.b;
    }
    
    public final boolean v() {
        return this.f1 ^ true;
    }
}
