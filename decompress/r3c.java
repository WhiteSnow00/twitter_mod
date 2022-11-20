import java.util.UUID;
import java.util.Objects;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r3c implements mnb
{
    public final onb D0;
    public final s3c E0;
    
    public r3c(final Application application, final xbm xbm) {
        czd.f((Object)application, "application");
        czd.f((Object)xbm, "releaseCompletable");
        final onb d0 = new onb(xbm);
        this.D0 = d0;
        this.E0 = new s3c(this);
        application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new r3c$a(this));
    }
    
    public final caf<nnb> E(final qsb<? super nnb, Boolean> qsb) {
        final onb d0 = this.D0;
        Objects.requireNonNull(d0);
        return (caf<nnb>)w1e.b((caf)d0, (qsb)qsb);
    }
    
    public final h5j<nnb> a() {
        return (h5j<nnb>)this.D0.a();
    }
    
    public final h5j<mij> b() {
        return (h5j<mij>)jg9.g((mnb)this.D0);
    }
    
    public final h5j<rij> c() {
        return (h5j<rij>)jg9.l((mnb)this.D0);
    }
    
    public final h5j<oij> d() {
        return (h5j<oij>)jg9.i((mnb)this.D0);
    }
    
    public final mnb l(final xbm xbm) {
        czd.f((Object)xbm, "releaseCompletable");
        final onb d0 = this.D0;
        Objects.requireNonNull(d0);
        return jg9.o((mnb)d0, xbm);
    }
    
    public final h5j<nij> r() {
        return (h5j<nij>)jg9.j((mnb)this.D0);
    }
    
    public final mnb s(final UUID uuid) {
        czd.f((Object)uuid, "retainedKey");
        final onb d0 = this.D0;
        Objects.requireNonNull(d0);
        return jg9.c((mnb)d0, uuid);
    }
    
    public final h5j<wij> t() {
        return (h5j<wij>)jg9.h((mnb)this.D0);
    }
    
    public final h5j<sij> v() {
        return (h5j<sij>)jg9.m((mnb)this.D0);
    }
    
    public final h5j<vij> z() {
        return (h5j<vij>)jg9.f((mnb)this.D0);
    }
}
