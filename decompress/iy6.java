// 
// Decompiled by Procyon v0.6.0
// 

public abstract class iy6 implements oqp
{
    public final my6 a;
    public final my6 b;
    public final my6 c;
    public final my6 d;
    
    public iy6(final my6 a, final my6 b, final my6 c, final my6 d) {
        zzd.f((Object)a, "topStart");
        zzd.f((Object)b, "topEnd");
        zzd.f((Object)c, "bottomEnd");
        zzd.f((Object)d, "bottomStart");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final jpj a(final long n, final tve tve, final dp8 dp8) {
        zzd.f((Object)tve, "layoutDirection");
        zzd.f((Object)dp8, "density");
        final float a = this.a.a(n, dp8);
        final float a2 = this.b.a(n, dp8);
        final float a3 = this.c.a(n, dp8);
        final float a4 = this.d.a(n, dp8);
        final float c = mcq.c(n);
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
            return this.c(n, n4, n7, n8, n3, tve);
        }
        final StringBuilder z = y70.z("Corner size in Px can't be negative(topStart = ", n4, ", topEnd = ", n7, ", bottomEnd = ");
        z.append(n8);
        z.append(", bottomStart = ");
        z.append(n3);
        z.append(")!");
        throw new IllegalArgumentException(z.toString().toString());
    }
    
    public abstract iy6 b(final my6 p0, final my6 p1, final my6 p2, final my6 p3);
    
    public abstract jpj c(final long p0, final float p1, final float p2, final float p3, final float p4, final tve p5);
}
