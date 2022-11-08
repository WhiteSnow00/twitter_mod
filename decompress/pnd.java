import com.twitter.app.common.inject.retained.RetainedObjectGraph;
import com.twitter.app.common.inject.view.ViewObjectGraph;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.app.Dialog;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pnd extends cl1 implements t2e
{
    public final mob<pnd> m2;
    
    public pnd() {
        this.m2 = (mob<pnd>)new mob((koo)new ond(this));
    }
    
    public pnd(final xqa<Activity, Integer, Dialog> xqa) {
        super((xqa)xqa);
        this.m2 = (mob<pnd>)new mob((koo)new ond(this));
    }
    
    public final aod b1() {
        return (aod)this.m2;
    }
    
    public final boolean g() {
        return ((z9)this.m2).g();
    }
    
    public final z7x i() {
        return this.v0().i();
    }
    
    public Dialog j2(final Dialog dialog) {
        final jn6 c = this.n().c();
        if (c != null) {
            dialog.setContentView(c.getView());
        }
        return dialog;
    }
    
    public void k1(final Bundle bundle) {
        super.k1(bundle);
        this.m2.e((Fragment)this, (rsm)this, bundle);
    }
    
    public void m2() {
    }
    
    public final ViewObjectGraph n() {
        return ((z9)this.b1()).n();
    }
    
    public final RetainedObjectGraph o() {
        return ((z9)this.b1()).o();
    }
    
    public final t4j t0(final Class clazz) {
        return ((go1)this.o()).B(clazz);
    }
    
    public final hl8 v0() {
        return (hl8)this.z0(hl8.class);
    }
    
    public final t4j z0(final Class clazz) {
        return ((go1)this.n()).B(clazz);
    }
}
