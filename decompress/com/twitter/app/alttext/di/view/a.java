// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.alttext.di.view;

import android.view.View;

public final class a extends gue implements rtb<View, okx<? super ny, Object, ky>>
{
    public final /* synthetic */ yl1 C0;
    public final /* synthetic */ kn D0;
    public final /* synthetic */ c7f E0;
    
    public a(final yl1 c0, final kn d0, final c7f e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        zzd.f((Object)view, "rootView");
        return new ey(view, this.C0, this.D0, this.E0);
    }
}
