import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hw7 extends ste implements qsb<p08, p08>
{
    public final String D0;
    
    public hw7(final String d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final p08 p = (p08)o;
        czd.f((Object)p, "$this$setState");
        final String d0 = this.D0;
        czd.f((Object)d0, "newQuery");
        final boolean b = p instanceof p08$a;
        int n2;
        final int n = n2 = 0;
        Label_0093: {
            if (b) {
                n2 = n;
                if (((p08$a)p).g.isEmpty() ^ true) {
                    if (p.m() != 4) {
                        n2 = n;
                        if (p.m() != 2) {
                            break Label_0093;
                        }
                    }
                    n2 = n;
                    if (zkr.c0((CharSequence)d0, (CharSequence)p.n(), false)) {
                        n2 = 1;
                    }
                }
            }
        }
        int n3;
        if (n2 != 0) {
            n3 = 2;
        }
        else {
            n3 = 1;
        }
        return p08.l(p, n3, this.D0, (List)null, 4, (Object)null);
    }
}
