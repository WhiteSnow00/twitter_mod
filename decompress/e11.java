import java.util.Comparator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e11 extends gue implements rtb<g31, List<? extends d31>>
{
    public static final e11 C0;
    
    static {
        C0 = new e11();
    }
    
    public e11() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final g31 g31 = (g31)o;
        zzd.f((Object)g31, "response");
        return or4.f2((Iterable)g31.a, (Comparator)new d11());
    }
}
