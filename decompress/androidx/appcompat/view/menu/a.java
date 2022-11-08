// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.content.Context;

public abstract class a implements i
{
    public Context C0;
    public Context D0;
    public e E0;
    public LayoutInflater F0;
    public i$a G0;
    public int H0;
    public int I0;
    public j J0;
    
    public a(final Context c0) {
        this.C0 = c0;
        this.F0 = LayoutInflater.from(c0);
        this.H0 = 2131623939;
        this.I0 = 2131623938;
    }
    
    public final void b(final i$a g0) {
        this.G0 = g0;
    }
    
    public final boolean c(final g g) {
        return false;
    }
    
    public final boolean f(final g g) {
        return false;
    }
}
