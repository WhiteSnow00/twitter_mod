import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcn extends pue implements stb<bon$a, vzv>
{
    public final hbn F0;
    
    public jcn(final hbn f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final bon$a bon$a = (bon$a)o;
        if (bon$a instanceof bon$a$d) {
            final hbn f0 = this.F0;
            final qu3 g = f0.G;
            if (g != null) {
                for (final String s : ((bon$a$d)bon$a).a) {
                    final to2 l = f0.l;
                    final String b = f0.B;
                    final String a = g.a();
                    if (a == null) {
                        break;
                    }
                    l.v(b, s, a).G((rk6)new ltt((stb)hcn.F0, 11), (rk6)new ppl((stb)icn.F0, 12));
                }
            }
        }
        else if (bon$a instanceof bon$a$h) {
            final hbn f2 = this.F0;
            final bon$a$h bon$a$h = (bon$a$h)bon$a;
            hbn.b(f2, bon$a$h.a, bon$a$h.b, f2.B, f2.G);
        }
        else if (bon$a instanceof bon$a$a) {
            final hbn f3 = this.F0;
            hbn.b(f3, ((bon$a$a)bon$a).a, null, f3.B, f3.G);
        }
        return vzv.a;
    }
}
