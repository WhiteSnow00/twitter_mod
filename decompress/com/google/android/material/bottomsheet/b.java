// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.bottomsheet;

import androidx.fragment.app.Fragment;
import android.app.Dialog;
import android.os.Bundle;

public class b extends hk0
{
    public Dialog a2(final Bundle bundle) {
        return (Dialog)new a(((Fragment)this).N0(), ((cw8)this).E1);
    }
    
    public final void dismiss() {
        final Dialog k1 = ((cw8)this).K1;
        if (k1 instanceof a) {
            final boolean g = ((a)k1).l().G;
        }
        ((cw8)this).Z1(false, false);
    }
}
