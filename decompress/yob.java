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

public final class yob implements ncc, pto, w9x
{
    public final Fragment D0;
    public final s9x E0;
    public f F0;
    public oto G0;
    
    public yob(final Fragment d0, final s9x e0) {
        this.F0 = null;
        this.G0 = null;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final nto A() {
        this.c();
        return this.G0.b;
    }
    
    public final void a(final d$b d$b) {
        this.F0.f(d$b);
    }
    
    public final d b() {
        this.c();
        return (d)this.F0;
    }
    
    public final void c() {
        if (this.F0 == null) {
            this.F0 = new f((xaf)this);
            (this.G0 = oto.a((pto)this)).b();
            hto.a((pto)this);
        }
    }
    
    public final a57 i0() {
        while (true) {
            for (Context context = this.D0.J1().getApplicationContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
                if (context instanceof Application) {
                    final Application application = (Application)context;
                    final qth qth = new qth();
                    if (application != null) {
                        ((a57)qth).a.put(q3j.L0, application);
                    }
                    ((a57)qth).a.put(hto.a, this);
                    ((a57)qth).a.put(hto.b, this);
                    final Bundle j0 = this.D0.J0;
                    if (j0 != null) {
                        ((a57)qth).a.put(hto.c, j0);
                    }
                    return (a57)qth;
                }
            }
            final Application application = null;
            continue;
        }
    }
    
    public final s9x p() {
        this.c();
        return this.E0;
    }
}
