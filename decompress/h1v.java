// 
// Decompiled by Procyon v0.6.0
// 

public final class h1v
{
    public static h1v d;
    public int a;
    public long b;
    public long c;
    
    public h1v(final int n) {
        if (n != 1) {
            return;
        }
        this.a = 0;
        this.b = 0L;
        this.c = 0L;
    }
    
    public final void a(final long n, double sin, double n2) {
        final float n3 = (n - 946728000000L) / 8.64E7f;
        final float n4 = 0.01720197f * n3 + 6.24006f;
        final double n5 = n4;
        final double n6 = Math.sin(n4 * 3.0f) * 5.236000106378924E-6 + (Math.sin(2.0f * n4) * 3.4906598739326E-4 + (Math.sin(n5) * 0.03341960161924362 + n5)) + 1.796593063 + 3.141592653589793;
        n2 = -n2 / 360.0;
        n2 = Math.sin(2.0 * n6) * -0.0069 + (Math.sin(n5) * 0.0053 + (Math.round(n3 - 9.0E-4f - n2) + 9.0E-4f + n2));
        final double asin = Math.asin(Math.sin(0.4092797040939331) * Math.sin(n6));
        final double n7 = 0.01745329238474369 * sin;
        final double sin2 = Math.sin(-0.10471975803375244);
        sin = Math.sin(n7);
        sin = (sin2 - Math.sin(asin) * sin) / (Math.cos(asin) * Math.cos(n7));
        if (sin >= 1.0) {
            this.a = 1;
            this.b = -1L;
            this.c = -1L;
            return;
        }
        if (sin <= -1.0) {
            this.a = 0;
            this.b = -1L;
            this.c = -1L;
            return;
        }
        sin = (float)(Math.acos(sin) / 6.283185307179586);
        this.b = Math.round((n2 + sin) * 8.64E7) + 946728000000L;
        final long c = Math.round((n2 - sin) * 8.64E7) + 946728000000L;
        this.c = c;
        if (c < n && this.b > n) {
            this.a = 0;
        }
        else {
            this.a = 1;
        }
    }
}
