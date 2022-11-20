import android.text.Spanned;
import android.text.Spannable;
import android.view.View;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.text.style.UnderlineSpan;
import android.text.Editable;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import tv.periscope.android.ui.broadcaster.prebroadcast.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rtu implements ptu
{
    public final int a;
    public final ztu b;
    public final hna c;
    public final a d;
    
    public rtu(final hna c, final int a, final ztu b, final a d) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    @Override
    public final void a(final htk htk, final String s) {
        final String i = htk.i();
        jee.l((Object)i);
        final vwl f = htk.F();
        jee.l((Object)f);
        final vwl vwl = f;
        final kht$a b = this.b.b((CharSequence)i, f.E0);
        if (b != null) {
            final xlv$a a = xlv.a(this.b, s, i, b);
            htk.J(a.a);
            htk.c(a.b);
        }
    }
    
    @Override
    public final boolean b(final String s) {
        final Long a = b2v.a;
        final rfv b = sfv.b(s, sfv.b);
        if (!b.c || b.a > this.d.a()) {
            String s2;
            if ((s2 = s) == null) {
                s2 = "";
            }
            if (!s2.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final void c(final TextView textView, final int height, final int n, final int n2) {
        final ViewGroup$LayoutParams layoutParams = ((View)textView).getLayoutParams();
        layoutParams.height = height;
        textView.setPadding(((View)textView).getPaddingLeft(), n, ((View)textView).getPaddingRight(), n2);
        ((View)textView).setLayoutParams(layoutParams);
    }
    
    @Override
    public final void d(final Editable editable) {
        final String string = editable.toString();
        final List b = this.c.b(string);
        final int length = string.length();
        int i = 0;
        for (UnderlineSpan[] array = (UnderlineSpan[])((Spanned)editable).getSpans(0, length, (Class)UnderlineSpan.class); i < array.length; ++i) {
            ((Spannable)editable).removeSpan((Object)array[i]);
        }
        for (final hna$b hna$b : (ArrayList)b) {
            final int intValue = hna$b.b();
            final int intValue2 = hna$b.a();
            if (intValue >= 0 && intValue < intValue2 && intValue2 <= string.length()) {
                ((Spannable)editable).setSpan((Object)new qtu(this), intValue, intValue2, 33);
            }
        }
    }
    
    @Override
    public final void e(final TextView textView) {
        if (textView.getLineCount() != 0) {
            this.c(textView, (int)(textView.getLineSpacingExtra() + textView.getLineSpacingMultiplier() * textView.getLineHeight()), 0, 0);
        }
    }
    
    @Override
    public final String f(String replace, final String s) {
        replace = replace.replace(s, "");
        if (replace.trim().isEmpty()) {
            return "";
        }
        return replace;
    }
    
    @Override
    public final Set<String> g(final String s) {
        final List c = this.c.c(s);
        final dnp x = dnp.x();
        for (final String s2 : c) {
            final StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(s2);
            x.o((Object)sb.toString());
        }
        return (Set)((n4j)x).e();
    }
    
    @Override
    public final String h(String h, final String s) {
        final StringBuilder sb = new StringBuilder();
        if (h.isEmpty()) {
            h = "";
        }
        else {
            h = hmg.h(h, " ");
        }
        return ta0.z(sb, h, s, " ");
    }
}
