import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a9i implements y8i
{
    public final ee5 a;
    public final i9u b;
    public final zvr c;
    public final hfv d;
    public final qfv e;
    
    public a9i(final ee5 a, final i9u b, final zvr c, final ibm ibm, final hfv d, final qfv e) {
        zzd.f((Object)a, "communitiesRepository");
        zzd.f((Object)b, "trustedFriendsRepository");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)e, "twitterUserManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        ibm.i((rj)new wak(new rd6(), 3));
    }
    
    public final b5j<List<x8i>> a(final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        final qtb b = jvb.b((iub)new z8i(this, userIdentifier));
        final int c0 = hab.C0;
        final b5j p = this.c.a().w((qtb)new n86((rtb)c9i.C0, 18)).P();
        final snj b2 = snj.b;
        final int a = w4j.a;
        final b5j startWith = p.startWith((Object)b2);
        final List e = this.a.e();
        n9q n9q;
        if ((e.isEmpty() ^ true) && zzd.a((Object)this.d.f(), (Object)userIdentifier)) {
            n9q = n9q.v((Object)e);
        }
        else {
            n9q = this.a.H(new lc5(0, userIdentifier, 3));
        }
        final b5j startWith2 = n9q.w((qtb)new qo((rtb)b9i.C0, 25)).P().startWith((Object)v2a.C0);
        b5j b5j;
        if (s5u.Companion.b(userIdentifier)) {
            final snj snj = new snj((Object)new x8i$d(0L, 0, (String)null, 7, (hg8)null));
            final i9u b3 = this.b;
            final int a2 = h9u.a;
            b5j = b3.g(false).map((qtb)new wj4((rtb)new d9i(this, userIdentifier, (snj<x8i$d>)snj), 18));
            zzd.e((Object)b5j, "private fun getTrustedFr\u2026ional.absent())\n        }");
        }
        else {
            b5j = b5j.just((Object)b2);
            zzd.e((Object)b5j, "{\n            Observable\u2026ional.absent())\n        }");
        }
        final b5j combineLatestDelayError = b5j.combineLatestDelayError(b, c0, new naj[] { (naj)startWith, (naj)startWith2, (naj)b5j.startWith((Object)b2) });
        zzd.e((Object)combineLatestDelayError, "combineLatestDelayError(\u2026ional.absent())\n        )");
        return (b5j<List<x8i>>)combineLatestDelayError;
    }
}
