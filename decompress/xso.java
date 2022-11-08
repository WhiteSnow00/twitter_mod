import android.os.BaseBundle;
import java.util.Map;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.savedstate.Recreator;
import androidx.lifecycle.d$c;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xso
{
    public static final a Companion;
    public final yso a;
    public final wso b;
    public boolean c;
    
    static {
        Companion = new a();
    }
    
    public xso(final yso a) {
        this.a = a;
        this.b = new wso();
    }
    
    public static final xso a(final yso yso) {
        Objects.requireNonNull(xso.Companion);
        zzd.f((Object)yso, "owner");
        return new xso(yso);
    }
    
    public final void b() {
        final d b = ((lbf)this.a).b();
        zzd.e((Object)b, "owner.lifecycle");
        if (b.b() != d$c.D0) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        b.a((kbf)new Recreator(this.a));
        final wso b2 = this.b;
        Objects.requireNonNull(b2);
        if (b2.b ^ true) {
            b.a((kbf)new vso(b2));
            b2.b = true;
            this.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }
    
    public final void c(Bundle bundle) {
        if (!this.c) {
            this.b();
        }
        final d b = ((lbf)this.a).b();
        zzd.e((Object)b, "owner.lifecycle");
        if (!(b.b().b(d$c.F0) ^ true)) {
            final StringBuilder g = w48.g("performRestore cannot be called when owner is ");
            g.append(b.b());
            throw new IllegalStateException(g.toString().toString());
        }
        final wso b2 = this.b;
        if (!b2.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (b2.d ^ true) {
            if (bundle != null) {
                bundle = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            else {
                bundle = null;
            }
            b2.c = bundle;
            b2.d = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
    }
    
    public final void d(final Bundle bundle) {
        zzd.f((Object)bundle, "outBundle");
        final wso b = this.b;
        Objects.requireNonNull(b);
        final Bundle bundle2 = new Bundle();
        final Bundle c = b.c;
        if (c != null) {
            bundle2.putAll(c);
        }
        final soo.d g = b.a.g();
        while (g.hasNext()) {
            final Map.Entry entry = (Map.Entry)g.next();
            bundle2.putBundle((String)entry.getKey(), ((wso$c)entry.getValue()).a());
        }
        if (!((BaseBundle)bundle2).isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
    
    public static final class a
    {
    }
}
