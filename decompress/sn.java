import android.app.Activity;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sn implements qn, pba<rn>
{
    public final hlr<rn> C0;
    public final hlr<rn> D0;
    
    public sn(final ibm ibm) {
        zzd.f((Object)ibm, "releaseCompletable");
        this.C0 = (hlr<rn>)((hlr)new xum(false)).d();
        this.D0 = (hlr<rn>)((hlr)new xum(true)).d();
        ibm.i((rj)new aq1((Object)this, 7));
    }
    
    public final void C(final rn rn) {
        zzd.f((Object)rn, "event");
        final boolean b = rn instanceof hgj;
        final int n = 1;
        if (b || rn instanceof mgj || rn instanceof kgj || rn instanceof lgj) {
            ((wbj)this.C0).onNext((Object)rn);
        }
        else {
            int n2;
            if (rn instanceof igj || rn instanceof ngj) {
                n2 = n;
            }
            else {
                n2 = ((rn instanceof jgj) ? 1 : 0);
            }
            if (n2 != 0) {
                ((wbj)this.D0).onNext((Object)rn);
            }
        }
    }
    
    public final b5j<rn> a() {
        final b5j merge = b5j.merge((naj)this.C0, (naj)this.D0);
        zzd.e((Object)merge, "merge(forwardSubject, reverseSubject)");
        return (b5j<rn>)merge;
    }
}
