// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.reminders;

import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import java.util.Objects;

public final class a
{
    public final fxe<b> a;
    public final fxe<a> b;
    public final dxf c;
    
    public a(final fxe<b> a, final fxe<a> b) {
        this.a = a;
        this.b = b;
        this.c = new dxf((Object)this, 0);
    }
    
    public final boolean a() {
        final b b = (b)this.a.get();
        return b.c.a() && tnl.a(b.b).b();
    }
    
    public final void b() {
        final a a = (a)this.b.get();
        final dxf c = this.c;
        Objects.requireNonNull(a);
        final xil$b xil$b = new xil$b(1);
        ((xil$a)xil$b).H(2131954763);
        ((xil$a)xil$b).A(2131954762);
        ((xil$a)xil$b).F(2131957590);
        ((xil$a)xil$b).C(2131955472);
        final cl1 w = ((dl1$a)xil$b).w();
        w.T1 = (mw8)c;
        final int a2 = w4j.a;
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
        public final mbi<?> a;
        public final UserIdentifier b;
        public final cjk c;
        
        public b(final mbi<?> a, final UserIdentifier b, final cjk c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
