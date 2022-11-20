import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irf extends fo1<jqf>
{
    public final jrf E0;
    
    public irf(final jrf e0) {
        this.E0 = e0;
    }
    
    public final void onError(final Throwable t) {
        m8a.d(t);
        this.E0.a.a();
    }
    
    public final void onNext(final Object o) {
        final jqf jqf = (jqf)o;
        Objects.requireNonNull(jqf);
        final j7f d = this.E0.d;
        ((wgm)d.a).a((Object)jqf);
        if (jqf.f()) {
            ((wgm)d.b).a((Object)jqf.s);
        }
    }
}
