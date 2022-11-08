// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;

public final class a extends xmb
{
    public final /* synthetic */ AppCompatSpinner$g L0;
    public final /* synthetic */ AppCompatSpinner M0;
    
    public a(final AppCompatSpinner m0, final View view, final AppCompatSpinner$g l0) {
        this.M0 = m0;
        this.L0 = l0;
        super(view);
    }
    
    @Override
    public final w4q b() {
        return (w4q)this.L0;
    }
    
    @SuppressLint({ "SyntheticAccessor" })
    @Override
    public final boolean c() {
        if (!this.M0.getInternalPopup().isShowing()) {
            this.M0.b();
        }
        return true;
    }
}
