import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ks1 implements l6i, Cloneable, Serializable
{
    public final String C0;
    public final String D0;
    
    public ks1(final String c0, final String d0) {
        hs0.a(c0, "Name");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof l6i) {
            final ks1 ks1 = (ks1)o;
            if (!this.C0.equals(ks1.C0) || !poa.E(this.D0, ks1.D0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final String getName() {
        return this.C0;
    }
    
    public final String getValue() {
        return this.D0;
    }
    
    @Override
    public final int hashCode() {
        return poa.X(poa.X(17, this.C0), this.D0);
    }
    
    @Override
    public final String toString() {
        if (this.D0 == null) {
            return this.C0;
        }
        final StringBuilder sb = new StringBuilder(this.D0.length() + (this.C0.length() + 1));
        sb.append(this.C0);
        sb.append("=");
        sb.append(this.D0);
        return sb.toString();
    }
}
