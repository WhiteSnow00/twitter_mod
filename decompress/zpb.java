import android.os.Bundle;
import android.content.Context;
import android.app.Application;
import android.content.ContextWrapper;
import androidx.lifecycle.d;
import androidx.lifecycle.d$b;
import androidx.lifecycle.f;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zpb implements pdc, juo, pax
{
    public final Fragment F0;
    public final lax G0;
    public f H0;
    public iuo I0;
    
    public zpb(final Fragment f0, final lax g0) {
        this.H0 = null;
        this.I0 = null;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final huo A() {
        this.c();
        return this.I0.b;
    }
    
    public final void a(final d$b d$b) {
        this.H0.f(d$b);
    }
    
    public final d b() {
        this.c();
        return (d)this.H0;
    }
    
    public final void c() {
        if (this.H0 == null) {
            this.H0 = new f((tbf)this);
            (this.I0 = iuo.a((juo)this)).b();
            buo.a((juo)this);
        }
    }
    
    @Override
    public final f67 i0() {
        while (true) {
            for (Context context = this.F0.J1().getApplicationContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
                if (context instanceof Application) {
                    final Application application = (Application)context;
                    final guh guh = new guh();
                    if (application != null) {
                        guh.a.put(qjy.J0, application);
                    }
                    guh.a.put(buo.a, this);
                    guh.a.put(buo.b, this);
                    final Bundle l0 = this.F0.L0;
                    if (l0 != null) {
                        guh.a.put(buo.c, l0);
                    }
                    return guh;
                }
            }
            final Application application = null;
            continue;
        }
    }
    
    public final lax t() {
        this.c();
        return this.G0;
    }
}
