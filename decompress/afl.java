import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afl extends bts
{
    public final qgv d;
    
    public afl(final Bundle bundle) {
        super(bundle);
        this.d = (qgv)gmp.a(((am1)this).a.getByteArray("timeline_arg_profile_user"), (nmp)qgv.P1);
    }
    
    public final String j() {
        return zgl.i(this.r());
    }
    
    public final boolean p() {
        return ((am1)this).a.getBoolean("arg_is_unlimited_timeline");
    }
    
    public boolean q() {
        return this instanceof x7l;
    }
    
    public final boolean r() {
        return ((am1)this).a.getBoolean("arg_is_me");
    }
    
    public abstract static class a<T extends afl, B extends a<T, B>> extends bts$a<T, B>
    {
        public a(final Bundle bundle) {
            super(bundle);
        }
        
        public final B w(final boolean b) {
            ((am1.a)this).a.putBoolean("arg_is_me", b);
            final int a = o5j.a;
            return (B)this;
        }
        
        public final B x(final qgv qgv) {
            ((am1.a)this).a.putByteArray("timeline_arg_profile_user", gmp.e((Object)qgv, (nmp)qgv.P1));
            final int a = o5j.a;
            return (B)this;
        }
    }
}
