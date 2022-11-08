import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c1p
{
    public static final alp<c1p> i;
    public final Integer a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;
    public String f;
    public dvg g;
    public long h;
    
    static {
        c1p.i = new c1p.c1p$b();
    }
    
    public c1p(final c1p.c1p$a c1p$a) {
        this.a = c1p$a.a;
        this.b = c1p$a.b;
        this.c = c1p$a.c;
        this.d = c1p$a.d;
        this.e = c1p$a.e;
        this.f = c1p$a.f;
        this.g = c1p$a.g;
        this.h = c1p$a.h;
    }
    
    public c1p(final Integer a, final String b, final long c, final int d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = null;
        this.g = null;
        this.h = 0L;
    }
    
    public final void a(final tfe tfe) throws IOException {
        tfe.r0();
        final Integer a = this.a;
        if (a != null) {
            tfe.T("photo_count", a);
        }
        if (pjr.g((CharSequence)this.b)) {
            tfe.u0("content_id", this.b);
        }
        final long c = this.c;
        if (c > 0L) {
            tfe.W("publisher_id", c);
        }
        final int d = this.d;
        if (d > 0) {
            tfe.T("media_type", d);
        }
        tfe.e("dynamic_ads", this.e);
        if (pjr.g((CharSequence)this.f)) {
            tfe.u0("media_asset_url", this.f);
        }
        if (this.g != null) {
            tfe.i0("media_error");
            if (pjr.g((CharSequence)this.g.C0)) {
                tfe.u0("message", this.g.C0);
            }
            if (pjr.g((CharSequence)this.g.D0)) {
                tfe.u0("category", this.g.D0);
            }
            tfe.e("is_fatal", this.g.E0);
            final int f0 = this.g.F0;
            if (f0 > 0) {
                tfe.T("retry_count", f0);
            }
            tfe.h();
        }
        final long h = this.h;
        if (h > 0L) {
            tfe.W("media_timecode_millis", h);
        }
        tfe.h();
    }
}
