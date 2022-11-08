import android.accounts.NetworkErrorException;
import java.util.Iterator;
import android.database.ContentObserver;
import java.util.Collection;
import java.util.Collections;
import android.net.Uri;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import android.content.ContentResolver;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o52 implements n52
{
    public final UserIdentifier a;
    public final sr9 b;
    public final h47 c;
    public final yr d;
    public final vdm e;
    public final vn8 f;
    public final xhb g;
    public final wts h;
    public final qvo i;
    public final qvo j;
    public final ContentResolver k;
    public List<b52> l;
    public final aws m;
    
    public o52(final UserIdentifier a, final sr9 b, final h47 c, final yr d, final vdm e, final vn8 f, final xhb g, final wts h, final qvo i, final qvo j, final ContentResolver k) {
        zzd.f((Object)a, "currentUser");
        zzd.f((Object)b, "editFolderDataSource");
        zzd.f((Object)c, "createFolderDataSource");
        zzd.f((Object)d, "addToFolderDataSource");
        zzd.f((Object)e, "removeFromFolderNetworkDataSource");
        zzd.f((Object)f, "deleteFolderDataSource");
        zzd.f((Object)h, "timelineDbHelper");
        zzd.f((Object)i, "ioScheduler");
        zzd.f((Object)j, "mainScheduler");
        zzd.f((Object)k, "contentResolver");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = new ArrayList();
        final aws$a aws$a = new aws$a();
        aws$a.c = a.getId();
        aws$a.a = 30;
        this.m = (aws)((h4j)aws$a).e();
    }
    
    public static final void k(final o52 o52, final aws aws) {
        final ContentResolver k = o52.k;
        final HashSet set = new HashSet();
        final Uri a = aws.a();
        synchronized (set) {
            Collections.addAll(set, a);
            monitorexit(set);
            xw0.d(o52.j, (rj)new isf((Object)o52, (Object)aws, 4));
            final HashSet set2 = new HashSet();
            synchronized (set) {
                set2.addAll(set);
                set.clear();
                monitorexit(set);
                final Iterator iterator = set2.iterator();
                while (iterator.hasNext()) {
                    k.notifyChange((Uri)iterator.next(), (ContentObserver)null);
                }
            }
        }
    }
    
    public final n9q<pmi> a(final String s) {
        zzd.f((Object)s, "folderId");
        return (n9q<pmi>)new haq((ubq)this.l((n9q<vrm<Object, pav>>)((omm)this.f).S((Object)new wn8(this.a, s))), (fk6)new xt1((rtb)new rtb<pmi, oyv>() {
            public final /* synthetic */ o52 C0;
            
            public final Object invoke(final Object o) {
                final pmi pmi = (pmi)o;
                mr4.r1((List)this.C0.l, (rtb)new s52(s));
                return oyv.a;
            }
        }, 8));
    }
    
    public final n9q<List<b52>> b() {
        return (n9q<List<b52>>)this.l((n9q<vrm<Object, pav>>)((omm)this.g).S((Object)new yhb(this.a, (String)null, true, 2))).w((qtb)new di((rtb)new rtb<List<? extends b52>, List<? extends b52>>() {
            public final /* synthetic */ o52 C0;
            
            public final Object invoke(final Object o) {
                final List list = (List)o;
                zzd.f((Object)list, "newItems");
                this.C0.l.addAll(list);
                return this.C0.l;
            }
        }, 14));
    }
    
    public final n9q<pmi> c(final String s, final String s2, final String s3) {
        zzd.f((Object)s, "folderId");
        zzd.f((Object)s3, "createTimelineTag");
        return (n9q<pmi>)new haq((ubq)this.l((n9q<vrm<Object, pav>>)((omm)this.e).S((Object)new wdm(this.a, s, s2)).y(this.i)), (fk6)new ug((rtb)new rtb<pmi, oyv>() {
            public final /* synthetic */ o52 D0;
            
            public final Object invoke(final Object o) {
                final pmi pmi = (pmi)o;
                final String c = l7k.c("tweet-", s2);
                final aws$a aws$a = new aws$a();
                aws$a.c = this.D0.a.getId();
                aws$a.b = s3;
                aws$a.a = 53;
                final aws aws = (aws)((h4j)aws$a).e();
                this.D0.h.c(aws, (Iterable)rqu.K((Object)c));
                o52.k(this.D0, aws);
                return oyv.a;
            }
        }, 16));
    }
    
    public final n9q<List<b52>> d(final String s) {
        Object v;
        if ((this.l.isEmpty() ^ true) && s == null) {
            v = n9q.v((Object)this.l);
        }
        else {
            v = new oaq((ubq)this.l((n9q<vrm<Object, pav>>)((omm)this.g).S((Object)new yhb(this.a, s, false, 4))), (fk6)new sna((rtb)new rtb<List<? extends b52>, oyv>() {
                public final /* synthetic */ o52 C0;
                
                public final Object invoke(final Object o) {
                    final List list = (List)o;
                    this.C0.l.clear();
                    final ArrayList l = this.C0.l;
                    zzd.e((Object)list, "it");
                    l.addAll(list);
                    return oyv.a;
                }
            }, 20));
        }
        return (n9q<List<b52>>)v;
    }
    
    public final b52 e(final String s) {
        zzd.f((Object)s, "folderId");
        for (final Object next : this.l) {
            if (zzd.a((Object)((b52)next).a, (Object)s)) {
                return (b52)next;
            }
        }
        return null;
    }
    
    public final n9q<b52> f(final String s, final String s2) {
        zzd.f((Object)s, "name");
        Object o;
        if (s2 != null) {
            o = new taq((ubq)((omm)this.c).S((Object)new i47(this.a, s)), (qtb)new nma((rtb)new rtb<vrm<b52, pav>, ubq<? extends b52>>() {
                public final /* synthetic */ o52 C0;
                
                public final Object invoke(final Object o) {
                    final vrm vrm = (vrm)o;
                    zzd.f((Object)vrm, "createResult");
                    if (vrm.d()) {
                        final ArrayList l = this.C0.l;
                        final Object c = vrm.c();
                        zzd.e(c, "createResult.success");
                        l.add(0, c);
                        final o52 c2 = this.C0;
                        return c2.l((n9q<vrm<Object, pav>>)c2.d.S((Object)new zr(c2.a, ((b52)vrm.c()).a, s2))).w((qtb)new nma((rtb)new q52(vrm), 17));
                    }
                    throw new NetworkErrorException(((pav)vrm.b()).e());
                }
            }, 16));
        }
        else {
            o = new haq((ubq)this.l((n9q<vrm<Object, pav>>)((omm)this.c).S((Object)new i47(this.a, s))), (fk6)new wt1((rtb)new rtb<b52, oyv>() {
                public final /* synthetic */ o52 C0;
                
                public final Object invoke(final Object o) {
                    final b52 b52 = (b52)o;
                    final ArrayList l = this.C0.l;
                    zzd.e((Object)b52, "it");
                    l.add(0, b52);
                    return oyv.a;
                }
            }, 13));
        }
        return (n9q<b52>)o;
    }
    
    public final n9q<b52> g(final String s, final String s2) {
        zzd.f((Object)s, "folderId");
        zzd.f((Object)s2, "name");
        return (n9q<b52>)new haq((ubq)this.l((n9q<vrm<Object, pav>>)this.b.S((Object)new tr9(this.a, s, s2))), (fk6)new jt1((rtb)new rtb<b52, oyv>() {
            public final /* synthetic */ o52 C0;
            
            public final Object invoke(final Object o) {
                final b52 b52 = (b52)o;
                final o52 c0 = this.C0;
                final Iterator iterator = c0.l.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final Object next = iterator.next();
                    if (n < 0) {
                        tdy.V0();
                        throw null;
                    }
                    if (zzd.a((Object)b52.a, (Object)((b52)next).a)) {
                        c0.l.set(n, b52);
                    }
                    ++n;
                }
                return oyv.a;
            }
        }, 16));
    }
    
    public final void h() {
        this.l.clear();
    }
    
    public final boolean i() {
        return ((feq)this.g).f();
    }
    
    public final n9q<pmi> j(final String s, final String s2, final String s3) {
        zzd.f((Object)s, "name");
        zzd.f((Object)s3, "createTimelineTag");
        return (n9q<pmi>)new haq((ubq)this.l((n9q<vrm<Object, pav>>)this.d.S((Object)new zr(this.a, s, s2))), (fk6)new iaa((rtb)new rtb<pmi, oyv>() {
            public final /* synthetic */ o52 C0;
            
            public final Object invoke(final Object o) {
                final pmi pmi = (pmi)o;
                final aws$a aws$a = new aws$a();
                aws$a.c = this.C0.a.getId();
                aws$a.b = s3;
                aws$a.a = 53;
                o52.k(this.C0, (aws)((h4j)aws$a).e());
                return oyv.a;
            }
        }, 11));
    }
    
    public final <T> n9q<T> l(final n9q<vrm<T, pav>> n9q) {
        return (n9q<T>)n9q.w((qtb)new tj4((rtb)o52$f.C0, 14));
    }
    
    public final void m(final gub<? super hn6, ? super aws, oyv> gub) {
        final n9q y = this.d(null).y(this.i);
        final m29 m29 = new m29();
        m29.c(y.G((fk6)new f$q((rtb)new rtb<List<? extends b52>, oyv>() {
            public final /* synthetic */ o52 D0;
            
            public final Object invoke(Object o) {
                final List list = (List)o;
                zzd.e((Object)list, "list");
                for (final b52 b52 : list) {
                    final aws$a aws$a = new aws$a();
                    aws$a.c = this.D0.a.getId();
                    aws$a.b = l7k.c("folder", b52.a);
                    aws$a.a = 53;
                    final aws aws = (aws)((h4j)aws$a).e();
                    final hn6 hn6 = new hn6(this.D0.k);
                    hn6.a(new Uri[] { aws.a() });
                    gub.invoke((Object)hn6, (Object)aws);
                }
                o = new hn6(this.D0.k);
                ((hn6)o).a(new Uri[] { this.D0.m.a() });
                gub.invoke(o, (Object)this.D0.m);
                m29.a();
                return oyv.a;
            }
        }), (fk6)jvb.e));
    }
}
