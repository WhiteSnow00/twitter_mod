import java.util.List;
import android.database.Cursor;
import android.util.Pair;
import java.util.Collection;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rgg implements lub
{
    public final int a;
    public final Object b;
    
    public rgg(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final Object apply(final Object o) {
        switch (this.a) {
            default: {
                return ((k1w)o).a((UserIdentifier)this.b);
            }
            case 5: {
                return ((y4c)this.b).c((String)o);
            }
            case 4: {
                final lsm lsm = (lsm)this.b;
                final cws cws = lsm.a.get(o);
                final Object o2 = null;
                Object k = null;
                Object o3;
                if (cws == null) {
                    o3 = o2;
                }
                else {
                    final jva.a a = new jva.a();
                    a.a = cws.a;
                    a.b = cws.b;
                    a.c = cws.c;
                    a.d = cws.d;
                    a.e = cws.e;
                    a.f = cws.f;
                    a.h = cws.h;
                    a.i = cws.i;
                    final o3t i = cws.k;
                    if (i != null) {
                        if (i instanceof q3t) {
                            final vxm$a vxm$a = new vxm$a();
                            vxm$a.b = ((q3t)i).a;
                            k = new vxm(vxm$a);
                        }
                        else if (i instanceof t3t) {
                            final yxm$a yxm$a = new yxm$a();
                            final t3t t3t = (t3t)i;
                            yxm$a.b = t3t.b;
                            yxm$a.a = t3t.a;
                            k = new yxm(yxm$a);
                        }
                        else if (i instanceof v3t) {
                            final aym.a a2 = new aym.a();
                            a2.a = ((v3t)i).a;
                            k = new aym(a2);
                        }
                        else if (i instanceof w3t) {
                            final cym.a a3 = new cym.a();
                            a3.a = ((w3t)i).a;
                            k = new cym(a3);
                        }
                        else if (i instanceof r3t) {
                            final wxm.a a4 = new wxm.a();
                            a4.a = ((r3t)i).a;
                            k = new wxm(a4);
                        }
                        else if (i instanceof s3t) {
                            final xxm$a xxm$a = new xxm$a();
                            xxm$a.a = ((s3t)i).a;
                            k = new xxm(xxm$a);
                        }
                        else if (i instanceof u3t) {
                            final zxm$a zxm$a = new zxm$a();
                            zxm$a.a = ((u3t)i).a;
                            k = new zxm(zxm$a);
                        }
                        else if (i instanceof x3t) {
                            final dym$a dym$a = new dym$a();
                            dym$a.a = ((x3t)i).a;
                            k = new dym(dym$a);
                        }
                        else {
                            final StringBuilder f = ehk.f("Unexpected TimelineRichFeedbackBehavior type: ");
                            f.append(((x3t)i).getClass());
                            r9a.d((Throwable)new IllegalArgumentException(f.toString()));
                        }
                    }
                    a.k = (uxm)k;
                    a.j = cws.j;
                    if (!kr4.t((Collection)cws.g)) {
                        a.g = k6e.k((Iterable)new u5e(cws.g, (lub)new rgg(lsm, 4)));
                    }
                    o3 = a.e();
                }
                return o3;
            }
            case 3: {
                final wv6 wv6 = (wv6)this.b;
                final oh0 oh0 = (oh0)o;
                if (z8t.b(wv6.b.c.a)) {
                    ((List<Pair>)wv6.g).add(Pair.create((Object)String.valueOf(oh0.getId()), (Object)wv6.k.e));
                }
                return oh0.getId();
            }
            case 2: {
                return re6.k((re6)this.b, (Cursor)o);
            }
            case 1: {
                return dvc.d("DROP ", (String)this.b, " IF EXISTS ", (String)o, ";");
            }
            case 0: {
                return ((xgg)this.b).a((pgg)o);
            }
        }
    }
}
