import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ou1 extends gue implements rtb<a8x, oyv>
{
    public final /* synthetic */ pu1 C0;
    
    public ou1(final pu1 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final int ordinal = ((a8x)o).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                final t3s a = mq1.a;
                final long currentTimeMillis = System.currentTimeMillis();
                for (final Map.Entry<dda, V> entry : this.C0.d.entrySet()) {
                    ((pba)entry.getKey()).e((Object)new jfd(((Number)entry.getValue()).longValue(), currentTimeMillis));
                }
            }
        }
        else {
            final t3s a2 = mq1.a;
            final long currentTimeMillis2 = System.currentTimeMillis();
            final Iterator iterator2 = this.C0.d.keySet().iterator();
            while (iterator2.hasNext()) {
                this.C0.d.put(iterator2.next(), currentTimeMillis2);
            }
        }
        return oyv.a;
    }
}
