import java.util.Iterator;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cw extends fgr
{
    public final List<bti> c;
    
    public cw(final bti bti, final List<bti> c) {
        super(bti);
        this.c = c;
    }
    
    public final List<cri> c(final Context context) {
        final ged$b g0 = ged.G0;
        final int a = o5j.a;
        return (List<cri>)g0;
    }
    
    public final List<Long> d() {
        return new t5e((Iterable)this.c, (lub)cje.D).t3();
    }
    
    public final int f() {
        return 2131231779;
    }
    
    public final lri g(final Context context) {
        final iri iri = new iri();
        for (final bti bti : this.c) {
            final String i = bti.i;
            String s = "";
            String s2;
            if ((s2 = i) == null) {
                s2 = "";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append('\u2007');
            final String e = bti.e;
            if (e != null) {
                s = e;
            }
            sb.append(s);
            final SpannableString spannableString = new SpannableString((CharSequence)sb.toString());
            spannableString.setSpan((Object)new ForegroundColorSpan(context.getResources().getColor(17170437)), 0, s2.length(), 33);
            iri.e.add(gri.d((CharSequence)spannableString));
        }
        iri.k((CharSequence)this.h());
        ((lri)iri).b = gri.d((CharSequence)this.i(context));
        return (lri)iri;
    }
    
    public final String h() {
        return flr.l(this.e());
    }
    
    public final String i(final Context context) {
        return context.getString(2131955489, new Object[] { this.c.size() });
    }
}
