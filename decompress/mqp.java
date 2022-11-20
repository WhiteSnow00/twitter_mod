import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqp implements jbx
{
    public final String a;
    public final boolean b;
    
    public mqp() {
        this(null, false, 3, null);
    }
    
    public mqp(final String a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public mqp(final String s, final boolean b, final int n, final rf8 rf8) {
        this.a = "";
        this.b = false;
    }
    
    public static mqp l(final mqp mqp, String a, boolean b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = mqp.a;
        }
        if ((n & 0x2) != 0x0) {
            b = mqp.b;
        }
        Objects.requireNonNull(mqp);
        czd.f((Object)a, "queryText");
        return new mqp(a, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mqp)) {
            return false;
        }
        final mqp mqp = (mqp)o;
        return czd.a((Object)this.a, (Object)mqp.a) && this.b == mqp.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        return neg.h("SettingsSearchToolbarViewState(queryText=", this.a, ", isFirstPageLoad=", this.b, ")");
    }
}
