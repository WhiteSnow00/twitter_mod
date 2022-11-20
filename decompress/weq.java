import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class weq<Param, Item, Request extends orc<seq<? extends Item>, kbv>> extends enm<Param, msm<List<? extends Item>, kbv>, Request>
{
    public teq E0;
    
    public weq() {
        super((trc)null, 1, (rf8)null);
    }
    
    public /* bridge */ Object d(final orc orc) {
        return this.h(orc);
    }
    
    public final boolean f() {
        final teq e0 = this.E0;
        String b;
        if (e0 != null) {
            b = e0.b;
        }
        else {
            b = null;
        }
        return b != null;
    }
    
    public msm<List<Item>, kbv> h(final Request request) {
        czd.f((Object)request, "request");
        msm msm;
        if (request.T().b) {
            final seq seq = (seq)request.T().g;
            teq a;
            if (seq != null) {
                a = seq.a;
            }
            else {
                a = null;
            }
            this.E0 = a;
            final seq seq2 = (seq)request.T().g;
            Object o;
            if (seq2 == null || (o = seq2.b) == null) {
                o = f2a.D0;
            }
            msm = msm.e(o);
        }
        else {
            kbv kbv;
            if ((kbv = (kbv)request.T().h) == null) {
                kbv = new kbv(new hbv[] { new hbv(request.T().c) });
            }
            msm = msm.a((Object)kbv);
        }
        return (msm<List<Item>, kbv>)msm;
    }
}
