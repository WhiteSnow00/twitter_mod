import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qcl implements orc$a<ucl>
{
    public final pcl D0;
    
    public qcl(final pcl d0) {
        this.D0 = d0;
    }
    
    public final void a(final wv0 wv0) {
    }
    
    public final void b(final wv0 wv0) {
        final ucl ucl = (ucl)wv0;
        if (((orc)ucl).T().b && !((Activity)this.D0.b).isDestroyed()) {
            this.D0.l = 2;
            final vcl k = (vcl)((orc)ucl).T().g;
            jee.l((Object)k);
            if (k.a.equals("bonus_follow")) {
                final pcl d0 = this.D0;
                d0.k = k;
                d0.i = (tcl)d0.a(k);
            }
            else if (k.a.equals("cluster_follow")) {
                final pcl d2 = this.D0;
                d2.i = (tcl)d2.b();
            }
            this.D0.d();
        }
        else {
            this.D0.l = 0;
        }
    }
    
    public final void c(final wv0 wv0, final boolean b) {
    }
}
