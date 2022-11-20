// 
// Decompiled by Procyon v0.6.0
// 

public final class vr1 implements ehc, Cloneable
{
    public final String D0;
    public final String E0;
    public final n6i[] F0;
    
    public vr1(final String d0, final String e0, final n6i[] f0) {
        as0.a((Object)d0, "Name");
        this.D0 = d0;
        this.E0 = e0;
        if (f0 != null) {
            this.F0 = f0;
        }
        else {
            this.F0 = new n6i[0];
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
            n6i[] f0;
            int n;
            while (true) {
                n6i[] f2;
                while (true) {
                    if (o instanceof ehc) {
                        final vr1 vr1 = (vr1)o;
                        if (this.D0.equals(vr1.D0) && xli.K((Object)this.E0, (Object)vr1.E0)) {
                            f0 = this.F0;
                            f2 = vr1.F0;
                            if ((f0 != null) ? (f2 == null || f0.length != f2.length) : (f2 != null)) {
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
                iftrue(Label_0120:)(xli.K((Object)f0[n], (Object)f2[n]));
                continue;
            }
            Label_0120: {
                ++n;
            }
            iftrue(Label_0073:)(n >= f0.length);
            continue;
        }
    }
    
    public final String getName() {
        return this.D0;
    }
    
    public final n6i[] getParameters() {
        return this.F0.clone();
    }
    
    @Override
    public final int hashCode() {
        int n = xli.a0(xli.a0(17, (Object)this.D0), (Object)this.E0);
        final n6i[] f0 = this.F0;
        for (int length = f0.length, i = 0; i < length; ++i) {
            n = xli.a0(n, (Object)f0[i]);
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.D0);
        if (this.E0 != null) {
            sb.append("=");
            sb.append(this.E0);
        }
        for (final n6i n6i : this.F0) {
            sb.append("; ");
            sb.append(n6i);
        }
        return sb.toString();
    }
}
