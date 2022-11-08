import java.util.HashMap;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sob implements qob, pba<rob>
{
    public final hlr<rob> C0;
    public final hlr<rob> D0;
    public boolean E0;
    
    public sob(final ibm ibm) {
        zzd.f((Object)ibm, "releaseCompletable");
        this.C0 = (hlr<rob>)((hlr)new xum(false)).d();
        this.D0 = (hlr<rob>)((hlr)new xum(true)).d();
        ibm.i((rj)new ht1((Object)this, 9));
    }
    
    public final void C(final rob rob) {
        zzd.f((Object)rob, "event");
        if (this.E0) {
            final z8a z8a = new z8a((Throwable)new IllegalStateException("Attempted to dispatch event to completed lifecycle"));
            ((HashMap<String, String>)z8a.a).put("fragmentType", rob.a().getClass().getSimpleName());
            String a1;
            if ((a1 = rob.a().a1) == null) {
                a1 = "";
            }
            ((HashMap<String, String>)z8a.a).put("fragmentTag", a1);
            ((HashMap<String, String>)z8a.a).put("fragmentEvent", rob.getClass().getSimpleName());
            e9a.c(z8a);
        }
        else {
            final boolean b = rob instanceof fij;
            final int n = 1;
            if (b || rob instanceof mij || rob instanceof kij || rob instanceof iij || rob instanceof hij || rob instanceof lij || rob instanceof pij) {
                ((wbj)this.C0).onNext((Object)rob);
            }
            else {
                int n2;
                if (rob instanceof gij || rob instanceof nij || rob instanceof jij || rob instanceof oij) {
                    n2 = n;
                }
                else {
                    n2 = ((rob instanceof qij) ? 1 : 0);
                }
                if (n2 != 0) {
                    ((wbj)this.D0).onNext((Object)rob);
                }
            }
        }
    }
    
    public final b5j<rob> a() {
        final b5j merge = b5j.merge((naj)this.C0, (naj)this.D0);
        zzd.e((Object)merge, "merge(forwardSubject, reverseSubject)");
        return (b5j<rob>)merge;
    }
}
