import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vx0 implements y94
{
    public u4 C0;
    public Collection<? extends e2> D0;
    
    public final void g(final u4 c0) {
        zzd.f((Object)c0, "attachment");
        this.l();
        if (!zzd.a((Object)this.C0, (Object)c0)) {
            final List u0 = tdy.u0((Object)new xx0(c0, (xx0$a)new xx0$a() {
                public final /* synthetic */ vx0 a;
                
                public final void a() {
                    this.a.j(c0);
                }
                
                public final void b() {
                    this.a.k();
                }
            }));
            c0.e.k((Collection)u0);
            this.D0 = u0;
            this.C0 = c0;
        }
    }
    
    public abstract void j(final u4 p0);
    
    public abstract void k();
    
    public void l() {
    }
    
    public void unbind() {
        final u4 c0 = this.C0;
        if (c0 != null) {
            final List d0 = this.D0;
            if (d0 != null) {
                c0.e.Z((Collection)d0);
            }
        }
    }
}
