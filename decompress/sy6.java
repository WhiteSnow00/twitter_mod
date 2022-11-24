// 
// Decompiled by Procyon v0.6.0
// 

public abstract class sy6 implements asp
{
    public final wy6 a;
    public final wy6 b;
    public final wy6 c;
    public final wy6 d;
    
    public sy6(final wy6 a, final wy6 b, final wy6 c, final wy6 d) {
        e0e.f((Object)a, "topStart");
        e0e.f((Object)b, "topEnd");
        e0e.f((Object)c, "bottomEnd");
        e0e.f((Object)d, "bottomStart");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final dqj a(final long n, final cwe cwe, final rp8 rp8) {
        e0e.f((Object)cwe, "layoutDirection");
        e0e.f((Object)rp8, "density");
        final float a = this.a.a(n, rp8);
        final float a2 = this.b.a(n, rp8);
        final float a3 = this.c.a(n, rp8);
        final float a4 = this.d.a(n, rp8);
        final float c = aeq.c(n);
        final float n2 = a + a4;
        float n3 = a4;
        float n4 = a;
        if (n2 > c) {
            final float n5 = c / n2;
            n4 = a * n5;
            n3 = a4 * n5;
        }
        final float n6 = a2 + a3;
        float n7 = a2;
        float n8 = a3;
        if (n6 > c) {
            final float n9 = c / n6;
            n7 = a2 * n9;
            n8 = a3 * n9;
        }
        if (n4 >= 0.0f && n7 >= 0.0f && n8 >= 0.0f && n3 >= 0.0f) {
            return this.c(n, n4, n7, n8, n3, cwe);
        }
        final StringBuilder z = lr0.z("Corner size in Px can't be negative(topStart = ", n4, ", topEnd = ", n7, ", bottomEnd = ");
        z.append(n8);
        z.append(", bottomStart = ");
        z.append(n3);
        z.append(")!");
        throw new IllegalArgumentException(z.toString().toString());
    }
    
    public abstract sy6 b(final wy6 p0, final wy6 p1, final wy6 p2, final wy6 p3);
    
    public abstract dqj c(final long p0, final float p1, final float p2, final float p3, final float p4, final cwe p5);
}
