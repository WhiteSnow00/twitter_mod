// 
// Decompiled by Procyon v0.6.0
// 

public final class cs1 implements hic, Cloneable
{
    public final String F0;
    public final String G0;
    public final g7i[] H0;
    
    public cs1(final String f0, final String g0, final g7i[] h0) {
        ds0.a(f0, "Name");
        this.F0 = f0;
        this.G0 = g0;
        if (h0 != null) {
            this.H0 = h0;
        }
        else {
            this.H0 = new g7i[0];
        }
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
        while (true) {
            g7i[] h0;
            g7i[] h2;
            while (true) {
                if (o instanceof hic) {
                    final cs1 cs1 = (cs1)o;
                    if (this.F0.equals(cs1.F0) && ix.p((Object)this.G0, (Object)cs1.G0)) {
                        h0 = this.H0;
                        h2 = cs1.H0;
                        if ((h0 != null) ? (h2 == null || h0.length != h2.length) : (h2 != null)) {
                            break Label_0078;
                        }
                        boolean b2 = false;
                        Label_0073: {
                            b2 = true;
                        }
                        Label_0126: {
                            break Label_0126;
                            b2 = false;
                        }
                        if (b2) {
                            return b;
                        }
                    }
                    b = false;
                    return b;
                }
                return false;
                continue;
            }
            int n = 0;
            Label_0120: {
                ++n;
            }
            iftrue(Label_0073:)(n >= h0.length);
            iftrue(Label_0120:)(ix.p((Object)h0[n], (Object)h2[n]));
            continue;
        }
    }
    
    public final String getName() {
        return this.F0;
    }
    
    public final g7i[] getParameters() {
        return this.H0.clone();
    }
    
    @Override
    public final int hashCode() {
        int n = ix.x(ix.x(17, (Object)this.F0), (Object)this.G0);
        final g7i[] h0 = this.H0;
        for (int length = h0.length, i = 0; i < length; ++i) {
            n = ix.x(n, (Object)h0[i]);
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.F0);
        if (this.G0 != null) {
            sb.append("=");
            sb.append(this.G0);
        }
        for (final g7i g7i : this.H0) {
            sb.append("; ");
            sb.append(g7i);
        }
        return sb.toString();
    }
}
