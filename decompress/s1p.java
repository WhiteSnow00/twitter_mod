import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s1p
{
    public static final rlp<s1p> i;
    public final Integer a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;
    public String f;
    public dvg g;
    public long h;
    
    static {
        s1p.i = new s1p.s1p$b();
    }
    
    public s1p(final Integer a, final String b, final long c, final int d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = null;
        this.g = null;
        this.h = 0L;
    }
    
    public s1p(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.f = a.f;
        this.g = a.g;
        this.h = a.h;
    }
    
    public final void a(final afe afe) throws IOException {
        afe.q0();
        final Integer a = this.a;
        if (a != null) {
            afe.T("photo_count", (int)a);
        }
        if (ikr.g((CharSequence)this.b)) {
            afe.t0("content_id", this.b);
        }
        final long c = this.c;
        if (c > 0L) {
            afe.V("publisher_id", c);
        }
        final int d = this.d;
        if (d > 0) {
            afe.T("media_type", d);
        }
        afe.e("dynamic_ads", this.e);
        if (ikr.g((CharSequence)this.f)) {
            afe.t0("media_asset_url", this.f);
        }
        if (this.g != null) {
            afe.h0("media_error");
            if (ikr.g((CharSequence)this.g.D0)) {
                afe.t0("message", this.g.D0);
            }
            if (ikr.g((CharSequence)this.g.E0)) {
                afe.t0("category", this.g.E0);
            }
            afe.e("is_fatal", this.g.F0);
            final int g0 = this.g.G0;
            if (g0 > 0) {
                afe.T("retry_count", g0);
            }
            afe.h();
        }
        final long h = this.h;
        if (h > 0L) {
            afe.V("media_timecode_millis", h);
        }
        afe.h();
    }
    
    public static final class a extends n4j<s1p>
    {
        public Integer a;
        public String b;
        public long c;
        public int d;
        public boolean e;
        public String f;
        public dvg g;
        public long h;
        
        public final Object i() {
            return new s1p(this);
        }
    }
}
