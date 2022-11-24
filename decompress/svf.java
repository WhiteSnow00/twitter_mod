import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class svf implements d3j
{
    public final tvf c;
    public final noj d;
    public final noj e;
    
    public svf(final tvf c, final noj d, final noj e) {
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final boolean apply(final Object o) {
        final tvf c = this.c;
        final noj d = this.d;
        final noj e = this.e;
        final n59 n59 = (n59)o;
        Objects.requireNonNull(c);
        final boolean b = true;
        boolean b2 = false;
        Label_0085: {
            if (d != null) {
                if (!d.e()) {
                    if (((mm3)d.c()).j == 2 || ((mm3)d.c()).j == 3) {
                        b2 = true;
                        break Label_0085;
                    }
                }
            }
            b2 = false;
        }
        boolean b3 = b;
        if (!b2) {
            boolean b4 = false;
            Label_0144: {
                if (e != null) {
                    if (!e.e()) {
                        if (c.a.b(((xzf)e.c()).getId()) == n59) {
                            b4 = true;
                            break Label_0144;
                        }
                    }
                }
                b4 = false;
            }
            b3 = (b4 && b);
        }
        return b3;
    }
}
