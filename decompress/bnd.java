import com.twitter.app.common.inject.retained.RetainedObjectGraph;
import com.twitter.app.common.inject.view.ViewObjectGraph;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bnd extends ro1 implements x1e
{
    public final inb<bnd> X1;
    
    public bnd() {
        this.X1 = new inb<bnd>((cpo)new and(this));
    }
    
    public final dnd b1() {
        return (dnd)this.X1;
    }
    
    public void e2() {
    }
    
    public final r8x i() {
        return this.v0().i();
    }
    
    public void k1(final Bundle bundle) {
        super.k1(bundle);
        this.X1.e(this, (jtm)this, bundle);
    }
    
    public final boolean l() {
        return ((x9)this.b1()).l();
    }
    
    public final ViewObjectGraph n() {
        return ((x9)this.b1()).n();
    }
    
    public final RetainedObjectGraph o() {
        return ((x9)this.b1()).o();
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
