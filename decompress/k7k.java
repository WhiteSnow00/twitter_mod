import android.content.res.Resources;
import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k7k extends aj1
{
    public k7k(final Intent intent) {
        super(intent);
    }
    
    public static a a(String s, final Context context, final String... array) {
        final Resources resources = context.getResources();
        final a a = new a();
        a.w(s);
        a.a.putExtra("getPermissionsToRequest", array);
        s = resources.getString(2131955677);
        a.a.putExtra("getRetargetingTitle", s);
        a.v(resources.getString(2131952819));
        a.u(resources.getString(2131955472));
        s = resources.getString(2131955676);
        a.a.putExtra("getRetargetingMessageFormat", s);
        a.r(true);
        return a;
    }
    
    public static final class a extends aj1.a<k7k, a>
    {
        public final Object i() {
            return new k7k(super.a);
        }
        
        public final a q(final boolean b) {
            super.a.putExtra("isAlwaysShowPreliminaryDialog", b);
            return this;
        }
        
        public final a r(final boolean b) {
            super.a.putExtra("canShowRetargetingDialog", b);
            return this;
        }
        
        public final a s(final ica ica) {
            super.a.putExtra("getEventElementPrefix", gmp.e((Object)ica, (nmp)ica.d));
            return this;
        }
        
        public final a t(final String s) {
            super.a.putExtra("getPreliminaryMessage", s);
            return this;
        }
        
        public final a u(final String s) {
            super.a.putExtra("getPreliminaryNegativeButtonText", s);
            return this;
        }
        
        public final a v(final String s) {
            super.a.putExtra("getPreliminaryPositiveButtonText", s);
            return this;
        }
        
        public final a w(final String s) {
            super.a.putExtra("getPreliminaryTitle", s);
            return this;
        }
        
        public final a x() {
            super.a.putExtra("isUseSnackbar", true);
            return this;
        }
    }
}
