import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u9i implements s9i
{
    public final oe5 a;
    public final rau b;
    public final nxr c;
    public final qgv d;
    public final zgv e;
    
    public u9i(final oe5 a, final rau b, final nxr c, final kcm kcm, final qgv d, final zgv e) {
        e0e.f((Object)a, "communitiesRepository");
        e0e.f((Object)b, "trustedFriendsRepository");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)e, "twitterUserManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        kcm.i((sj)new gsw(new de6(), 3));
    }
    
    public final t5j<List<r9i>> a(final UserIdentifier userIdentifier) {
        e0e.f((Object)userIdentifier, "userIdentifier");
        final rtb b = lvb.b((jub)new t9i(this, userIdentifier));
        final int f0 = fab.F0;
        final t5j p = this.c.a().w((rtb)new qe5((stb)w9i.F0, 20)).P();
        final noj b2 = noj.b;
        final int a = o5j.a;
        final t5j startWith = p.startWith((Object)b2);
        final List e = this.a.e();
        bbq bbq;
        if ((e.isEmpty() ^ true) && e0e.a((Object)this.d.f(), (Object)userIdentifier)) {
            bbq = bbq.v((Object)e);
        }
        else {
            bbq = this.a.H(new wc5(0, userIdentifier, 3));
        }
        final t5j startWith2 = bbq.w((rtb)new yw4((stb)v9i.F0, 27)).P().startWith((Object)h3a.F0);
        t5j t5j;
        if (a7u.Companion.b(userIdentifier)) {
            final noj noj = new noj((Object)new r9i.d(0L, 0, null, 7, null));
            final rau b3 = this.b;
            final int a2 = qau.a;
            t5j = b3.g(false).map((rtb)new mr0((stb)new x9i(this, userIdentifier, noj), 20));
            e0e.e((Object)t5j, "private fun getTrustedFr\u2026ional.absent())\n        }");
        }
        else {
            t5j = t5j.just((Object)b2);
            e0e.e((Object)t5j, "{\n            Observable\u2026ional.absent())\n        }");
        }
        final t5j combineLatestDelayError = t5j.combineLatestDelayError(b, f0, new fbj[] { (fbj)startWith, (fbj)startWith2, (fbj)t5j.startWith((Object)b2) });
        e0e.e((Object)combineLatestDelayError, "combineLatestDelayError(\u2026ional.absent())\n        )");
        return (t5j<List<r9i>>)combineLatestDelayError;
    }
}
