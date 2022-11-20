import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vei extends mm7
{
    public final List<tqa> e;
    
    public vei(final vei.vei$a vei$a) {
        super((mm7$a)vei$a, 4);
        this.e = vei$a.d;
    }
    
    public final String e() {
        final ls6 ls6 = (ls6)fq4.q(super.d);
        String a;
        if (ls6 != null) {
            a = ls6.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final c47 f() {
        for (final wr6 wr6 : super.b) {
            if (wr6 instanceof c47) {
                final int a = c5j.a;
                return (c47)wr6;
            }
        }
        return null;
    }
}
