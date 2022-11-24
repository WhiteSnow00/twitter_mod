// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

import java.util.Iterator;
import android.annotation.SuppressLint;
import androidx.lifecycle.d;
import androidx.lifecycle.d$c;
import java.util.ArrayDeque;

public final class OnBackPressedDispatcher
{
    public final Runnable a;
    public final ArrayDeque<jhj> b;
    
    public OnBackPressedDispatcher(final Runnable a) {
        this.b = new ArrayDeque<jhj>();
        this.a = a;
    }
    
    @SuppressLint({ "LambdaLast" })
    public final void a(final tbf tbf, final jhj jhj) {
        final d b = tbf.b();
        if (b.b() == d$c.F0) {
            return;
        }
        jhj.b.add((og3)new OnBackPressedDispatcher.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, b, jhj));
    }
    
    public final void b() {
        final Iterator<jhj> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            final jhj jhj = descendingIterator.next();
            if (jhj.a) {
                jhj.a();
                return;
            }
        }
        final Runnable a = this.a;
        if (a != null) {
            a.run();
        }
    }
}
