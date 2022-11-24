import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tf4
{
    public static final long a;
    public static final int b = 0;
    
    static {
        a = ViewConfiguration.getTapTimeout();
    }
    
    public static final ptb<Boolean> a(final d86 d86, final int n) {
        d86.x(-1990508712);
        final sa6$b a = sa6.a;
        final sf4 sf4 = new sf4((View)d86.m((df6)z20.f));
        d86.O();
        return (ptb<Boolean>)sf4;
    }
    
    public static final boolean b(final KeyEvent keyEvent) {
        final int n = (int)(jty.d(keyEvent.getKeyCode()) >> 32);
        return n == 23 || n == 66 || n == 160;
    }
}
