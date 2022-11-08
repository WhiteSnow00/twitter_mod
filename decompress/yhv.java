import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yhv extends gue implements rtb<gvj<Object, ? extends List<ldp>>, oyv>
{
    public final /* synthetic */ div<Object, ldp> C0;
    
    public yhv(final div<Object, ldp> c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        this.C0.f.onNext((Object)o);
        return oyv.a;
    }
}
