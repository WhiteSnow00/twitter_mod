import android.app.Activity;
import android.os.Bundle;
import com.twitter.app.common.inject.retained.RetainedObjectGraph;
import com.twitter.app.common.inject.view.ViewObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public class zmd extends qo1 implements x1e, mcc
{
    public final mn<zmd> T0;
    
    public zmd() {
        this.T0 = (mn<zmd>)new mn((cpo)new ymd(this), 2);
    }
    
    public final void C() {
        super.onBackPressed();
    }
    
    public final void a() {
        super.finish();
    }
    
    @Override
    public final dnd b1() {
        return (dnd)this.T0;
    }
    
    public final void finish() {
        this.v0().p1().a();
    }
    
    public final r8x i() {
        return this.v0().i();
    }
    
    @Override
    public final boolean l() {
        return ((x9)this.b1()).l();
    }
    
    @Override
    public final ViewObjectGraph n() {
        return ((x9)this.b1()).n();
    }
    
    public final RetainedObjectGraph o() {
        return ((x9)this.b1()).o();
    }
    
    @Override
    public final void onBackPressed() {
        this.v0().h().j();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.T0.e((Activity)this, (jtm)this, bundle);
    }
    
    public final z4j t0(final Class clazz) {
        return ((co1)this.o()).B(clazz);
    }
    
    public final qk8 v0() {
        return (qk8)this.z0(qk8.class);
    }
    
    public final z4j z0(final Class clazz) {
        return ((co1)this.n()).B(clazz);
    }
}
