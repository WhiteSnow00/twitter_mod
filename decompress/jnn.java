import androidx.appcompat.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnn extends pue implements stb<znn, vzv>
{
    public final gnn F0;
    
    public jnn(final gnn f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final znn znn = (znn)o;
        e0e.f((Object)znn, "$this$distinct");
        final Toolbar k0 = this.F0.K0;
        final String a = znn.a;
        CharSequence l;
        if (a == null || a.length() == 0) {
            l = null;
        }
        else {
            l = mqb.l("@", znn.a);
        }
        k0.setSubtitle(l);
        return vzv.a;
    }
}
