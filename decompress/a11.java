import java.util.Comparator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a11 extends ste implements qsb<b31, List<? extends y21>>
{
    public static final a11 D0;
    
    static {
        D0 = new a11();
    }
    
    public a11() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final b31 b31 = (b31)o;
        czd.f((Object)b31, "response");
        return mq4.F0((Iterable)b31.a, (Comparator)new z01());
    }
}
