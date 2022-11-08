// 
// Decompiled by Procyon v0.6.0
// 

public final class mas
{
    public static final mas d;
    public static final mas e;
    public static final mas f;
    public static final mas g;
    public static final mas h;
    public static final mas i;
    public final float[] a;
    public final float[] b;
    public final float[] c;
    
    static {
        final mas mas = d = new mas();
        final float[] b = mas.b;
        b[0] = 0.55f;
        b[1] = 0.74f;
        b(mas);
        final mas mas2 = e = new mas();
        final float[] b2 = mas2.b;
        b2[0] = 0.3f;
        b2[1] = 0.5f;
        b2[2] = 0.7f;
        b(mas2);
        final mas mas3 = f = new mas();
        final float[] b3 = mas3.b;
        b3[1] = 0.26f;
        b3[2] = 0.45f;
        b(mas3);
        final mas mas4 = g = new mas();
        final float[] b4 = mas4.b;
        b4[0] = 0.55f;
        b4[1] = 0.74f;
        a(mas4);
        final mas mas5 = h = new mas();
        final float[] b5 = mas5.b;
        b5[0] = 0.3f;
        b5[1] = 0.5f;
        b5[2] = 0.7f;
        a(mas5);
        final mas mas6 = i = new mas();
        final float[] b6 = mas6.b;
        b6[1] = 0.26f;
        b6[2] = 0.45f;
        a(mas6);
    }
    
    public mas() {
        final float[] a = new float[3];
        this.a = a;
        final float[] b = new float[3];
        this.b = b;
        final float[] c = new float[3];
        this.c = c;
        a[0] = 0.0f;
        a[1] = 0.5f;
        a[2] = 1.0f;
        b[0] = 0.0f;
        b[1] = 0.5f;
        b[2] = 1.0f;
        c[0] = 0.24f;
        c[1] = 0.52f;
        c[2] = 0.24f;
    }
    
    public static void a(final mas mas) {
        final float[] a = mas.a;
        a[1] = 0.3f;
        a[2] = 0.4f;
    }
    
    public static void b(final mas mas) {
        final float[] a = mas.a;
        a[0] = 0.35f;
        a[1] = 1.0f;
    }
}
