import java.io.Serializable;
import com.twitter.util.user.UserIdentifier;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ztl extends xk1
{
    public static final ztl.ztl$b Companion;
    public final n4s c;
    public final n4s d;
    public final n4s e;
    
    static {
        Companion = new ztl.ztl$b();
    }
    
    public ztl(final Bundle bundle) {
        super(bundle);
        this.c = (n4s)pps.n((nsb)new nsb<qo7>(this) {
            public final ztl D0;
            
            public final Object invoke() {
                final Object f = dwj.f(((vl1)this.D0).a, "args_inbox_item", (rlp)qo7.w);
                czd.d(f, "null cannot be cast to non-null type com.twitter.model.dm.DMInboxItem");
                return f;
            }
        });
        this.d = (n4s)pps.n((nsb)new nsb<List<? extends stl>>(this) {
            public final ztl D0;
            
            public final Object invoke() {
                final qo7 qo7 = (qo7)this.D0.c.getValue();
                final UserIdentifier e = ((vl1)this.D0).e();
                czd.e((Object)e, "owner");
                ArrayList list;
                if (qo7.g) {
                    list = new ArrayList();
                    list.add(new stl$b(qo7));
                    if (chw.f0(qo7.a) ^ true) {
                        list.add(stl$d.b);
                    }
                    list.add(new stl$g(qo7));
                }
                else {
                    final ArrayList list2 = new ArrayList();
                    list2.add(new stl$c(qo7));
                    if (chw.f0(qo7.a) ^ true) {
                        final cgv s = c9y.s(qo7, e);
                        czd.c((Object)s);
                        final String k0 = s.K0;
                        czd.c((Object)k0);
                        final long d0 = s.D0;
                        final boolean y = chw.Y(s.I1);
                        list2.add(new stl$e(k0, d0));
                        Object o;
                        if (y) {
                            o = new stl$f(k0, d0);
                        }
                        else {
                            o = new stl$a(k0, d0);
                        }
                        list2.add(o);
                    }
                    list2.add(stl$h.b);
                    list = list2;
                }
                return list;
            }
        });
        this.e = (n4s)pps.n((nsb)new nsb<onm>(this) {
            public final ztl D0;
            
            public final Object invoke() {
                final Serializable serializable = ((vl1)this.D0).a.getSerializable("args_request_inbox");
                czd.d((Object)serializable, "null cannot be cast to non-null type com.twitter.app.dm.request.inbox.RequestInbox");
                return serializable;
            }
        });
    }
    
    public static final class a extends xk1$a<ztl, a>
    {
        public final qo7 c;
        public final UserIdentifier d;
        public final onm e;
        
        public a(final qo7 c, final UserIdentifier d, final onm e) {
            czd.f((Object)c, "inboxItem");
            czd.f((Object)d, "owner");
            czd.f((Object)e, "requestInbox");
            super(93783);
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public final wk1 x() {
            dwj.k(((vl1$a)this).a, "args_inbox_item", (Object)this.c, (rlp)qo7.w);
            ((vl1$a)this).a.putSerializable("args_request_inbox", (Serializable)this.e);
            ((vl1$a)this).u(this.d);
            return (wk1)new aul();
        }
    }
}
