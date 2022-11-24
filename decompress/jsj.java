import java.util.concurrent.TimeUnit;
import com.twitter.api.upload.request.MediaUploadRejectionException;
import java.io.IOException;
import android.os.Looper;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsj extends up1 implements isj$b
{
    public final dwg L0;
    public long M0;
    public final List<zvj<String, String>> N0;
    public final t2h O0;
    public final tsc P0;
    public final boolean Q0;
    public final Handler R0;
    public final int S0;
    public long T0;
    public final zg4 U0;
    public int V0;
    public int W0;
    public x5r X0;
    public x16 Y0;
    public isj Z0;
    public final List<u2h> a1;
    public int b1;
    public long c1;
    public final Point d1;
    
    public jsj(final Context context, final UserIdentifier userIdentifier, final dwg l0, final j2h j2h, final tca<uhl> tca, int ordinal, final List<zvj<String, String>> n0, final t2h o0, final Point d1, final tsc p11, final List<u2h> a1) {
        super(context, userIdentifier, j2h, (tca)tca);
        this.M0 = -1L;
        this.R0 = new Handler(Looper.getMainLooper());
        boolean b = ita.a(userIdentifier).b("media_async_upload_gif_enabled", false);
        final boolean b2 = ita.a(userIdentifier).b("media_async_upload_video_enabled", false);
        this.S0 = ordinal;
        this.L0 = l0;
        this.N0 = n0;
        ordinal = ((Enum)l0.c).ordinal();
        Label_0143: {
            Label_0140: {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        break Label_0143;
                    }
                    if (ordinal == 3) {
                        b = b2;
                        break Label_0143;
                    }
                    if (ordinal == 5) {
                        break Label_0140;
                    }
                }
                else {
                    if (o0 == t2h.M0) {
                        break Label_0140;
                    }
                    if (o0 == t2h.O0) {
                        break Label_0140;
                    }
                }
                b = false;
                break Label_0143;
            }
            b = true;
        }
        this.Q0 = b;
        this.O0 = o0;
        this.d1 = d1;
        this.P0 = p11;
        this.a1 = a1;
        final zg4 u0 = new zg4(ch4.a1, (zg4)null);
        r1n.c0(u0, l0);
        this.U0 = u0;
        this.b1 = 0;
    }
    
    public final void b() {
        super.b();
        final x16 y0 = this.Y0;
        if (y0 != null) {
            this.R0.removeCallbacks((Runnable)y0);
        }
        final x5r x0 = this.X0;
        if (x0 != null) {
            ((gh0)x0).e0();
        }
        final isj z0 = this.Z0;
        if (z0 != null) {
            z0.b();
        }
        this.X0 = null;
        final l2h l2h = new l2h(xsc.c(1005, "Error: upload cancelled"), this.L0, this.M0);
        l2h.k = true;
        this.f(l2h);
    }
    
    public final void e() {
        ((sn1)this).J0 = 2;
        this.c1 = icu.d().b();
        try {
            final long length = this.L0.a.length();
            this.T0 = length;
            if (length == 0L) {
                ((sn1)this).g(this.L0, 1008, (Exception)new IOException("EditableMedia fileSize is empty"));
                return;
            }
            final w5r x0 = new w5r(((sn1)this).F0, ((sn1)this).G0, this.L0, this.T0, (List)this.N0, this.O0, this.d1, (List)this.a1, this.Q0);
            this.X0 = (x5r)x0;
            ((v2p$a)((pnm)x0).Y()).b(this.U0);
            final x5r x2 = this.X0;
            x2.q1 = (x5r$a)new pn1((Object)this, 15);
            this.P0.f(x2);
        }
        catch (final SecurityException ex) {
            ((sn1)this).g(this.L0, 1008, (Exception)ex);
        }
    }
    
    public final void f(final l2h l2h) {
        final zg4 u0 = this.U0;
        if (u0.h != null) {
            final int s0 = this.S0;
            final isj z0 = this.Z0;
            int size;
            if (z0 != null) {
                size = z0.r.size();
            }
            else {
                size = 1;
            }
            final int max = Math.max(this.V0, 0);
            final isj z2 = this.Z0;
            int v;
            if (z2 != null) {
                v = z2.v;
            }
            else {
                v = 0;
            }
            final int max2 = Math.max(this.W0, 0);
            final ldp$a ldp$a = new ldp$a();
            ldp$a.a(ldp.R0, (Object)s0);
            ldp$a.a(ldp.S0, (Object)size);
            ldp$a.a(ldp.T0, (Object)max);
            ldp$a.a(ldp.U0, (Object)v);
            ldp$a.a(ldp.V0, (Object)max2);
            if (ldp$a.a == null) {
                final StringBuilder f = ehk.f("Required field 'segment_size' was not present! Struct: ");
                f.append(ldp$a.toString());
                throw new IllegalArgumentException(f.toString());
            }
            if (ldp$a.b == null) {
                final StringBuilder f2 = ehk.f("Required field 'uploaded_segment_count' was not present! Struct: ");
                f2.append(ldp$a.toString());
                throw new IllegalArgumentException(f2.toString());
            }
            if (ldp$a.c == null) {
                final StringBuilder f3 = ehk.f("Required field 'initialize_retry_count' was not present! Struct: ");
                f3.append(ldp$a.toString());
                throw new IllegalArgumentException(f3.toString());
            }
            if (ldp$a.d == null) {
                final StringBuilder f4 = ehk.f("Required field 'append_retry_count' was not present! Struct: ");
                f4.append(ldp$a.toString());
                throw new IllegalArgumentException(f4.toString());
            }
            if (ldp$a.e == null) {
                final StringBuilder f5 = ehk.f("Required field 'finalize_retry_count' was not present! Struct: ");
                f5.append(ldp$a.toString());
                throw new IllegalArgumentException(f5.toString());
            }
            final Integer a = ldp$a.a;
            final Integer b = ldp$a.b;
            final Integer c = ldp$a.c;
            final Integer d = ldp$a.d;
            final Integer e = ldp$a.e;
            final ldp ldp = new ldp();
            if (a != null) {
                ldp.F0 = a;
                ldp.K0.set(0, true);
            }
            if (b != null) {
                ldp.G0 = b;
                ldp.K0.set(1, true);
            }
            if (c != null) {
                ldp.H0 = c;
                ldp.K0.set(2, true);
            }
            if (d != null) {
                ldp.I0 = d;
                ldp.K0.set(3, true);
            }
            if (e != null) {
                ldp.J0 = e;
                ldp.K0.set(4, true);
            }
            u0.k = ldp;
            final i2h j = u0.j;
            if (j != null) {
                final int ordinal = ((Enum)i2h.S0).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                j.I0 = ldp;
                            }
                        }
                        else {
                            j.H0 = (x0h)ldp;
                        }
                    }
                    else {
                        j.G0 = (f2h)ldp;
                    }
                }
                else {
                    j.F0 = (long)ldp;
                    j.J0.set(0, true);
                }
            }
            nda.a().b(((sn1)this).G0, (tlm)new yg4((ah4)((z4j)this.U0).e()));
        }
        super.f(l2h);
    }
    
    public final void h(final y5r y5r, final ptm<xsc<y5r, zbv>> ptm) {
        int a;
        if (y5r == null) {
            a = 2;
        }
        else {
            a = y5r.a;
        }
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    r9a.c(new m9a((Throwable)new IllegalStateException(rk0.B("Invalid SruState: ", a))));
                    ((sn1)this).g(this.L0, 1005, new Exception(rk0.B("Error: upload failed with invalid SruState: ", a)));
                }
                else {
                    Object o = null;
                    Label_0221: {
                        if (y5r != null) {
                            final u5r e = y5r.e;
                            if (e != null) {
                                final int a2 = e.a;
                                final StringBuilder sb = new StringBuilder();
                                sb.append(y5r.e.b);
                                sb.append(" : ");
                                sb.append(y5r.e.c);
                                sb.append(" Code : ");
                                sb.append(y5r.e.a);
                                final String string = sb.toString();
                                if (a2 != 1 && a2 != 3) {
                                    o = new Exception(string);
                                    break Label_0221;
                                }
                                o = new MediaUploadRejectionException(string);
                                break Label_0221;
                            }
                        }
                        o = new Exception("Error: upload failed with empty SRU response");
                    }
                    ((sn1)this).g(this.L0, 1005, (Exception)o);
                }
            }
            else {
                final int b1 = this.b1;
                final int n = (int)(y5r.d / 100.0 * (10000 - b1) + b1);
                if (n > b1) {
                    ((sn1)this).d(n);
                }
                final int c = y5r.c;
                final x16 y0 = new x16((Object)this, 9);
                this.Y0 = y0;
                this.R0.postDelayed((Runnable)y0, TimeUnit.SECONDS.toMillis(Math.max(c, 0)));
            }
        }
        else {
            ((sn1)this).d(10000);
            this.j((xsc<y5r, zbv>)ptm.d());
        }
    }
    
    public final String i() {
        String s;
        if (this.Q0) {
            s = "binary_async";
        }
        else {
            s = "upload";
        }
        return s;
    }
    
    public final void j(final xsc<y5r, zbv> xsc) {
        this.f(new l2h((xsc)xsc, this.L0, this.M0));
    }
}
