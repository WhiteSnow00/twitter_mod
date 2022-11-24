import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ms7 extends jvb implements stb<List<? extends hy7$h>, vzv>
{
    public ms7(final Object o) {
        super(1, o, (Class)ks7.class, "onRecentSearchesUpdated", "onRecentSearchesUpdated(Ljava/util/List;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        e0e.f((Object)list, "p0");
        final ks7 ks7 = (ks7)((ea3)this).receiver;
        Objects.requireNonNull(ks7);
        ks7.d((stb)new qs7(list));
        return vzv.a;
    }
}
