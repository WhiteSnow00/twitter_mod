// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

import androidx.activity.result.ActivityResultRegistry;

public final class a implements Runnable
{
    public final int F0;
    public final jo.a G0;
    public final ComponentActivity$b H0;
    
    public a(final ComponentActivity$b h0, final int f0, final jo.a g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        final ComponentActivity$b h0 = this.H0;
        final int f0 = this.F0;
        final T a = this.G0.a;
        final String s = ((ActivityResultRegistry)h0).b.get(f0);
        if (s != null) {
            final ActivityResultRegistry.c c = (ActivityResultRegistry.c)((ActivityResultRegistry)h0).f.get(s);
            if (c != null) {
                final io<O> a2 = c.a;
                if (a2 != null) {
                    if (((ActivityResultRegistry)h0).e.remove(s)) {
                        a2.f((Object)a);
                    }
                    return;
                }
            }
            ((ActivityResultRegistry)h0).h.remove(s);
            ((ActivityResultRegistry)h0).g.put(s, a);
        }
    }
}
