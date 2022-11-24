import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nte extends es4
{
    public static final nte.nte$a Companion;
    
    static {
        Companion = new nte.nte$a();
    }
    
    public nte() {
        Objects.requireNonNull(yr4.Companion);
        final yr4$a companion = yr4.Companion;
        super("Generic L*a*b*", yr4.c, 15);
    }
    
    public final float[] a(final float[] array) {
        e0e.f((Object)array, "v");
        final float n = array[0];
        final float[] m0 = eg8.M0;
        final float n2 = n / m0[0];
        final float n3 = array[1] / m0[1];
        final float n4 = array[2] / m0[2];
        float n5;
        if (n2 > 0.008856452f) {
            n5 = (float)Math.pow(n2, 0.33333334f);
        }
        else {
            n5 = n2 * 7.787037f + 0.13793103f;
        }
        float n6;
        if (n3 > 0.008856452f) {
            n6 = (float)Math.pow(n3, 0.33333334f);
        }
        else {
            n6 = n3 * 7.787037f + 0.13793103f;
        }
        float n7;
        if (n4 > 0.008856452f) {
            n7 = (float)Math.pow(n4, 0.33333334f);
        }
        else {
            n7 = n4 * 7.787037f + 0.13793103f;
        }
        array[0] = jb2.E(116.0f * n6 - 16.0f, 0.0f, 100.0f);
        array[1] = jb2.E((n5 - n6) * 500.0f, -128.0f, 128.0f);
        array[2] = jb2.E((n6 - n7) * 200.0f, -128.0f, 128.0f);
        return array;
    }
    
    public final float b(final int n) {
        float n2;
        if (n == 0) {
            n2 = 100.0f;
        }
        else {
            n2 = 128.0f;
        }
        return n2;
    }
    
    public final float c(final int n) {
        float n2;
        if (n == 0) {
            n2 = 0.0f;
        }
        else {
            n2 = -128.0f;
        }
        return n2;
    }
    
    public final float[] e(final float[] array) {
        array[0] = jb2.E(array[0], 0.0f, 100.0f);
        array[1] = jb2.E(array[1], -128.0f, 128.0f);
        array[2] = jb2.E(array[2], -128.0f, 128.0f);
        final float n = (array[0] + 16.0f) / 116.0f;
        final float n2 = array[1] * 0.002f + n;
        final float n3 = n - array[2] * 0.005f;
        float n4;
        if (n2 > 0.20689656f) {
            n4 = n2 * n2 * n2;
        }
        else {
            n4 = (n2 - 0.13793103f) * 0.12841855f;
        }
        float n5;
        if (n > 0.20689656f) {
            n5 = n * n * n;
        }
        else {
            n5 = (n - 0.13793103f) * 0.12841855f;
        }
        float n6;
        if (n3 > 0.20689656f) {
            n6 = n3 * n3 * n3;
        }
        else {
            n6 = (n3 - 0.13793103f) * 0.12841855f;
        }
        final float[] m0 = eg8.M0;
        array[0] = n4 * m0[0];
        array[1] = n5 * m0[1];
        array[2] = n6 * m0[2];
        return array;
    }
}
