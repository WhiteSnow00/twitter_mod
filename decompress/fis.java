// 
// Decompiled by Procyon v0.6.0
// 

public final class fis
{
    public static final a Companion;
    public static final fis c;
    public final long a;
    public final long b;
    
    static {
        Companion = new a();
        c = new fis(fli.b0(0), fli.b0(0));
    }
    
    public fis(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fis)) {
            return false;
        }
        final long a = this.a;
        final fis fis = (fis)o;
        return xjs.a(a, fis.a) && xjs.a(this.b, fis.b);
    }
    
    @Override
    public final int hashCode() {
        return xjs.e(this.b) + xjs.e(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("TextIndent(firstLine=");
        j.append((Object)xjs.f(this.a));
        j.append(", restLine=");
        j.append((Object)xjs.f(this.b));
        j.append(')');
        return j.toString();
    }
    
    public static final class a
    {
    }
}
