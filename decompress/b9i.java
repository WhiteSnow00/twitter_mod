import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b9i implements z8i
{
    public final kd5 a;
    public final y9u b;
    public final owr c;
    public final cgv d;
    public final mgv e;
    
    public b9i(final kd5 a, final y9u b, final owr c, final xbm xbm, final cgv d, final mgv e) {
        czd.f((Object)a, "communitiesRepository");
        czd.f((Object)b, "trustedFriendsRepository");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)e, "twitterUserManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        xbm.i((oj)new rrw(new wc6(), 3));
    }
    
    @Override
    public final h5j<List<y8i>> a(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "userIdentifier");
        final psb b = jub.b((htb)new a9i(this, userIdentifier));
        final int d0 = e9b.D0;
        final h5j p = this.c.a().w((psb)new v55((qsb)d9i.D0, 19)).P();
        final ynj b2 = ynj.b;
        final int a = c5j.a;
        final h5j startWith = p.startWith((Object)b2);
        final List e = this.a.e();
        eaq eaq;
        if ((e.isEmpty() ^ true) && czd.a((Object)this.d.f(), (Object)userIdentifier)) {
            eaq = eaq.v((Object)e);
        }
        else {
            eaq = this.a.H(new rb5(0, userIdentifier, 3));
        }
        final h5j startWith2 = eaq.w((psb)new mg5((qsb)c9i.D0, 23)).P().startWith((Object)f2a.D0);
        h5j h5j;
        if (h6u.Companion.b(userIdentifier)) {
            final ynj ynj = new ynj((Object)new y8i$d(0L, 0, (String)null, 7, (rf8)null));
            final y9u b3 = this.b;
            final int a2 = x9u.a;
            h5j = b3.g(false).map((psb)new ld5((qsb)new e9i(this, userIdentifier, ynj), 22));
            czd.e((Object)h5j, "private fun getTrustedFr\u2026ional.absent())\n        }");
        }
        else {
            h5j = h5j.just((Object)b2);
            czd.e((Object)h5j, "{\n            Observable\u2026ional.absent())\n        }");
        }
        final h5j combineLatestDelayError = h5j.combineLatestDelayError(b, d0, new taj[] { (taj)startWith, (taj)startWith2, (taj)h5j.startWith((Object)b2) });
        czd.e((Object)combineLatestDelayError, "combineLatestDelayError(\u2026ional.absent())\n        )");
        return (h5j<List<y8i>>)combineLatestDelayError;
    }
}
