import java.util.Map;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqz implements Iterator, j$.util.Iterator
{
    public int C0 = -1;
    public boolean D0;
    public Iterator E0;
    public final /* synthetic */ iqz F0;
    
    public final Iterator a() {
        if (this.E0 == null) {
            this.E0 = this.F0.E0.entrySet().iterator();
        }
        return this.E0;
    }
    
    @Override
    public final boolean hasNext() {
        final int c0 = this.C0;
        boolean b = true;
        if (c0 + 1 >= this.F0.D0.size()) {
            if (!this.F0.E0.isEmpty()) {
                if (!this.a().hasNext()) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    @Override
    public final void remove() {
        if (!this.D0) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.D0 = false;
        final iqz f0 = this.F0;
        final int i0 = iqz.I0;
        f0.i();
        if (this.C0 < this.F0.D0.size()) {
            this.F0.g(this.C0--);
            return;
        }
        this.a().remove();
    }
}
