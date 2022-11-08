// 
// Decompiled by Procyon v0.6.0
// 

public final class yoa extends o4j$a
{
    public static o4j<yoa> d;
    public float b;
    public float c;
    
    static {
        (yoa.d = (o4j<yoa>)o4j.a(256, (o4j$a)new yoa(0.0f, 0.0f))).f = 0.5f;
    }
    
    public yoa() {
    }
    
    public yoa(final float n, final float n2) {
        this.b = 0.0f;
        this.c = 0.0f;
    }
    
    public static yoa b(final float b, final float c) {
        final yoa yoa = (yoa)yoa.d.b();
        yoa.b = b;
        yoa.c = c;
        return yoa;
    }
    
    public static void c(final yoa yoa) {
        yoa.d.c((o4j$a)yoa);
    }
    
    public final o4j$a a() {
        return new yoa(0.0f, 0.0f);
    }
    
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        boolean b2 = b;
        if (o instanceof yoa) {
            final yoa yoa = (yoa)o;
            b2 = b;
            if (this.b == yoa.b) {
                b2 = b;
                if (this.c == yoa.c) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public final int hashCode() {
        return Float.floatToIntBits(this.b) ^ Float.floatToIntBits(this.c);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("x");
        sb.append(this.c);
        return sb.toString();
    }
}
