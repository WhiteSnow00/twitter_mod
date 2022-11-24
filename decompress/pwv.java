import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwv implements mwv<rnt>
{
    public final List<String> F0;
    public final c9t G0;
    
    public pwv(final List<String> f0, final c9t g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object b(final y4c y4c, final lsm lsm) {
        final ojf h = ojf.H();
        final Iterator<String> iterator = this.F0.iterator();
        while (iterator.hasNext()) {
            final qgv f = y4c.f(iterator.next());
            if (f != null) {
                final ynt$a ynt$a = new ynt$a();
                ynt$a.a = f.F0;
                ynt$a.b = f.G0;
                ynt$a.c = f.c();
                h.p((Object)((z4j)ynt$a).e());
            }
        }
        final rnt.a a = new rnt.a();
        a.b = this.G0;
        a.o((List<ynt>)((z4j)h).e());
        return a.e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && pwv.class == o.getClass()) {
            final pwv pwv = (pwv)o;
            if (!o5j.a((Object)this.F0, (Object)pwv.F0) || !o5j.a((Object)this.G0, (Object)pwv.G0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.F0, (Object)this.G0);
    }
}
