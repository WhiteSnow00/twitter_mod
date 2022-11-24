import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oic extends gf4
{
    public final pic L0;
    
    public oic(final pic l0, final int n) {
        this.L0 = l0;
        super(n);
    }
    
    public final void onClick(final View view) {
        e0e.f((Object)view, "p0");
        this.L0.d.a.onNext((Object)klc.c.a);
    }
}
