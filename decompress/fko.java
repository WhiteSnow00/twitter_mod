import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fko
{
    public static final a Companion;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    
    static {
        Companion = new a();
        Objects.requireNonNull(jy6.Companion);
        lr0.d(0.0f, 0.0f, 0.0f, 0.0f, jy6.a);
    }
    
    public fko(final float a, final float b, final float c, final float d, final long e, final long f, final long g, final long h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fko)) {
            return false;
        }
        final fko fko = (fko)o;
        return zzd.a((Object)this.a, (Object)fko.a) && zzd.a((Object)this.b, (Object)fko.b) && zzd.a((Object)this.c, (Object)fko.c) && zzd.a((Object)this.d, (Object)fko.d) && jy6.a(this.e, fko.e) && jy6.a(this.f, fko.f) && jy6.a(this.g, fko.g) && jy6.a(this.h, fko.h);
    }
    
    @Override
    public final int hashCode() {
        return jy6.d(this.h) + (jy6.d(this.g) + (jy6.d(this.f) + (jy6.d(this.e) + c0.h(this.d, c0.h(this.c, c0.h(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31)) * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final long e = this.e;
        final long f = this.f;
        final long g = this.g;
        final long h = this.h;
        final StringBuilder sb = new StringBuilder();
        sb.append(oyz.c0(this.a));
        sb.append(", ");
        sb.append(oyz.c0(this.b));
        sb.append(", ");
        sb.append(oyz.c0(this.c));
        sb.append(", ");
        sb.append(oyz.c0(this.d));
        final String string = sb.toString();
        if (!jy6.a(e, f) || !jy6.a(f, g) || !jy6.a(g, h)) {
            final StringBuilder z = bd.z("RoundRect(rect=", string, ", topLeft=");
            z.append((Object)jy6.e(e));
            z.append(", topRight=");
            z.append((Object)jy6.e(f));
            z.append(", bottomRight=");
            z.append((Object)jy6.e(g));
            z.append(", bottomLeft=");
            z.append((Object)jy6.e(h));
            z.append(')');
            return z.toString();
        }
        if (jy6.b(e) == jy6.c(e)) {
            final StringBuilder z2 = bd.z("RoundRect(rect=", string, ", radius=");
            z2.append(oyz.c0(jy6.b(e)));
            z2.append(')');
            return z2.toString();
        }
        final StringBuilder z3 = bd.z("RoundRect(rect=", string, ", x=");
        z3.append(oyz.c0(jy6.b(e)));
        z3.append(", y=");
        z3.append(oyz.c0(jy6.c(e)));
        z3.append(')');
        return z3.toString();
    }
    
    public static final class a
    {
    }
}
