import java.util.Objects;
import android.os.Bundle;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uui
{
    public static final a Companion;
    public final List<d1p> a;
    public final String b;
    
    static {
        Companion = new a();
    }
    
    public uui(final List<? extends d1p> a, final String b) {
        e0e.f((Object)a, "scribeItems");
        e0e.f((Object)b, "scribeAction");
        this.a = (List<d1p>)a;
        this.b = b;
    }
    
    public static final uui a(final Bundle bundle, final String s) {
        Objects.requireNonNull(uui.Companion);
        e0e.f((Object)bundle, "bundle");
        return (uui)gmp.a(bundle.getByteArray(s), (nmp)uui.uui$b.b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof uui)) {
            return false;
        }
        final uui uui = (uui)o;
        return e0e.a((Object)this.a, (Object)uui.a) && e0e.a((Object)this.b, (Object)uui.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final List<d1p> a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationScribeInfo(scribeItems=");
        sb.append(a);
        sb.append(", scribeAction=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
