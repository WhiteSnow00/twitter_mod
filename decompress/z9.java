import com.twitter.app.common.inject.view.ViewObjectGraph$a;
import android.os.Trace;
import com.twitter.util.user.UserIdentifier;
import com.twitter.app.common.inject.retained.RetainedObjectGraph$a;
import java.util.Objects;
import android.os.Bundle;
import com.twitter.app.common.inject.view.ViewObjectGraph;
import com.twitter.app.common.inject.retained.RetainedObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class z9<T extends qdc & nec> implements aod
{
    public static final z9.z9$a Companion;
    public final koo C0;
    public RetainedObjectGraph D0;
    public ViewObjectGraph E0;
    
    static {
        Companion = new z9.z9$a();
    }
    
    public z9(final koo c0) {
        this.C0 = c0;
    }
    
    public final void a(final T t, final rsm rsm, final Bundle bundle) {
        zzd.f((Object)rsm, "retainer");
        if (this.D0 == null) {
            zzd.c((Object)t);
            final UserIdentifier q = t.q();
            final RetainedObjectGraph d0 = (RetainedObjectGraph)rsm.D0("retained_object_graph");
            this.D0 = d0;
            if (d0 != null && !q.equals(rsm.D0("graph_owner"))) {
                final RetainedObjectGraph d2 = this.D0;
                zzd.c((Object)d2);
                jgw.c0((go1)d2);
                this.D0 = null;
            }
            if (this.D0 == null) {
                final Class<? extends qdc> class1 = t.getClass();
                Objects.requireNonNull(qv8.Companion);
                zzd.f((Object)q, "userIdentifier");
                final pta a = ((qv8)afw.Companion.a().e(q, (Class)qv8.class)).a0().a((Class)class1);
                final int a2 = w4j.a;
                final RetainedObjectGraph$a retainedObjectGraph$a = (RetainedObjectGraph$a)a;
                if (retainedObjectGraph$a == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No BaseRetainedObjectGraph.Builder provided for ");
                    sb.append(class1);
                    throw new IllegalStateException(sb.toString());
                }
                rsm.w("retained_object_graph", (Object)(this.D0 = this.c(retainedObjectGraph$a, bundle, t).b()));
                rsm.w("graph_owner", (Object)q);
            }
            final RetainedObjectGraph d3 = this.D0;
            zzd.c((Object)d3);
            ((psm)((go1)d3).B((Class)psm.class)).a();
            return;
        }
        throw new IllegalStateException("The retained object graph is already set.".toString());
    }
    
    public final void b(final T t, final Bundle bundle) {
        final ViewObjectGraph$a h1 = this.o().h1();
        zzd.e((Object)h1, "getRetainedObjectGraph<R\u2026tViewObjectGraphBuilder()");
        final ViewObjectGraph b = this.d(h1, bundle, t).b();
        zzd.c((Object)(this.E0 = b));
        final l7x l7x = (l7x)((go1)b).B((Class)l7x.class);
        Label_0151: {
            if (tut.a()) {
                final Class<? extends l7x> class1 = l7x.getClass();
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewInitializationObjectSubgraph#initializeObjects");
                sb.append(" ");
                sb.append(class1);
                String s;
                if ((s = sb.toString()) == null) {
                    s = l7x.getClass().toString();
                    zzd.e((Object)s, "tracedObject.javaClass.toString()");
                }
                final String a2 = hkr.a2(s, 120);
                try {
                    Trace.beginSection(a2);
                    l7x.a();
                    break Label_0151;
                }
                finally {
                    Trace.endSection();
                }
            }
            l7x.a();
        }
        this.C0.run();
    }
    
    public abstract RetainedObjectGraph$a c(final RetainedObjectGraph$a p0, final Bundle p1, final T p2);
    
    public abstract ViewObjectGraph$a d(final ViewObjectGraph$a p0, final Bundle p1, final T p2);
    
    public final boolean g() {
        return this.E0 != null;
    }
    
    public final <RC extends ViewObjectGraph> RC n() {
        final ViewObjectGraph e0 = this.E0;
        if (e0 != null) {
            final int a = w4j.a;
            zzd.e((Object)e0, "cast(viewObjectGraph)");
            return (RC)e0;
        }
        throw new IllegalStateException("The view object graph is not initialized.".toString());
    }
    
    public final <RC extends RetainedObjectGraph> RC o() {
        final RetainedObjectGraph d0 = this.D0;
        if (d0 != null) {
            final int a = w4j.a;
            zzd.e((Object)d0, "cast(retainedObjectGraph)");
            return (RC)d0;
        }
        throw new IllegalStateException("The retained object graph is not initialized.".toString());
    }
    
    public final t4j t0(final Class clazz) {
        return this.o().B(clazz);
    }
    
    public final hl8 v0() {
        return (hl8)this.z0(hl8.class);
    }
    
    public final t4j z0(final Class clazz) {
        return this.n().B(clazz);
    }
}
