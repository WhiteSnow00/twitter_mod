import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xcc
{
    static {
        final ycc$a companion = ycc.Companion;
    }
    
    public static List<jwd> a(final zus zus) {
        Objects.requireNonNull(ycc.Companion);
        Object o;
        if (zus instanceof ycc) {
            o = ((ycc)zus).f();
        }
        else {
            o = f2a.D0;
        }
        return (List<jwd>)o;
    }
}
