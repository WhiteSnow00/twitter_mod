import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkf extends aj1
{
    public fkf(final Intent intent) {
        super(intent);
    }
    
    public fkf(final Intent intent, final d1 d1) {
        super(intent);
    }
    
    public static fkf a(final gdv gdv) {
        final a a = new a();
        a.a.putExtra("creator_id", gdv.N0);
        a.a.putExtra("list_id", gdv.L0);
        a.r(gdv.U0);
        a.a.putExtra("list_name", gdv.P0);
        a.a.putExtra("is_private", gdv.H0);
        a.a.putExtra("list_fullname", gdv.T0);
        a.a.putExtra("list_description", gdv.R0);
        final qgv v0 = gdv.V0;
        if (v0 != null) {
            a.q(v0.M0);
        }
        return (fkf)a.e();
    }
    
    public static final class a extends aj1.a<fkf, a>
    {
        public final Object i() {
            return new fkf(super.a, null);
        }
        
        public final a q(final String s) {
            super.a.putExtra("screen_name", s);
            return this;
        }
        
        public final a r(final String s) {
            super.a.putExtra("slug", s);
            return this;
        }
    }
}
