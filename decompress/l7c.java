import java.util.Iterator;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l7c extends i1v<pmi>
{
    public static final l7c.l7c$a Companion;
    public final Context i1;
    public final vo6 j1;
    public final boolean k1;
    public long l1;
    public long m1;
    public long n1;
    public boolean o1;
    public boolean p1;
    public long q1;
    public long r1;
    public final dw0 s1;
    
    static {
        Companion = new l7c.l7c$a();
    }
    
    public l7c(final Context i1, final UserIdentifier userIdentifier, final vo6 j1, final Long n, final Long n2, final dw0 dw0, final boolean k1) {
        zzd.f((Object)i1, "context");
        zzd.f((Object)userIdentifier, "owner");
        super(userIdentifier, 0);
        this.i1 = i1;
        this.j1 = j1;
        this.k1 = k1;
        long l1;
        if (n != null) {
            l1 = n;
        }
        else {
            Long value;
            if (j1 != null) {
                value = j1.G();
            }
            else {
                value = null;
            }
            if (value == null) {
                throw new IllegalStateException("Tweet ID should not be null");
            }
            l1 = value;
        }
        this.l1 = l1;
        long m1;
        if (j1 != null) {
            m1 = j1.C0.O0;
        }
        else if (n2 != null) {
            m1 = n2;
        }
        else {
            m1 = 0L;
        }
        this.m1 = m1;
        this.n1 = userIdentifier.getId();
        dw0 a = dw0;
        if (dw0 == null) {
            a = dw0.a();
            zzd.e((Object)a, "get()");
        }
        this.s1 = a;
        if (j1 != null) {
            this.o1 = j1.C0.E0;
            this.p1 = j1.O2();
            this.q1 = j1.D();
            this.r1 = j1.w();
        }
    }
    
    @Override
    public final tsc<pmi, pav> b() {
        if (this.o1) {
            final Context i1 = this.i1;
            final UserIdentifier p0 = super.P0;
            zzd.e((Object)p0, "owner");
            final ro8 ro8 = new ro8(i1, p0, this.q1, this.r1, this.p1, null, 32, null);
            final tsc r = ((ksc)ro8).R();
            zzd.e((Object)r, "request.executeImmediately()");
            ro8.o0((tsc<?, ?>)r);
            if (!zi8.H(r)) {
                final int c = r.c;
                String e;
                if ((e = r.e) == null) {
                    e = "Unretweet error message is empty.";
                }
                return (tsc<pmi, pav>)tsc.c(c, e);
            }
        }
        return super.b();
    }
    
    @Override
    public final qrc f0() {
        final o7c e = q1a.e("delete_tweet");
        long n;
        if (this.o1) {
            n = this.q1;
        }
        else {
            n = this.l1;
        }
        e.p("tweet_id", n);
        return (qrc)e.e();
    }
    
    @Override
    public final wsc g0() {
        return (wsc)new mhe();
    }
    
    @Override
    public final tsc<pmi, pav> i0(final tsc<pmi, pav> tsc) {
        super.i0(tsc);
        final aav d2 = aav.d2(super.P0);
        zzd.e((Object)d2, "get(owner)");
        final hn6 z = this.Z(this.i1);
        boolean b = false;
        Label_0081: {
            if (this.j1 != null) {
                final cv9 a = cv9.Companion.a();
                final mg3 c0 = this.j1.C0;
                zzd.e((Object)c0, "tweet.canonicalTweet");
                if (a.k(c0)) {
                    b = true;
                    break Label_0081;
                }
            }
            b = false;
        }
        tsc tsc2;
        if (zi8.H(tsc)) {
            List list;
            if (b && this.j1 != null) {
                final cv9 a2 = cv9.Companion.a();
                final mg3 c2 = this.j1.C0;
                zzd.e((Object)c2, "tweet.canonicalTweet");
                list = a2.q(c2);
            }
            else {
                list = tdy.u0((Object)this.l1);
            }
            this.o0(z, d2, list);
            tsc2 = tsc;
            if (this.m1 > 0L) {
                this.s1.d((cw0<Object>)new bpu(this.i1, super.P0, this.m1));
                tsc2 = tsc;
            }
        }
        else {
            tsc2 = tsc;
            if (tsc.c == 404) {
                long n;
                if (this.o1) {
                    n = this.q1;
                }
                else {
                    n = this.l1;
                }
                if (d2.n4(n)) {
                    List list2;
                    if (b && this.j1 != null) {
                        final cv9 a3 = cv9.Companion.a();
                        final mg3 c3 = this.j1.C0;
                        zzd.e((Object)c3, "tweet.canonicalTweet");
                        list2 = a3.q(c3);
                    }
                    else {
                        list2 = tdy.u0((Object)this.l1);
                    }
                    this.o0(z, d2, list2);
                    tsc2 = new tsc();
                }
                else {
                    tsc2 = tsc;
                    if (d2.b4(this.l1, this.n1)) {
                        if (this.j1 != null && b) {
                            final cv9 a4 = cv9.Companion.a();
                            final mg3 c4 = this.j1.C0;
                            zzd.e((Object)c4, "tweet.canonicalTweet");
                            final Iterator iterator = a4.q(c4).iterator();
                            while (iterator.hasNext()) {
                                d2.b4(((Number)iterator.next()).longValue(), this.n1);
                            }
                        }
                        tsc2 = new tsc();
                    }
                }
            }
        }
        return (tsc<pmi, pav>)tsc2;
    }
    
    public final void o0(final hn6 hn6, final aav aav, List<Long> iterator) {
        iterator = ((Iterable<Object>)iterator).iterator();
        while (iterator.hasNext()) {
            final long longValue = iterator.next().longValue();
            final long n1 = this.n1;
            final boolean k1 = this.k1;
            final StringBuilder d = c0.D("Removing status: ", longValue, ", owned by: ");
            d.append(n1);
            d.append(", delete convo: ");
            d.append(k1);
            cag.a("DatabaseHelper", d.toString());
            final tyr h2 = ((tk1)aav).H2();
            h2.H0();
            try {
                final String value = String.valueOf(n1);
                final int b0 = aav.B0("timeline_owner_id=? AND sender_user_id=? AND timeline_instance_data_id=?", "owner_id=? AND sender_id=? AND ref_id=?", new String[] { value, value, String.valueOf(longValue) }, k1);
                h2.A();
                h2.B();
                if (b0 + 0 > 0) {
                    hn6.a(gfv.f);
                    hn6.a(gfv.e);
                }
                hn6.b();
                continue;
            }
            finally {
                h2.B();
            }
            break;
        }
    }
}
