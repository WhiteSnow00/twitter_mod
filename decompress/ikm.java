import android.os.Parcelable;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikm extends xi1
{
    public ikm() {
    }
    
    public ikm(final Intent intent) {
        super(intent);
    }
    
    public final ikm a(final bo6 bo6, final String s, final baa baa) {
        this.j(bo6);
        this.s("appealtweet");
        this.u(s);
        this.v(bo6.G());
        vba b;
        if (baa == null) {
            b = null;
        }
        else {
            b = vba.Companion.b(baa, "", "");
        }
        this.i(b);
        return this;
    }
    
    public final ikm b(final bo6 bo6, final baa baa) {
        this.j(bo6);
        this.s("reportadcreative");
        if (baa != null) {
            this.i(vba.Companion.b(baa, "", ""));
        }
        this.v(bo6.D());
        final hwv y0 = bo6.D0.Y0;
        if (y0 != null) {
            super.mIntent.putExtra("reported_ad_creative_id", y0.d);
        }
        return this;
    }
    
    public final ikm c(final bo6 bo6) {
        this.j(bo6);
        super.mIntent.putExtra("status_id", bo6.D());
        return this;
    }
    
    public final ikm d(final bo6 bo6, final baa baa) {
        this.c(bo6);
        vba b;
        if (baa == null) {
            b = null;
        }
        else {
            b = vba.Companion.b(baa, "", "");
        }
        this.i(b);
        return this;
    }
    
    public final Long e() {
        return super.mIntent.getLongExtra("reported_list_id", 0L);
    }
    
    public final Long f() {
        return super.mIntent.getLongExtra("reported_at_timecode", 0L);
    }
    
    public final String g() {
        final String stringExtra = super.mIntent.getStringExtra("source");
        String s;
        if (this.h() > 0L) {
            s = "reporttweet";
        }
        else {
            s = "reportprofile";
        }
        String s2 = stringExtra;
        if (stringExtra == null) {
            s2 = s;
        }
        return s2;
    }
    
    public final long h() {
        return super.mIntent.getLongExtra("status_id", 0L);
    }
    
    public final ikm i(final vba vba) {
        if (vba != null) {
            super.mIntent.putExtra("client_location", klp.e((Object)aaa.b(vba.a, vba.b, vba.c), (rlp)baa.b));
        }
        return this;
    }
    
    public final void j(final bo6 bo6) {
        this.t(bo6.v());
        this.n(bo6.n());
        this.o(bo6.N2());
        this.r();
        super.mIntent.putExtra("is_media", bo6.R() || bo6.c0() || bo6.S());
        final h0p p = bo6.P0;
        if (p != null) {
            final String s = p.s;
            if (s != null) {
                super.mIntent.putExtra("conversation_section", s);
            }
        }
        super.mIntent.putExtra("promoted_content", klp.e((Object)bo6.E0, (rlp)uil.n));
        super.mIntent.putExtra("tweet", (Parcelable)bo6);
    }
    
    public final ikm k(final String s) {
        super.mIntent.putExtra("community_id", s);
        return this;
    }
    
    public final ikm l(final String s) {
        super.mIntent.putExtra("community_limited_actions", s);
        return this;
    }
    
    public final ikm m(final String s) {
        super.mIntent.putExtra("dm_conversation_id", s);
        return this;
    }
    
    public final ikm n(final int n) {
        super.mIntent.putExtra("friendship", n);
        return this;
    }
    
    public final ikm o(final boolean b) {
        super.mIntent.putExtra("is_promoted", b);
        return this;
    }
    
    public final ikm p(final long n) {
        super.mIntent.putExtra("reported_list_id", n);
        return this;
    }
    
    public final ikm q(final long n) {
        super.mIntent.putExtra("reported_user_id", n);
        return this;
    }
    
    public final ikm r() {
        super.mIntent.putExtra("handle_api_requests", true);
        return this;
    }
    
    public final ikm s(final String s) {
        super.mIntent.putExtra("source", s);
        return this;
    }
    
    public final ikm t(final long n) {
        super.mIntent.putExtra("spammer_id", n);
        return this;
    }
    
    public final ikm u(final String s) {
        super.mIntent.putExtra("title", s);
        return this;
    }
    
    public final ikm v(final long n) {
        super.mIntent.putExtra("status_id", n);
        return this;
    }
}
