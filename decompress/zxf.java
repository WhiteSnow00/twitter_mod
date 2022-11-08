import android.app.Dialog;
import androidx.appcompat.app.e;
import java.util.List;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import com.twitter.android.liveevent.landing.scribe.a;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zxf
{
    public final msp a;
    public final fxe<lt7> b;
    public final Activity c;
    public final a d;
    public final mbi<?> e;
    public final xjq f;
    
    public zxf(final Activity c, final fxe<lt7> b, final msp a, final a d, final mbi<?> e, final xjq f) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final qof qof, final String s) {
        final Activity c = this.c;
        final List w = ijf.w((Object)new zqk(((Context)c).getString(2131958047), (zqk$a)new qe8((Object)this, (Object)qof, (Object)s)), (Object[])new zqk[] { new zqk(((Context)this.c).getString(2131958042), (zqk$a)new n1b((Object)this, (Object)qof, (Object)s)), new zqk(((Context)this.c).getString(2131958027), (zqk$a)new xj8((Object)this, (Object)qof, (Object)s, 4)) });
        final int size = w.size();
        final String[] array = new String[size];
        for (int i = 0; i < size; ++i) {
            array[i] = ((zqk)w.get(i)).a;
        }
        final qmg qmg = new qmg((Context)c, 0);
        qmg.l((CharSequence[])array, (DialogInterface$OnClickListener)new yr2((Object)w, 10));
        final e create = qmg.create();
        ((Dialog)create).show();
        ((Dialog)create).setOnCancelListener((DialogInterface$OnCancelListener)new yxf(this, s));
    }
}
