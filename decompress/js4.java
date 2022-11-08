// 
// Decompiled by Procyon v0.6.0
// 

public final class js4
{
    public static final rtb<as4, chv<pr4, nc0>> a;
    public static final float[] b;
    public static final float[] c;
    
    static {
        js4.a = js4$a.C0;
        b = new float[] { 0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f };
        c = new float[] { 1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f };
    }
    
    public static final float a(final int n, final float n2, final float n3, final float n4, final float[] array) {
        return n4 * array[n + 6] + (n3 * array[n + 3] + n2 * array[n]);
    }
    
    public static final rtb<as4, chv<pr4, nc0>> b(final pr4.a a) {
        zzd.f((Object)a, "<this>");
    }
}
