import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vgg extends dn1<xl1>
{
    public final Uri G0;
    
    public vgg(final Uri g0) {
        this.G0 = g0;
    }
    
    public final void b(final Object o) {
        final xl1 xl1 = (xl1)o;
        if (xl1 instanceof l9s) {
            final e39 e39 = new e39();
            e39.c(xl1.n0().d().subscribe((rk6)new d0t((Object)xl1, (Object)this.G0, (Object)e39, 1)));
        }
    }
}
