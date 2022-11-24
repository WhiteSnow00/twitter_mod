import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhg implements c8p
{
    public final mxe b;
    public final c8p c;
    
    public dhg(final mxe b, final c8p c) {
        this.b = b;
        this.c = c;
    }
    
    public final boolean onSearchRequested() {
        final mxe b = this.b;
        final c8p c = this.c;
        final vhg vhg = (vhg)b.get();
        Objects.requireNonNull(vhg);
        int[] array = vhg$b.b;
        if (vhg.X1.a()) {
            array = vhg$b.c;
        }
        vhg.b1.a(0L, vhg.m1, array);
        return c.onSearchRequested();
    }
}
