import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fge implements Serializable
{
    public final long C0;
    public final long D0;
    public final int E0;
    public final int F0;
    public final transient Object G0;
    
    public fge(final Object g0, final long c0, final long d0, final int e0, final int f0) {
        this.G0 = g0;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final boolean equals(Object g0) {
        boolean b = true;
        if (g0 == this) {
            return true;
        }
        if (g0 == null) {
            return false;
        }
        if (!(g0 instanceof fge)) {
            return false;
        }
        final fge fge = (fge)g0;
        g0 = this.G0;
        if (g0 == null) {
            if (fge.G0 != null) {
                return false;
            }
        }
        else if (!g0.equals(fge.G0)) {
            return false;
        }
        if (this.E0 != fge.E0 || this.F0 != fge.F0 || this.D0 != fge.D0 || this.C0 != fge.C0) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final Object g0 = this.G0;
        int hashCode;
        if (g0 == null) {
            hashCode = 1;
        }
        else {
            hashCode = g0.hashCode();
        }
        return ((hashCode ^ this.E0) + this.F0 ^ (int)this.D0) + (int)this.C0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        final Object g0 = this.G0;
        if (g0 == null) {
            sb.append("UNKNOWN");
        }
        else {
            sb.append(g0.toString());
        }
        sb.append("; line: ");
        sb.append(this.E0);
        sb.append(", column: ");
        return y70.y(sb, this.F0, ']');
    }
}
