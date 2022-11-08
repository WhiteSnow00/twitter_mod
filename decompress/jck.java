import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jck implements Serializable
{
    public boolean C0;
    public int D0;
    public long E0;
    public boolean F0;
    public String G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public int K0;
    public boolean L0;
    public String M0;
    public boolean N0;
    public int O0;
    public boolean P0;
    public String Q0;
    
    public jck() {
        this.D0 = 0;
        this.E0 = 0L;
        this.G0 = "";
        this.I0 = false;
        this.K0 = 1;
        this.M0 = "";
        this.Q0 = "";
        this.O0 = 5;
    }
    
    public final jck a(final int d0) {
        this.C0 = true;
        this.D0 = d0;
        return this;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof jck;
        boolean b2 = true;
        if (b) {
            final jck jck = (jck)o;
            boolean b3 = false;
            Label_0149: {
                Label_0146: {
                    if (jck != null) {
                        if (this != jck) {
                            if (this.D0 != jck.D0 || this.E0 != jck.E0 || !this.G0.equals(jck.G0) || this.I0 != jck.I0 || this.K0 != jck.K0 || !this.M0.equals(jck.M0) || this.O0 != jck.O0 || !this.Q0.equals(jck.Q0) || this.P0 != jck.P0) {
                                break Label_0146;
                            }
                        }
                        b3 = true;
                        break Label_0149;
                    }
                }
                b3 = false;
            }
            if (b3) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.G0, (Long.valueOf(this.E0).hashCode() + (this.D0 + 2173) * 53) * 53, 53);
        final boolean i0 = this.I0;
        final int n = 1237;
        int n2;
        if (i0) {
            n2 = 1231;
        }
        else {
            n2 = 1237;
        }
        final int a2 = l7k.a(this.Q0, w48.e(this.O0, l7k.a(this.M0, ((a + n2) * 53 + this.K0) * 53, 53), 53), 53);
        int n3 = n;
        if (this.P0) {
            n3 = 1231;
        }
        return a2 + n3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("Country Code: ");
        g.append(this.D0);
        g.append(" National Number: ");
        g.append(this.E0);
        if (this.H0 && this.I0) {
            g.append(" Leading Zero(s): true");
        }
        if (this.J0) {
            g.append(" Number of leading zeros: ");
            g.append(this.K0);
        }
        if (this.F0) {
            g.append(" Extension: ");
            g.append(this.G0);
        }
        if (this.N0) {
            g.append(" Country Code Source: ");
            g.append(iqg.d(this.O0));
        }
        if (this.P0) {
            g.append(" Preferred Domestic Carrier Code: ");
            g.append(this.Q0);
        }
        return g.toString();
    }
}
