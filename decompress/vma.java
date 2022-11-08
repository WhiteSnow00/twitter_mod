import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vma implements oax
{
    public static final a Companion;
    public static final vma d;
    public final wla a;
    public final boolean b;
    public final boolean c;
    
    static {
        Companion = new a();
        final wla f = wla.f;
        zzd.e((Object)f, "EMPTY");
        d = new vma(f, true, false);
    }
    
    public vma(final wla a, final boolean b, final boolean c) {
        zzd.f((Object)a, "settings");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static vma l(final vma vma, final boolean b, final boolean b2) {
        final wla a = vma.a;
        Objects.requireNonNull(vma);
        zzd.f((Object)a, "settings");
        return new vma(a, b, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vma)) {
            return false;
        }
        final vma vma = (vma)o;
        return zzd.a((Object)this.a, (Object)vma.a) && this.b == vma.b && this.c == vma.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        int n = 1;
        int n2 = b;
        if (b != 0) {
            n2 = 1;
        }
        final int c = this.c ? 1 : 0;
        if (c == 0) {
            n = c;
        }
        return (hashCode * 31 + n2) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final wla a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("ExploreSettingsViewState(settings=");
        sb.append(a);
        sb.append(", loading=");
        sb.append(b);
        sb.append(", error=");
        return bd.y(sb, c, ")");
    }
    
    public static final class a
    {
    }
}
