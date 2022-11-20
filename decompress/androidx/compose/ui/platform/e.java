// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ViewGroup;
import java.lang.reflect.Field;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import android.util.Log;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.view.View;
import android.os.Build$VERSION;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;

public final class e
{
    public static final ViewGroup$LayoutParams a;
    
    static {
        a = new ViewGroup$LayoutParams(-2, -2);
    }
    
    public static final pd6 a(final eb eb, final qd6 qd6, final ftb<? super x66, ? super Integer, fzv> ftb) {
        czd.f((Object)eb, "<this>");
        czd.f((Object)qd6, "parent");
        final e4c a = e4c.a;
        final AtomicBoolean b = e4c.b;
        final boolean b2 = false;
        final boolean compareAndSet = b.compareAndSet(false, true);
        final pd6 pd6 = null;
        if (compareAndSet) {
            final yo3 e = g97.e(-1, (vq2)null, 6);
            Objects.requireNonNull(j70.Companion);
            as2.M(sh4.b((sx6)j70.P0.getValue()), (sx6)null, 0, (ftb)new c4c(e, (go6)null), 3);
            final thq$a companion = thq.Companion;
            final d4c d4c = new d4c((yo3<fzv>)e);
            Objects.requireNonNull(companion);
            synchronized (yhq.c) {
                yhq.h.add(d4c);
                monitorexit(yhq.c);
                yhq.a();
            }
        }
        AndroidComposeView androidComposeView = null;
        Label_0180: {
            if (((ViewGroup)eb).getChildCount() > 0) {
                final View child = ((ViewGroup)eb).getChildAt(0);
                if (child instanceof AndroidComposeView) {
                    androidComposeView = (AndroidComposeView)child;
                    break Label_0180;
                }
            }
            else {
                ((ViewGroup)eb).removeAllViews();
            }
            androidComposeView = null;
        }
        AndroidComposeView androidComposeView2 = androidComposeView;
        if (androidComposeView == null) {
            final Context context = ((View)eb).getContext();
            czd.e((Object)context, "context");
            androidComposeView2 = new AndroidComposeView(context);
            eb.addView(androidComposeView2.getView(), e.a);
        }
        int n = b2 ? 1 : 0;
        if (Build$VERSION.SDK_INT >= 29) {
            n = (b2 ? 1 : 0);
            if (bux.a.a((View)androidComposeView2).isEmpty() ^ true) {
                n = 1;
            }
        }
        if (n != 0) {
            ((View)androidComposeView2).setTag(2131429620, (Object)Collections.newSetFromMap(new WeakHashMap<Object, Boolean>()));
            final wrd$a a2 = wrd.a;
            try {
                final Field declaredField = wrd.class.getDeclaredField("b");
                declaredField.setAccessible(true);
                declaredField.setBoolean(null, true);
            }
            catch (final Exception ex) {
                Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
            }
        }
        final pd6 a3 = ud6.a((qr0<?>)new psv(androidComposeView2.getRoot()), qd6);
        final Object tag = androidComposeView2.getView().getTag(2131432670);
        WrappedComposition wrappedComposition = (WrappedComposition)pd6;
        if (tag instanceof WrappedComposition) {
            wrappedComposition = (WrappedComposition)tag;
        }
        WrappedComposition wrappedComposition2;
        if ((wrappedComposition2 = wrappedComposition) == null) {
            wrappedComposition2 = new WrappedComposition(androidComposeView2, a3);
            androidComposeView2.getView().setTag(2131432670, (Object)wrappedComposition2);
        }
        wrappedComposition2.g(ftb);
        return (pd6)wrappedComposition2;
    }
}
