import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijd extends gue implements rtb<t8d, naj<? extends x8d>>
{
    public final /* synthetic */ kwg C0;
    
    public ijd(final kwg c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t8d t8d = (t8d)o;
        zzd.f((Object)t8d, "request");
        return b5j.fromFuture((Future)this.C0.d(t8d));
    }
}
