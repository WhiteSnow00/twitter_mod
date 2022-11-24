// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.autocomplete.component;

import android.text.Spanned;
import java.util.Iterator;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;

@vb8(c = "com.twitter.autocomplete.component.SelectionTextViewModel$intents$2$1", f = "SelectionTextViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends l1s implements hub<sgp$a, mp6<? super vzv>, Object>
{
    public Object F0;
    public final SelectionTextViewModel<Object, zep> G0;
    
    public b(final SelectionTextViewModel<Object, zep> g0, final mp6<? super b> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final b b = new b(this.G0, (mp6<? super b>)mp6);
        b.F0 = f0;
        return (mp6<vzv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final sgp$a sgp$a = (sgp$a)this.F0;
        final SelectionTextViewModel<Object, zep> g0 = this.G0;
        final Editable a = sgp$a.a;
        for (final afp afp : g0.Q0.a((Spannable)a)) {
            final int spanStart = ((Spanned)a).getSpanStart((Object)afp);
            final int spanEnd = ((Spanned)a).getSpanEnd((Object)afp);
            if (spanStart > -1 && spanEnd >= spanStart) {
                final String string = ((CharSequence)a).subSequence(spanStart, spanEnd).toString();
                final String a2 = afp.a().a();
                final StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(" ");
                if (e0e.a((Object)string, (Object)sb.toString())) {
                    continue;
                }
                eg8.B0(a, afp);
            }
        }
        g0.S0.a((Iterable)g0.Q0.d((CharSequence)a));
        final int selectionEnd = Selection.getSelectionEnd((CharSequence)a);
        this.G0.Q((stb)new b$a(a, selectionEnd));
        final Object a3 = ((dit)this.G0.R0).a((CharSequence)a, selectionEnd);
        if (a3 != null) {
            final SelectionTextViewModel<Object, zep> g2 = this.G0;
            g2.S0.c(a3, (String)g2.T0.invoke(a3));
        }
        return vzv.a;
    }
}
