import java.util.Locale;
import android.content.res.Resources;
import java.text.SimpleDateFormat;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqy implements dsy
{
    public final Object F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    
    public dqy(final Context context) {
        final Resources resources = context.getResources();
        e0e.e((Object)resources, "context.resources");
        this.F0 = resources;
        final Locale locale = resources.getConfiguration().locale;
        this.G0 = locale;
        this.H0 = new SimpleDateFormat(rrs.k(context), locale);
        this.I0 = new SimpleDateFormat(rrs.j(context), locale);
        this.J0 = new SimpleDateFormat(rrs.i(context), locale);
    }
    
    public dqy(final dsy f0, final dsy g0, final dsy h0, final dsy i0, final dsy j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public dqy(final h9e f0, final vkv g0, final nxe h0) {
        e0e.f((Object)f0, "components");
        e0e.f((Object)g0, "typeParameterResolver");
        e0e.f((Object)h0, "delegateForDefaultTypeQualifiers");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = h0;
        this.J0 = new x9e(this, (vkv)g0);
    }
    
    public final /* bridge */ Object a() {
        return new ypy((dly)((dsy)this.F0).a(), (nry)wry.b(this.G0), (nry)wry.b(this.H0), (mry)((dsy)this.I0).a(), (wyy)((dsy)this.J0).a());
    }
    
    public final String b(final jk1 jk1) {
        e0e.f((Object)jk1, "entry");
        final long a = ((ws6)jk1).a();
        String s;
        if (nq1.g(a, 0)) {
            s = ((SimpleDateFormat)this.H0).format(a);
            e0e.e((Object)s, "sameDayDateFormat.format(messageDate)");
        }
        else if (nq1.e(a)) {
            s = ((Resources)this.F0).getString(2131959658, new Object[] { ((SimpleDateFormat)this.H0).format(a) });
            e0e.e((Object)s, "res.getString(\n         \u2026essageDate)\n            )");
        }
        else if (nq1.f(a)) {
            s = ((SimpleDateFormat)this.I0).format(a);
            e0e.e((Object)s, "sameWeekDateFormat.format(messageDate)");
        }
        else {
            s = ((SimpleDateFormat)this.J0).format(a);
            e0e.e((Object)s, "otherDateFormat.format(messageDate)");
        }
        return s;
    }
    
    public final tlh c() {
        return ((h9e)this.F0).o;
    }
    
    public final njr d() {
        return ((h9e)this.F0).a;
    }
}
