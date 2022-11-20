// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.reminders;

import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import java.util.Objects;

public final class a
{
    public final pwe<b> a;
    public final pwe<a> b;
    public final pwf c;
    
    public a(final pwe<b> a, final pwe<a> b) {
        this.a = a;
        this.b = b;
        this.c = new pwf(this, 0);
    }
    
    public final boolean a() {
        final b b = (b)this.a.get();
        return b.c.b() && hol.a(b.b).b();
    }
    
    public final void b() {
        final a a = (a)this.b.get();
        final pwf c = this.c;
        Objects.requireNonNull(a);
        final kjl$b kjl$b = new kjl$b(1);
        ((kjl$a)kjl$b).H(2131954763);
        ((kjl$a)kjl$b).A(2131954762);
        ((kjl$a)kjl$b).F(2131957590);
        ((kjl$a)kjl$b).C(2131955472);
        final wk1 w = ((xk1$a)kjl$b).w();
        w.U1 = (xv8)c;
        final int a2 = c5j.a;
        w.l2(a.a);
    }
    
    public static final class a
    {
        public final p a;
        
        public a(final p a) {
            this.a = a;
        }
    }
    
    public static final class b
    {
        public final obi<?> a;
        public final UserIdentifier b;
        public final hjk c;
        
        public b(final obi<?> a, final UserIdentifier b, final hjk c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
