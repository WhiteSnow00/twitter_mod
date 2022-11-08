import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ael extends qrs
{
    public final hfv d;
    
    public ael(final Bundle bundle) {
        super(bundle);
        this.d = (hfv)tkp.a(((zl1)this).a.getByteArray("timeline_arg_profile_user"), (alp)hfv.M1);
    }
    
    public final String j() {
        return bgl.i(this.r());
    }
    
    public final boolean p() {
        return ((zl1)this).a.getBoolean("arg_is_unlimited_timeline");
    }
    
    public boolean q() {
        return this instanceof y6l;
    }
    
    public final boolean r() {
        return ((zl1)this).a.getBoolean("arg_is_me");
    }
    
    public abstract static class a<T extends ael, B extends a<T, B>> extends qrs$a<T, B>
    {
        public a(final Bundle bundle) {
            super(bundle);
        }
        
        public final B w(final boolean b) {
            ((zl1$a)this).a.putBoolean("arg_is_me", b);
            final int a = w4j.a;
            return (B)this;
        }
        
        public final B x(final hfv hfv) {
            ((zl1$a)this).a.putByteArray("timeline_arg_profile_user", tkp.e((Object)hfv, (alp)hfv.M1));
            final int a = w4j.a;
            return (B)this;
        }
    }
    
    public abstract static class b<T extends ael, B extends b<T, B>> extends a<T, b<T, B>>
    {
        public b(final Bundle bundle) {
            super(bundle);
        }
        
        public final B y(final boolean b) {
            ((zl1$a)this).a.putBoolean("arg_is_unlimited_timeline", b);
            final int a = w4j.a;
            return (B)this;
        }
    }
}
