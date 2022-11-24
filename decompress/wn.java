import android.app.Activity;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wn implements un, fca<vn>
{
    public final xmr<vn> F0;
    public final xmr<vn> G0;
    
    public wn(final kcm kcm) {
        e0e.f((Object)kcm, "releaseCompletable");
        this.F0 = (xmr<vn>)((xmr)new ewm(false)).d();
        this.G0 = (xmr<vn>)((xmr)new ewm(true)).d();
        kcm.i((sj)new qbk((Object)this, 7));
    }
    
    public final un A(final UUID uuid) {
        return fd.b((un)this, uuid);
    }
    
    public final void D(final vn vn) {
        e0e.f((Object)vn, "event");
        final boolean b = vn instanceof bhj;
        final int n = 1;
        if (b || vn instanceof ghj || vn instanceof ehj || vn instanceof fhj) {
            ((ocj)this.F0).onNext((Object)vn);
        }
        else {
            int n2;
            if (vn instanceof chj || vn instanceof hhj) {
                n2 = n;
            }
            else {
                n2 = ((vn instanceof dhj) ? 1 : 0);
            }
            if (n2 != 0) {
                ((ocj)this.G0).onNext((Object)vn);
            }
        }
    }
    
    public final zaf F(final stb stb) {
        return z9a.d((zaf)this, stb);
    }
    
    public final t5j<vn> a() {
        final t5j merge = t5j.merge((fbj)this.F0, (fbj)this.G0);
        e0e.e((Object)merge, "merge(forwardSubject, reverseSubject)");
        return (t5j<vn>)merge;
    }
    
    public final t5j b() {
        return fd.e((un)this);
    }
    
    public final t5j c() {
        return fd.h((un)this);
    }
    
    public final /* bridge */ void e(final Object o) {
        this.D((vn)o);
    }
    
    public final t5j h() {
        return fd.j((un)this);
    }
    
    public final t5j j() {
        return fd.d((un)this);
    }
    
    public final t5j p() {
        return fd.f((un)this);
    }
    
    public final t5j q() {
        return fd.g((un)this);
    }
    
    public final un w(final Activity activity) {
        return fd.a((un)this, activity);
    }
}
