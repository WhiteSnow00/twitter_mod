// 
// Decompiled by Procyon v0.6.0
// 

public abstract class as4
{
    public static final a Companion;
    public final String a;
    public final long b;
    public final int c;
    
    static {
        Companion = new a();
    }
    
    public as4(final String a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (c >= -1 && c <= 63) {
            return;
        }
        throw new IllegalArgumentException("The id must be between -1 and 63");
    }
    
    public abstract float[] a(final float[] p0);
    
    public abstract float b(final int p0);
    
    public abstract float c(final int p0);
    
    public boolean d() {
        return false;
    }
    
    public abstract float[] e(final float[] p0);
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        boolean a;
        final boolean b = a = false;
        if (o != null) {
            if (!zzd.a((Object)g9m.a((Class)this.getClass()), (Object)g9m.a((Class)o.getClass()))) {
                a = b;
            }
            else {
                final as4 as4 = (as4)o;
                if (this.c != as4.c) {
                    return false;
                }
                if (!zzd.a((Object)this.a, (Object)as4.a)) {
                    a = b;
                }
                else {
                    a = vr4.a(this.b, as4.b);
                }
            }
        }
        return a;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final vr4$a companion = vr4.Companion;
        return (hashCode * 31 + (int)(b ^ b >>> 32)) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" (id=");
        sb.append(this.c);
        sb.append(", model=");
        sb.append((Object)vr4.b(this.b));
        sb.append(')');
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
