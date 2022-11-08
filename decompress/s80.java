import android.content.ContentValues;
import android.view.View;
import tv.periscope.android.view.RootDragLayout;
import tv.periscope.android.ui.broadcast.view.MenuViewPager;
import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s80 implements l1z
{
    public final Object a = a;
    public final Object b = b;
    public final Object c = c;
    public Object d = d;
    
    public static void c(final ContentValues contentValues, final ram ram) {
        contentValues.put("data_type", Integer.valueOf(23));
        contentValues.put("data", aav.j4((Object)ram.q, (alp)qam.b));
    }
    
    public final void a() {
        final uzz uzz = (uzz)this.d;
        uzz.g.post((Runnable)new kzz(uzz, (v1r)this.a, 5, 0));
    }
    
    public final void b(final String s) {
        if (s == null) {
            return;
        }
        ((z5h)this.a).c(s);
    }
    
    public final void d() {
        if (!((Intent)this.b).getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((Intent)this.b).putExtra("triggered_from_app_after_verification", true);
            ((Context)this.c).sendBroadcast((Intent)this.b);
            return;
        }
        ((bny)this.d).a.k("Splits copied and verified more than once.", new Object[0]);
    }
    
    public final void e(final int n) {
        final uzz uzz = (uzz)this.d;
        uzz.g.post((Runnable)new kzz(uzz, (v1r)this.a, 6, n));
    }
    
    public final void f() {
        final kus kus = (kus)this.d;
        final int a = w4j.a;
        c((ContentValues)this.c, (ram)kus);
        if (rqu.v((tyr)this.a, "timeline", (ContentValues)this.c) > 0L) {
            ((m5h)this.b).b(1);
        }
    }
    
    public final void g() {
        ((RootDragLayout)this.b).j((View)this.a);
        ((vtj)this.c).b((View)this.d);
    }
}
