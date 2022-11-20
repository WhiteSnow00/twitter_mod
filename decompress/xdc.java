import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xdc
{
    static {
        final ydc$a companion = ydc.Companion;
    }
    
    public static List<nh0> a(final zus zus) {
        Objects.requireNonNull(ydc.Companion);
        czd.f((Object)zus, "timelineEntity");
        Object o;
        if (zus instanceof ydc) {
            o = ((ydc)zus).g();
        }
        else {
            o = f2a.D0;
        }
        return (List<nh0>)o;
    }
}
