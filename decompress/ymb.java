import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ymb implements nj6
{
    public final int a;
    public final Object b;
    
    public ymb(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void accept(final Object o) {
        switch (this.a) {
            default: {
                final mn2$a mn2$a = (mn2$a)this.b;
                final String s = (String)o;
                final int f = ff8.f;
                ((nn2)mn2$a).a(s);
                return;
            }
            case 0: {
                final cnb cnb = (cnb)this.b;
                final Intent intent = (Intent)o;
                cnb.Q0.a();
            }
        }
    }
}
