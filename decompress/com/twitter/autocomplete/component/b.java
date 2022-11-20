// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.autocomplete.component;

import android.text.Spanned;
import java.util.Iterator;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;

@sa8(c = "com.twitter.autocomplete.component.SelectionTextViewModel$intents$2$1", f = "SelectionTextViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<vfp$a, go6<? super fzv>, Object>
{
    public Object D0;
    public final SelectionTextViewModel<Object, cep> E0;
    
    public b(final SelectionTextViewModel<Object, cep> e0, final go6<? super b> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final b b = new b(this.E0, (go6<? super b>)go6);
        b.D0 = d0;
        return (go6<fzv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final vfp$a vfp$a = (vfp$a)this.D0;
        final SelectionTextViewModel<Object, cep> e0 = this.E0;
        final Editable a = vfp$a.a;
        for (final dep dep : e0.O0.a((Spannable)a)) {
            final int spanStart = ((Spanned)a).getSpanStart((Object)dep);
            final int spanEnd = ((Spanned)a).getSpanEnd((Object)dep);
            if (spanStart > -1 && spanEnd >= spanStart) {
                final String string = ((CharSequence)a).subSequence(spanStart, spanEnd).toString();
                final String a2 = dep.a().a();
                final StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(" ");
                if (czd.a((Object)string, (Object)sb.toString())) {
                    continue;
                }
                uoz.U(a, (Object)dep);
            }
        }
        e0.Q0.a((Iterable)e0.O0.d((CharSequence)a));
        final int selectionEnd = Selection.getSelectionEnd((CharSequence)a);
        this.E0.Q((qsb)new b$a(a, selectionEnd));
        final Object a3 = ((kht)this.E0.P0).a((CharSequence)a, selectionEnd);
        if (a3 != null) {
            final SelectionTextViewModel<Object, cep> e2 = this.E0;
            e2.Q0.c(a3, (String)e2.R0.invoke(a3));
        }
        return fzv.a;
    }
}
