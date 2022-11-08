import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sez implements Serializable, qez
{
    public final qez C0;
    public transient volatile boolean D0;
    public transient Object E0;
    
    public sez(final qez c0) {
        this.C0 = c0;
    }
    
    public final Object a() {
        if (!this.D0) {
            synchronized (this) {
                if (!this.D0) {
                    final Object a = this.C0.a();
                    this.E0 = a;
                    this.D0 = true;
                    return a;
                }
            }
        }
        return this.E0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("Suppliers.memoize(");
        Object o;
        if (this.D0) {
            final StringBuilder g2 = w48.g("<supplier that returned ");
            g2.append(this.E0);
            g2.append(">");
            o = g2.toString();
        }
        else {
            o = this.C0;
        }
        g.append(o);
        g.append(")");
        return g.toString();
    }
}
