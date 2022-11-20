import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hjf extends xi1
{
    public hjf(final Intent intent) {
        super(intent);
    }
    
    public hjf(final Intent intent, final fu8 fu8) {
        super(intent);
    }
    
    public static hjf a(final scv scv) {
        final a a = new a();
        a.a.putExtra("creator_id", scv.L0);
        a.a.putExtra("list_id", scv.J0);
        a.r(scv.S0);
        a.a.putExtra("list_name", scv.N0);
        a.a.putExtra("is_private", scv.F0);
        a.a.putExtra("list_fullname", scv.R0);
        a.a.putExtra("list_description", scv.P0);
        final cgv t0 = scv.T0;
        if (t0 != null) {
            a.q(t0.K0);
        }
        return (hjf)a.e();
    }
    
    public static final class a extends xi1.a<hjf, a>
    {
        public final Object i() {
            return new hjf(super.a, null);
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
