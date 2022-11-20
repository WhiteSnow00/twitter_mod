import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rvq extends ste implements qsb<vvq, vvq>
{
    public final vvq D0;
    
    public rvq(final vvq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vvq vvq = (vvq)o;
        czd.f((Object)vvq, "$this$setState");
        final List d = this.D0.d;
        final ArrayList list = new ArrayList<tar>(iq4.H((Iterable)d, 10));
        final Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            list.add(tar.a((tar)iterator.next(), false, false));
        }
        return vvq.l(vvq, false, false, false, (List)list, (List)null, false, 55);
    }
}
