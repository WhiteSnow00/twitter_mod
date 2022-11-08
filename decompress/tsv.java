import java.util.Iterator;
import android.view.View$OnClickListener;
import java.util.UUID;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tsv implements rsv
{
    public static final tsv.tsv$a Companion;
    public final egd a;
    public final d4c b;
    public final chp c;
    public final psc d;
    public final osv e;
    public final xuu f;
    public final qvo g;
    public final qvo h;
    public final ibm i;
    public w8j j;
    public final rd6 k;
    
    static {
        Companion = new tsv.tsv$a();
    }
    
    public tsv(final egd a, final d4c b, final chp c, final psc d, final osv e, final xuu f, final qvo g, final qvo h, final ibm i) {
        zzd.f((Object)a, "inAppMessageManager");
        zzd.f((Object)b, "globalActivityStarter");
        zzd.f((Object)c, "sendTweetDelegate");
        zzd.f((Object)d, "httpRequestController");
        zzd.f((Object)e, "undoNudgeCache");
        zzd.f((Object)f, "tweetUploadTracker");
        zzd.f((Object)g, "ioScheduler");
        zzd.f((Object)h, "mainScheduler");
        zzd.f((Object)i, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = new rd6();
        i.i((rj)new ut1((Object)this, 24));
    }
    
    public final void a(final UserIdentifier userIdentifier, final ea9 ea9) {
        final ra9 u0 = ra9.u0(userIdentifier);
        zzd.e((Object)u0, "get(userIdentifier)");
        this.i.i((rj)new svu(b5j.fromCallable((Callable)new b03((Object)this, (Object)ea9, (Object)u0, 1)).subscribeOn(this.g).observeOn(this.h).subscribe((fk6)new c5l((rtb)new tsv$b(this, userIdentifier), 19)), 13));
    }
    
    public final void b(final UserIdentifier userIdentifier, ea9 ea9) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        final ra9 u0 = ra9.u0(userIdentifier);
        long n = ea9.b;
        if (n == 0L) {
            n = ea9.a;
        }
        final i4e w0 = u0.w0(n);
        ea9 = (ea9)ijf.u((Iterable)w0);
        zzd.e((Object)ea9, "build(draftTweets)");
        while (true) {
            try {
                w0.close();
                final ArrayList<Long> list = new ArrayList<Long>(kr4.h1((Iterable)ea9, 10));
                ea9 = (ea9)((Iterable<Object>)ea9).iterator();
                while (((Iterator)ea9).hasNext()) {
                    list.add(((Iterator<ea9>)ea9).next().a);
                }
                this.e(userIdentifier, list);
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void c(final ea9 ea9, final List<Long> list, final hfv hfv) {
        zzd.f((Object)list, "draftIds");
        if (!zzd.a((Object)UserIdentifier.Companion.c(), (Object)hfv.f())) {
            final UserIdentifier f = hfv.f();
            zzd.e((Object)f, "draftAuthor.userIdentifier");
            this.e(f, list);
            return;
        }
        final poa poa = new poa();
        final vbq vbq = new vbq();
        final UserIdentifier f2 = hfv.f();
        zzd.e((Object)f2, "draftAuthor.userIdentifier");
        String z;
        if ((z = ea9.x) == null) {
            z = UUID.randomUUID().toString();
        }
        zzd.e((Object)z, "draftTweet.nudgeTracking\u2026D.randomUUID().toString()");
        final n9q i = ((n9q)new taq((ubq)n9q.t((Callable)new vsa(f2, ea9, 7)), (qtb)new sbn((rtb)new usv(ea9, this, f2, z), 23))).I(this.g);
        final ea9.b b = new ea9.b();
        b.p(ea9);
        b.z = z;
        final ea9 ea10 = (ea9)b.e();
        final ijf h = ijf.H();
        for (final j99 j99 : ea10.e) {
            if (j99.D0 == 0) {
                h.p((Object)j99.b(1));
            }
        }
        final egd a = this.a;
        final UserIdentifier f3 = hfv.f();
        zzd.e((Object)f3, "draftAuthor.userIdentifier");
        String d;
        if ((d = ea10.d) == null) {
            d = "";
        }
        final w8j a2 = a.a((zfd)new qsv(f3, d, (View$OnClickListener)new hc2((Object)hfv, (Object)ea9, (Object)this, 7), (n9q)vbq, (List)((h4j)h).e(), (nfd$c)new nfd$c$d(4000L)));
        final b5j ofType = a2.a().ofType((Class)bgd$e.class);
        zzd.b((Object)ofType, "ofType(R::class.java)");
        final m29 m29;
        m29.c(ofType.doOnComplete((rj)new xsv(m29 = new m29())).subscribe((fk6)new f$m4((rtb)new ysv(poa, ea9))));
        final b5j ofType2 = a2.a().ofType((Class)bgd$a.class);
        zzd.b((Object)ofType2, "ofType(R::class.java)");
        final m29 m30;
        m30.c(ofType2.doOnComplete((rj)new zsv(m30 = new m29())).subscribe((fk6)new f$m4((rtb)new atv(poa, ea9))));
        final b5j ofType3 = a2.a().ofType((Class)bgd$d.class);
        zzd.b((Object)ofType3, "ofType(R::class.java)");
        final m29 m31;
        m31.c(ofType3.doOnComplete((rj)new btv(m31 = new m29())).subscribe((fk6)new f$m4((rtb)new ctv(poa, ea9))));
        final b5j ofType4 = a2.a().ofType((Class)bgd$b.class);
        zzd.b((Object)ofType4, "ofType(R::class.java)");
        final m29 m32;
        m32.c(ofType4.doOnComplete((rj)new dtv(m32 = new m29())).subscribe((fk6)new f$m4((rtb)new etv(poa, ea9))));
        this.j = a2;
        this.e.b(ea9.a, a2);
        this.i.i((rj)new hu1(i.I(this.g).G((fk6)new aqi((rtb)new tsv$c(vbq), 27), (fk6)new zgw((rtb)tsv$d.C0, 23)), 12));
    }
    
    public final void d(final long n) {
        final w8j c = this.e.c(n);
        if (c != null) {
            c.cancel();
        }
        this.e.a(n);
    }
    
    public final void e(final UserIdentifier userIdentifier, final List<Long> list) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        zzd.f((Object)list, "draftIds");
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final long longValue = ((Number)iterator.next()).longValue();
            this.e.a(longValue);
            final lnr.a companion = lnr.Companion;
            final kba a = kba.a;
            lnr.a.a(companion, kba.d, longValue, cor.Companion.a(), null, null, null, null, null, null, null, null, 1048568);
            this.k.a(this.f.e(longValue).filter((ptk)new di((rtb)vsv.C0, 17)).subscribe((fk6)new b5p((rtb)new wsv(longValue), 3)));
        }
        if (list.isEmpty() ^ true) {
            this.c.a(userIdentifier, list);
        }
    }
}
