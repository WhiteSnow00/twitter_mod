import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecl implements ksc$a<icl>
{
    public final /* synthetic */ dcl C0;
    
    public ecl(final dcl c0) {
        this.C0 = c0;
    }
    
    public final void b(final cw0 cw0) {
        final icl icl = (icl)cw0;
        if (((ksc)icl).T().b && !((Activity)this.C0.b).isDestroyed()) {
            this.C0.l = 2;
            final jcl k = (jcl)((ksc)icl).T().g;
            pf8.r(k);
            if (k.a.equals("bonus_follow")) {
                final dcl c0 = this.C0;
                c0.k = k;
                c0.i = c0.a(k);
            }
            else if (k.a.equals("cluster_follow")) {
                final dcl c2 = this.C0;
                c2.i = (hcl)c2.b();
            }
            this.C0.d();
        }
        else {
            this.C0.l = 0;
        }
    }
}
