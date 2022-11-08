import java.util.HashMap;
import android.database.sqlite.SQLiteException;
import com.twitter.database.schema.TwitterSchema;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q8g extends i1v<pmi>
{
    public final aav i1;
    public final jil j1;
    public final long k1;
    public final String l1;
    public final String m1;
    public final boolean n1;
    public final boolean o1;
    public final String p1;
    public final String q1;
    public final String r1;
    public final String s1;
    public final String t1;
    public final long u1;
    public final String v1;
    
    public q8g(final q8g.q8g$a q8g$a) {
        super(q8g$a.a, 0);
        ((cw0)this).N0 = false;
        this.i1 = q8g$a.c;
        this.j1 = q8g$a.b;
        this.k1 = q8g$a.d;
        this.l1 = q8g$a.e;
        this.m1 = q8g$a.f;
        this.n1 = q8g$a.g;
        this.o1 = q8g$a.h;
        this.p1 = q8g$a.i;
        this.q1 = q8g$a.j;
        this.r1 = q8g$a.k;
        this.s1 = q8g$a.l;
        this.t1 = q8g$a.m;
        this.u1 = q8g$a.n;
        this.v1 = q8g$a.o;
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.F0;
        final int a = w4j.a;
        ((qrc.a)rbv).n("/1.1/promoted_content/log.json", "/");
        final String m1 = this.m1;
        if (m1 != null) {
            ((qrc.a)rbv).d("impression_id", m1);
        }
        final long k1 = this.k1;
        if (k1 > 0L) {
            ((qrc.a)rbv).c("promoted_trend_id", k1);
        }
        if (this.n1) {
            ((qrc.a)rbv).f("earned", true);
        }
        ((qrc.a)rbv).d("event", this.j1.C0);
        if (pjr.g((CharSequence)this.l1)) {
            ((qrc.a)rbv).d("url", this.l1);
        }
        if (pjr.g((CharSequence)this.p1)) {
            ((qrc.a)rbv).d("video_uuid", this.p1);
        }
        if (pjr.g((CharSequence)this.q1)) {
            ((qrc.a)rbv).d("video_type", this.q1);
        }
        if (pjr.g((CharSequence)this.r1)) {
            ((qrc.a)rbv).d("card_event", this.r1);
        }
        if (pjr.g((CharSequence)this.s1)) {
            ((qrc.a)rbv).d("uc_event", this.s1);
        }
        if (pjr.g((CharSequence)this.t1)) {
            ((qrc.a)rbv).d("engagement_metadata", this.t1);
        }
        final long u1 = this.u1;
        if (u1 != 0L) {
            ((qrc.a)rbv).c("epoch_ms", u1);
        }
        if (pjr.g((CharSequence)this.v1)) {
            ((qrc.a)rbv).d("tag", this.v1);
        }
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)new mhe();
    }
    
    @Override
    public final tsc<pmi, pav> i0(final tsc<pmi, pav> tsc) {
        final lum lum = new lum((TwitterSchema)((rp1)this.i1).T());
        if (!tsc.b) {
            final jil j1 = this.j1;
            String m1 = this.m1;
            final long k1 = this.k1;
            final String l1 = this.l1;
            final boolean n1 = this.n1;
            final String p = this.p1;
            final String q1 = this.q1;
            final String r1 = this.r1;
            final String t1 = this.t1;
            final long u1 = this.u1;
            final String s1 = this.s1;
            try {
                lum.b(false, j1, m1, k1, l1, n1, p, q1, r1, t1, u1, s1);
            }
            catch (final SQLiteException ex) {
                final z8a z8a = new z8a((Throwable)ex);
                ((HashMap<String, jil>)z8a.a).put("event", j1);
                if (m1 == null) {
                    m1 = "";
                }
                ((HashMap<String, String>)z8a.a).put("impression_id", m1);
                ((HashMap<String, Long>)z8a.a).put("trend_id", Long.valueOf(k1));
                ((HashMap<String, Boolean>)z8a.a).put("is_earned", Boolean.valueOf(n1));
                e9a.c(z8a);
            }
        }
        else if (this.o1) {
            lum.b(true, this.j1, this.m1, this.k1, this.l1, this.n1, this.p1, this.q1, this.r1, this.t1, this.u1, this.s1);
        }
        bl0.a().t();
        return tsc;
    }
}
