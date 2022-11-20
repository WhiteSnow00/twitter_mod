import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ock implements Serializable
{
    public boolean D0;
    public int E0;
    public long F0;
    public boolean G0;
    public String H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public int L0;
    public boolean M0;
    public String N0;
    public boolean O0;
    public int P0;
    public boolean Q0;
    public String R0;
    
    public ock() {
        this.E0 = 0;
        this.F0 = 0L;
        this.H0 = "";
        this.J0 = false;
        this.L0 = 1;
        this.N0 = "";
        this.R0 = "";
        this.P0 = 5;
    }
    
    public final ock a(final int e0) {
        this.D0 = true;
        this.E0 = e0;
        return this;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof ock;
        boolean b2 = true;
        if (b) {
            final ock ock = (ock)o;
            boolean b3 = false;
            Label_0149: {
                Label_0147: {
                    if (ock != null) {
                        if (this != ock) {
                            if (this.E0 != ock.E0 || this.F0 != ock.F0 || !this.H0.equals(ock.H0) || this.J0 != ock.J0 || this.L0 != ock.L0 || !this.N0.equals(ock.N0) || this.P0 != ock.P0 || !this.R0.equals(ock.R0) || this.Q0 != ock.Q0) {
                                break Label_0147;
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
        final int f = hmg.f(this.H0, (Long.valueOf(this.F0).hashCode() + (this.E0 + 2173) * 53) * 53, 53);
        final boolean j0 = this.J0;
        final int n = 1237;
        int n2;
        if (j0) {
            n2 = 1231;
        }
        else {
            n2 = 1237;
        }
        final int f2 = hmg.f(this.R0, br.c(this.P0, hmg.f(this.N0, ((f + n2) * 53 + this.L0) * 53, 53), 53), 53);
        int n3 = n;
        if (this.Q0) {
            n3 = 1231;
        }
        return f2 + n3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Country Code: ");
        j.append(this.E0);
        j.append(" National Number: ");
        j.append(this.F0);
        if (this.I0 && this.J0) {
            j.append(" Leading Zero(s): true");
        }
        if (this.K0) {
            j.append(" Number of leading zeros: ");
            j.append(this.L0);
        }
        if (this.G0) {
            j.append(" Extension: ");
            j.append(this.H0);
        }
        if (this.O0) {
            j.append(" Country Code Source: ");
            j.append(da8.s(this.P0));
        }
        if (this.Q0) {
            j.append(" Preferred Domestic Carrier Code: ");
            j.append(this.R0);
        }
        return j.toString();
    }
}
