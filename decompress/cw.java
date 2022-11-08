import java.util.Iterator;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cw extends oer
{
    public final List<jsi> c;
    
    public cw(final jsi jsi, final List<jsi> c) {
        super(jsi);
        this.c = c;
    }
    
    public final List<iqi> c(final Context context) {
        final ced$b d0 = ced.D0;
        final int a = w4j.a;
        return (List<iqi>)d0;
    }
    
    public final List<Long> d() {
        return new l5e((Iterable)this.c, (kub)qwv.d).t3();
    }
    
    public final int f() {
        return 2131231779;
    }
    
    public final rqi g(final Context context) {
        final oqi oqi = new oqi();
        for (final jsi jsi : this.c) {
            final String i = jsi.i;
            String s = "";
            String s2;
            if ((s2 = i) == null) {
                s2 = "";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append('\u2007');
            final String e = jsi.e;
            if (e != null) {
                s = e;
            }
            sb.append(s);
            final SpannableString spannableString = new SpannableString((CharSequence)sb.toString());
            spannableString.setSpan((Object)new ForegroundColorSpan(context.getResources().getColor(17170437)), 0, s2.length(), 33);
            oqi.e.add(mqi.d((CharSequence)spannableString));
        }
        oqi.k((CharSequence)this.h());
        ((rqi)oqi).b = mqi.d(this.i(context));
        return (rqi)oqi;
    }
    
    public final String h() {
        return pjr.l(this.e());
    }
    
    public final String i(final Context context) {
        return context.getString(2131955489, new Object[] { this.c.size() });
    }
}
