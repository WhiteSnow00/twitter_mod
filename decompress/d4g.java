import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d4g extends tp1<ynj<jvg>>
{
    public final WeakReference E0;
    public final f4g$a F0;
    
    public d4g(final WeakReference e0, final f4g$a f0) {
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void b(final Object o) {
        final jvg jvg = (jvg)((ynj)o).h((Object)null);
        if (f4g.a(this.E0) != null) {
            ((dl1)this.F0).a5(jvg);
        }
        else if (jvg != null) {
            jvg.i();
        }
    }
}
