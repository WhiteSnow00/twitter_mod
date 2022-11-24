import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class twe extends lx
{
    public twe(final mx mx) {
        e0e.f((Object)mx, "alignmentLinesOwner");
        super(mx);
    }
    
    @Override
    public final long b(final qni qni, final long n) {
        e0e.f((Object)qni, "$this$calculatePositionInParent");
        return qni.x1(n);
    }
    
    @Override
    public final Map<fx, Integer> c(final qni qni) {
        e0e.f((Object)qni, "<this>");
        return qni.P0().d();
    }
    
    @Override
    public final int d(final qni qni, final fx fx) {
        e0e.f((Object)fx, "alignmentLine");
        return ((bdg)qni).i0(fx);
    }
}
