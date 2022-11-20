import com.google.android.exoplayer2.w;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgg implements ytk, o5$a
{
    public final int D0;
    public final int E0;
    
    public bgg(final int e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void g(final w.c c) {
        switch (this.D0) {
            default: {
                final int e0 = this.E0;
                czd.f((Object)c, "it");
                c.O0(e0);
                return;
            }
            case 1: {
                final int e2 = this.E0;
                czd.f((Object)c, "it");
                c.A(e2);
            }
        }
    }
    
    public final boolean test(final Object o) {
        return ((Integer)((kvj)o).b()).equals(this.E0);
    }
}
