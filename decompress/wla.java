import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wla implements jbx
{
    public static final wla.wla$a Companion;
    public static final wla d;
    public final xka a;
    public final boolean b;
    public final boolean c;
    
    static {
        Companion = new wla.wla$a();
        final xka f = xka.f;
        czd.e((Object)f, "EMPTY");
        d = new wla(f, true, false);
    }
    
    public wla(final xka a, final boolean b, final boolean c) {
        czd.f((Object)a, "settings");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static wla l(final wla wla, final boolean b, final boolean b2) {
        final xka a = wla.a;
        Objects.requireNonNull(wla);
        czd.f((Object)a, "settings");
        return new wla(a, b, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wla)) {
            return false;
        }
        final wla wla = (wla)o;
        return czd.a((Object)this.a, (Object)wla.a) && this.b == wla.b && this.c == wla.c;
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
        final xka a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("ExploreSettingsViewState(settings=");
        sb.append(a);
        sb.append(", loading=");
        sb.append(b);
        sb.append(", error=");
        return wnj.D(sb, c, ")");
    }
}
