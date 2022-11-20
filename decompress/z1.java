import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z1 implements nsb
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    
    public z1(final Object e0, final Object f0, final Object g0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object invoke() {
        switch (this.D0) {
            default: {
                return new sw0((Context)this.E0, (w4)this.F0, new loi(eaq.t((Callable)this.G0), (uv0)uv0.f));
            }
            case 0: {
                final Map.Entry entry = (Map.Entry)this.E0;
                final x1 x1 = (x1)this.F0;
                final j6 j6 = (j6)this.G0;
                final Iterator iterator = entry.getValue().iterator();
                while (iterator.hasNext()) {
                    ((f2)iterator.next()).d(x1, j6);
                }
                return null;
            }
        }
    }
}
