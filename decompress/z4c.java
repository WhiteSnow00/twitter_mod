import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z4c extends kuh
{
    public z4c(final int n, final dhq dhq) {
        synchronized (fhq.c) {
            final ArrayList h = fhq.h;
            List p2;
            if (h.isEmpty() ^ true) {
                p2 = or4.p2((Collection)h);
            }
            else {
                p2 = null;
            }
            Object o;
            if (p2 != null) {
                if ((o = or4.d2(p2)) == null) {
                    o = new rtb<Object, oyv>() {
                        public final Object invoke(final Object o) {
                            zzd.f(o, "state");
                            final List<rtb<Object, oyv>> c0 = p2;
                            for (int size = c0.size(), i = 0; i < size; ++i) {
                                ((rtb)c0.get(i)).invoke(o);
                            }
                            return oyv.a;
                        }
                    };
                }
            }
            else {
                o = null;
            }
            monitorexit(fhq.c);
            super(n, dhq, (rtb)null, (rtb)o);
        }
    }
    
    public final void c() {
        synchronized (fhq.c) {
            ((ahq)this).n();
        }
    }
    
    public final void j(final ahq ahq) {
        zzd.f((Object)ahq, "snapshot");
        xhq.a();
        throw null;
    }
    
    public final void k(final ahq ahq) {
        zzd.f((Object)ahq, "snapshot");
        xhq.a();
        throw null;
    }
    
    public final void l() {
        fhq.a();
    }
    
    public final ahq s(final rtb<Object, oyv> rtb) {
        final rtb<dhq, u1m> rtb2 = (rtb<dhq, u1m>)new rtb<dhq, u1m>() {
            public final Object invoke(final Object o) {
                final dhq dhq = (dhq)o;
                zzd.f((Object)dhq, "invalid");
                synchronized (fhq.c) {
                    final int e = fhq.e;
                    fhq.e = e + 1;
                    monitorexit(fhq.c);
                    return new u1m(e, dhq, (rtb)rtb);
                }
            }
        };
        final fhq$a a = fhq.a;
        return (ahq)fhq.f((rtb<? super dhq, ?>)new hhq((rtb)rtb2));
    }
    
    public final bhq u() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
    
    public final kuh z(final rtb<Object, oyv> rtb, final rtb<Object, oyv> rtb2) {
        final rtb<dhq, kuh> rtb3 = (rtb<dhq, kuh>)new rtb<dhq, kuh>() {
            public final Object invoke(final Object o) {
                final dhq dhq = (dhq)o;
                zzd.f((Object)dhq, "invalid");
                synchronized (fhq.c) {
                    final int e = fhq.e;
                    fhq.e = e + 1;
                    monitorexit(fhq.c);
                    return new kuh(e, dhq, (rtb)rtb, (rtb)rtb2);
                }
            }
        };
        final fhq$a a = fhq.a;
        return (kuh)fhq.f((rtb<? super dhq, ?>)new hhq((rtb)rtb3));
    }
}
