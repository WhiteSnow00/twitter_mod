// 
// Decompiled by Procyon v0.6.0
// 

public final class gp8
{
    public final Class<?> a;
    public final int b;
    public final int c;
    
    public gp8(final Class<?> a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a() {
        return this.b == 2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof gp8;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final gp8 gp8 = (gp8)o;
            b3 = b2;
            if (this.a == gp8.a) {
                b3 = b2;
                if (this.b == gp8.b) {
                    b3 = b2;
                    if (this.c == gp8.c) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        final int b = this.b;
        String s;
        if (b == 1) {
            s = "required";
        }
        else if (b == 0) {
            s = "optional";
        }
        else {
            s = "set";
        }
        sb.append(s);
        sb.append(", injection=");
        final int c = this.c;
        String s2;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    throw new AssertionError((Object)yk.y("Unsupported injection: ", c));
                }
                s2 = "deferred";
            }
            else {
                s2 = "provider";
            }
        }
        else {
            s2 = "direct";
        }
        return hi.I(sb, s2, "}");
    }
}
