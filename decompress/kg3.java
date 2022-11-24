import java.util.Iterator;
import androidx.work.impl.WorkDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kg3 extends lg3
{
    public final rsx G0;
    public final String H0;
    public final boolean I0;
    
    public kg3(final rsx g0, final String h0, final boolean i0) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void c() {
        final WorkDatabase c = this.G0.c;
        ((ldn)c).c();
        try {
            final Iterator<String> iterator = c.y().f(this.H0).iterator();
            while (iterator.hasNext()) {
                this.a(this.G0, (String)iterator.next());
            }
            ((ldn)c).q();
            ((ldn)c).l();
            if (this.I0) {
                this.b(this.G0);
            }
        }
        finally {
            ((ldn)c).l();
        }
    }
}
